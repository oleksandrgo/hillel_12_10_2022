package com.hillel.qa.java.cycles.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
     * Обовʼязково використовуйте continue
     * </p>
     */
    public static void main(String[] args) {
        int index = 0;
        int total = 0;

        while (index < 100) {
            index++;

            if ((index % 3) == 0)
                continue;

            total = (total + index);
        }

        System.out.println(total);
    }
}
