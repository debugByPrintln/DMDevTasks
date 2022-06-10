package com.melnikov.part1;

import com.melnikov.utils.JOptionPaneIntegerInputValidator;

import javax.swing.*;

public class Task9 {
    public static void main(String[] args) {
        String s = JOptionPaneIntegerInputValidator.getValue("Введите число");

        int a = Integer.parseInt(s);

        if (a == 1 || a == 0){
            JOptionPane.showInputDialog("1");
            System.exit(0);
        }

        int fact = 1;
        int counter = 1;

        while (counter <= a){
            fact *= counter;
            counter++;
        }

        JOptionPane.showInputDialog(fact);
    }
}
