package com.melnikov.part1;

public class Task3 {
    public static void main(String[] args) {
        double a = 5.4;
        double b = 10.3;

        double sum = a+b;
        double diff = a-b;
        double mult = a*b;
        double div = a/b;
        System.out.println(sum + "\n" + diff + "\n" + mult + "\n" + div);

        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        a = a + 5;
        a += 5;
        System.out.println(a);

        int c = 8;
        System.out.println(8 % 3);
    }
}
