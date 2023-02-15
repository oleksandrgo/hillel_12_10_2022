package com.hillel.qa.java.cycles.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
     * Обовʼязково використовуйте continue
     * </p>
     */
    public static void main(String[] args) {
        int sum = 0;

        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0) {
                continue;
            }
            sum += a;
        }

        System.out.println("The sum is: " + sum);

    }
}
