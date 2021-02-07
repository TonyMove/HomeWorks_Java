package com.company;

public class Main {

    public static void main(String[] args) {
        allTypeOfVariables();
        System.out.println(calcFourTypesNumb(5, 4, 10, 5));
        System.out.println(sumOfTwoNumbMore10AndLess20(13, 7));
        positiveOrNegativeNumber(0);
        System.out.println(trueNegativeOrFalsePositiveNumber(-1));
        writeName("Андрей");
        yearLeapOrNot(2021);
    }

    private static void allTypeOfVariables() {
        byte _b = 5;
        short _s = 445;
        int _i = 56748;
        long _l = 1242657L;
        float _f = 43.56f;
        double _d = 562.3726;
        char _c = '$';
        boolean _bl = true;
        System.out.println("Задание 2" + "\nРезультаты переменных:");
        System.out.println("byte = " + _b);
        System.out.println("short = " + _s);
        System.out.println("int = " + _i);
        System.out.println("long = " + _l);
        System.out.println("float = " + _f);
        System.out.println("double = " + _d);
        System.out.println("char = " + _c);
        System.out.println("boolean = " + _bl);
    }

    private static float calcFourTypesNumb(float a, float b, float c, float d) {
        System.out.println("\nЗадание 3" + "\na * (b + (c / d) = ");
        return a * (b + (c / d));
    }

    private static boolean sumOfTwoNumbMore10AndLess20(int a, int b) {
        System.out.println("\nЗадание 4");
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    private static void positiveOrNegativeNumber(int a) {
        System.out.println("\nЗадание 5");
        if (a < 0)
            System.out.println("Число отрицательное");
        else
            System.out.println("Число положительное");
    }

    private static boolean trueNegativeOrFalsePositiveNumber(int a) {
        System.out.println("\nЗадание 6");
        return a < 0;
    }

    private static void writeName(String name){
        System.out.println("\nЗадание 7");
        System.out.println("Привет, " + name);
    }

    private static void yearLeapOrNot(int year){
        System.out.println("\nЗадание 8");
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }
}


