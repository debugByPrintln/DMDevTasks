package com.melnikov.part2.Task5;

public class MyMath {
    private static int counter;

    public static double add(double a, double b){
        counter++;
        return a + b;
    }

    public static double sub(double a, double b){
        counter++;
        return a - b;
    }

    public static double mult(double a, double b){
        counter++;
        return a * b;
    }

    public static double div(double a, double b){
        counter++;
        return a / b;
    }

    public static int getCounter() {
        return counter;
    }
}
