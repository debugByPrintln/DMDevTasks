package com.melnikov.part1;

import com.melnikov.utills.JOptionPaneIntegerInputValidator;

public class Task10 {
    public static void main(String[] args) {
        int i = -1;
        do {
            String s = JOptionPaneIntegerInputValidator.getValue("Введите положительное число");
            i = Integer.parseInt(s);
        }while (i < 0);
    }
}
