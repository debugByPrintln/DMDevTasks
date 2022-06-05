package com.melnikov.utills;

import javax.swing.*;

public class JOptionPaneIntegerInputValidator {
    public static String getValue(String message){
        String s = JOptionPane.showInputDialog(message);
        if (!JOptionPaneIntegerInputValidator.isCorrectString(s)){
            s = getValue("Вы ввели неправильные данные. Пожалуйста, введите нормальные данные");
        }
        return s;
    }

    private  static boolean isCorrectString(String s){
        if(!s.equals("")){
            try{
                Integer.parseInt(s);
                return true;
            }
            catch (Exception e){
                return false;
            }
        }
        else {
            return false;
        }
    }
}
