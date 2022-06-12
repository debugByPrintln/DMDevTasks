package com.melnikov.part2.Task7;

public class MyLineRunner {
    public static void main(String[] args) {
        MyLine line = new MyLine(5, 7, 10, 3);

        int xs = line.getStartPoint().getX();
        int ys = line.getStartPoint().getY();
        int xe = line.getEndPoint().getX();
        int ye = line.getEndPoint().getY();

        System.out.println("Начальная точка (" + xs + ", " + ys + "); Конечная точка (" + xe + ", " + ye +");");
    }
}
