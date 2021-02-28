package com.company;

import com.company.exception.MyArrayDataException;
import com.company.exception.MyArraySizeException;

public class Main {

    public static void main(String[] args) {
        final int requiredMatrixSize = 4;

//        String[][] arrayMatrix = new String[requiredMatrixSize][requiredMatrixSize];
        String[][] arrayMatrix = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "p"}};

        try {
            int sumValues = castArrayValuesToInt(arrayMatrix, requiredMatrixSize);
            System.out.println(sumValues);

        } catch (MyArrayDataException dataException) {
            System.err.println("Ошибка во время преобразования данных!");

        } catch (MyArraySizeException arraySizeException) {
            System.err.println("Некорректный размер массива!");

        }
    }

    private static int castArrayValuesToInt(String[][] numStrings, int requiredSize) {
        if (matrixIsNotSquare(numStrings, requiredSize)) {
            throw new MyArraySizeException();
        }

        int result = 0;
        for (int i = 0; i < numStrings.length; i++) {
            for (int j = 0; j < numStrings[i].length; j++) {
                result += tryParseAndGetValue(numStrings, i, j);
            }
        }

        return result;

    }

    private static int tryParseAndGetValue(String[][] numStrings, int rowIndex, int columnIndex) {
        try {
            return Integer.parseInt(numStrings[rowIndex][columnIndex]);
        } catch (Exception exception) {
            throw new MyArrayDataException("Ошибка в " + rowIndex + " " + columnIndex);
        }
    }

    private static boolean matrixIsNotSquare(String[][] array, int size) {
        if (array.length != size) {
            return true;
        }

        for (String[] values : array) {
            if (values.length != size) {
                return true;
            }
        }
        return false;
    }
}
