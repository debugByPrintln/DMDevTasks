package com.melnikov.part2.Task14;

public class Runner {
    public static void main(String[] args) {
        //First part
        go(100);

        //Second part (Sorry, no recursion)
        int p2 = 1539;
        int c = (int) Math.ceil(Math.log10(p2));
        int d = (int) Math.ceil(Math.log10(p2));
        for (int i = 0; i < c; i++) {
            int r = (int) Math.pow(10, d-1);
            int n = p2/r;
            System.out.println(n);
            p2 = p2 % r;
            d--;
        }
    }

    private static void go(int i){
        int x = 1;

// блок try проверяет, достигли ли мы нуля
        try {
            int m = x / i;				// здесь выбрасывается исключение при i = 0
            System.out.println(i);
            i--;
            go(i);				// а вот и рекурсивный вызов
        }
        catch(ArithmeticException e) {
            // деление на нуль выбрасывает ArithmeticException
            return;					// Останавливается при попытке деления на нуль
        }
    }


}
