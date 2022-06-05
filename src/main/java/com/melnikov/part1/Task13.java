package com.melnikov.part1;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {5, 2, 1},
                {2, 3, 2},
        };

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println(sum);

        int[] secondArr = new int[2];
        secondArr[0] = getSum(array[0]);
        secondArr[1] = getSum(array[1]);

        System.out.println(Arrays.toString(secondArr));
    }

    private static int getSum(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }
}
