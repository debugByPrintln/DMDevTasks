package com.melnikov.part1;

import javax.swing.*;

public class Task12 {
    public static void main(String[] args) {
        double[] array = new double[]{5.1, 4.2, 3.1, 6.3, 10.4};
        int counter = 0;
        double sum = 0;
        double mult = 1;

        while (counter != array.length){
            sum += array[counter];
            counter++;
        }

        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }

        JOptionPane.showInputDialog("Сумма: " + sum + "; Произведение: " + mult);
        System.exit(0);
    }
}
