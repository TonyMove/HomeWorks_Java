package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public int[] getValuesAfterLastFour(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return getSliceArray(i + 1, arr);
            }
        }
        throw new RuntimeException();
    }

    private int[] getSliceArray(int fromIndex, int[] originalArray) {
        int[] resultArray = new int[originalArray.length - fromIndex];

        for (int i = fromIndex, j = 0; i < originalArray.length; i++, j++) {
            resultArray[j] = originalArray[i];
        }

        return resultArray;
    }

    public boolean findOneorFourNumberInArray(int[] arr) {
        boolean countOne = false;
        boolean countFour = false;

        for (int el : arr) {
            if (el == 4) {
                countFour = true;
            } else if (el == 1) {
                countOne = true;
            } else {
                return false;
            }
        }

        return countOne && countFour;
    }
}