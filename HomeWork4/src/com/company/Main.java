package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWinDiagonal(DOT_X)) {
                System.out.println("Победил человек");
                break;
            } else if (checkWinVerticalAndHorizontLines(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWinDiagonal(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            } else if (checkWinVerticalAndHorizontLines(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWinDiagonal(char symb) {
        boolean rightDiagonal, leftDiagonal;
        rightDiagonal = true;
        leftDiagonal = true;
        for (int i = 0; i < SIZE; i++) {
            rightDiagonal &= (map[i][i] == symb);
            leftDiagonal &= (map[SIZE - 1 - i][i] == symb);
        }
        if (rightDiagonal || leftDiagonal)
            return true;
        return false;
    }

    public static boolean checkWinVerticalAndHorizontLines(char symb) {
        boolean lineHorizont, lineVertical;
        for (int i = 0; i < SIZE; i++) {
            lineHorizont = true;
            lineVertical = true;
            for (int j = 0; j < SIZE; j++) {
                lineHorizont &= (map[i][j] == symb);
                lineVertical &= (map[j][i] == symb);
            }
            if (lineHorizont || lineVertical) return true;
        }
        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;
        if (map[x][y] == DOT_EMPTY)
            return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

}
