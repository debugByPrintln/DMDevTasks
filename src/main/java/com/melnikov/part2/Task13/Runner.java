package com.melnikov.part2.Task13;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{4, 6, 12, 43, 2, 1, 7, 90, 88, 11};

        Object[] array = Arrays.stream(ints)
                .sorted(Integer::compare)
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}
