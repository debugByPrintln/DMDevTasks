package com.melnikov.part1;

import com.melnikov.utils.JOptionPaneIntegerInputValidator;

import javax.swing.*;

public class Task9 {
    public static void main(String[] args) {
        String s = JOptionPaneIntegerInputValidator.getValue("Введите число");

        long a = Long.parseLong(s);

        if (a == 1 || a == 0){
            JOptionPane.showInputDialog("1");
            System.exit(0);
        }

        long fact = 1;
        long counter = 1;

        while (counter <= a){
            fact *= counter;
            counter++;
        }

        JOptionPane.showInputDialog(fact);
    }
}
