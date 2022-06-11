package com.melnikov.part2.Task5;

public class MyMathRunner {
    public static void main(String[] args) {
        System.out.println("Counter: " + MyMath.getCounter());

        System.out.println(MyMath.add(3.0, 4.2));

        System.out.println("Counter: " + MyMath.getCounter());

        System.out.println(MyMath.sub(3.0, 1.5));

        System.out.println("Counter: " + MyMath.getCounter());

        System.out.println(MyMath.mult(3.0, 4.0));

        System.out.println("Counter: " + MyMath.getCounter());

        System.out.println(MyMath.div(3.0, 1.5));

        System.out.println("Counter: " + MyMath.getCounter());
    }
}
