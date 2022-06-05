package com.melnikov.part1;

import com.melnikov.utills.JOptionPaneIntegerInputValidator;

import javax.swing.*;

public class Task8 {
    public static void main(String[] args) {
        String s = JOptionPaneIntegerInputValidator.getValue("Введите число:");

        int a = Integer.parseInt(s);
        int res = 0;

        for (int i = 1; i < a+1; i++) {
            res += i;
        }

        JOptionPane.showInputDialog(res);
    }
}
