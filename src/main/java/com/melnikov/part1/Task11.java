package com.melnikov.part1;

import com.melnikov.utills.JOptionPaneIntegerInputValidator;

import javax.swing.*;

public class Task11 {
    public static void main(String[] args) {
        String s1 = JOptionPaneIntegerInputValidator.getValue("Введите первое число");
        String s2 = JOptionPaneIntegerInputValidator.getValue("Введите второе число");

        int first = Integer.parseInt(s1);
        int second = Integer.parseInt(s2);

        String operator = JOptionPane.showInputDialog("Введите оператор");

        switch (operator){
            case "+":
                JOptionPane.showInputDialog(first + second);
                break;
            case "-":
                JOptionPane.showInputDialog(first - second);
                break;
            case "*":
                JOptionPane.showInputDialog(first * second);
                break;
            case "/":
                JOptionPane.showInputDialog(first / second);
                break;
            default:
                JOptionPane.showInputDialog("Вы ввели некоректный оператор");
        }
    }
}
