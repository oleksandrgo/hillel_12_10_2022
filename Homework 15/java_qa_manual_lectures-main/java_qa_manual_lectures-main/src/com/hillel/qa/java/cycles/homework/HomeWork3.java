package com.hillel.qa.java.cycles.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
     * Обовʼязково використовуйте continue
     * </p>
     */
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if ((i % 3) == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
