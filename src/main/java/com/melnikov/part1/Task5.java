package com.melnikov.part1;

public class Task5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(a&&!(b||c));
        System.out.println((a||b)&&c);
        System.out.println(a^(b||c));
    }
}
