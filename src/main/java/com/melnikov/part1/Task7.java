package com.melnikov.part1;

import com.melnikov.utills.JOptionPaneIntegerInputValidator;

import javax.swing.*;

//Немного усовершенствовал инпуты, чтобы программа не валилась, если введеные числа не соответсвуют требованиям или если вместо чисел вбили текст или ничего не вбили.
public class Task7 {
    public static void main(String[] args) {
        String firstValue = JOptionPaneIntegerInputValidator.getValue("Введите первое число");
            String secondValue = JOptionPaneIntegerInputValidator.getValue("Введите второе число");

        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);

        if (b == 0){
            JOptionPane.showInputDialog("Бесконечность");
        }
        else{
            JOptionPane.showInputDialog("Результат вычисления: " + (a / b));
        }


    }
}
