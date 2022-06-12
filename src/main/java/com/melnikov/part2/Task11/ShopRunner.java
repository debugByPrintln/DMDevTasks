package com.melnikov.part2.Task11;

public class ShopRunner {
    public static void main(String[] args) {
        Shop<Integer> integerShop = new Shop<>(new Integer[]{1, 2, 3, 4, 5});
        Shop<String> stringShop = new Shop<>(new String[]{"A", "B", "C", "D", "E"});

        System.out.println(integerShop);
        System.out.println(stringShop);
    }
}
