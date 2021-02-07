package com.company;

import java.util.Random;
import java . util . Scanner ;

public class Main {

    public static final int NUMB_ATTEMPTS = 3;
    public static final int MAX_NUMB_RANDOM = 10;

    public static Scanner scanUserNumber = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(">>>========Угадайте число в пределах от 0 до 9 с трёх попыток========<<<");
        String repeatAnswer;

        do {
            int randomNumber = random.nextInt(MAX_NUMB_RANDOM);

            for (int i = 0; i < NUMB_ATTEMPTS; i++) {
                System.out.println("Угадайте число! Осталось попыток: " + (NUMB_ATTEMPTS - i));
                System.out.print("Введите число: ");
                int enteredNumber = scanUserNumber.nextInt();

                if (randomNumber == enteredNumber) {
                    System.out.println("Поздравляем, Вы угадали! Загаданное число: [ " + randomNumber + " ]");
                    break;

                } else if (randomNumber < enteredNumber) {
                    System.out.println("Загаданное число меньше! Попробуйте еще раз!");

                } else if (randomNumber > enteredNumber) {
                    System.out.println("Загаданное число больше! Попробуйте еще раз!");

                } if (i == NUMB_ATTEMPTS - 1) {
                    System.out.println("К сожалению, Вы проиграли.. Загаданное число: [ " + randomNumber + " ]");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            System.out.print("Введите 1 или 0: ");
            repeatAnswer = scanUserNumber.next();
        } while (repeatAnswer.equals("1"));

        scanUserNumber.close();
    }
}