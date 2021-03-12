package com.company;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        handleArrayElements();
        handleArrayElementsWithTwoThreads();
    }

    public static void handleArrayElements() {
        float[] array = new float[SIZE];
        fillArray(array, 1);

        long startTime = System.currentTimeMillis();

        calculateFormula(array, SIZE);

        System.out.println("Расчет времени однопоточного исполнения : " + (System.currentTimeMillis() - startTime));
    }

    public static void handleArrayElementsWithTwoThreads() {
        float[] array = new float[SIZE];
        fillArray(array, 1);

        long startTime = System.currentTimeMillis();

        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];

        System.arraycopy(array, 0, array1, 0, HALF);
        System.arraycopy(array, HALF, array2, 0, HALF);

        Thread thread1 = new Thread(() -> calculateFormula(array1, HALF));
        Thread thread2 = new Thread(() -> calculateFormula(array2, HALF));

        thread1.start();
        thread2.start();

        joinThreads(thread1, thread2);

        System.arraycopy(array1, 0, array, 0, HALF);
        System.arraycopy(array2, 0, array, HALF, HALF);

        System.out.println("Расчет времени двухпоточного исполнения : " + (System.currentTimeMillis() - startTime));

    }

    private static void fillArray(float[] array, float value) {
        Arrays.fill(array, value);
    }

    private static void calculateFormula(float[] array, int size) {
        for (int i = 0; i < size; i++) {
            array[i] = (float) (
                    array[i]
                            * Math.sin(0.2f + (float) i / 5)
                            * Math.cos(0.2f + (float) i / 5)
                            * Math.cos(0.4f + (float) i / 2)
            );
        }
    }

    private static void joinThreads(Thread... threads) {
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
