package com.hillel.qa.java.comparison_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Зробіть так щоб виведення в консоль було false.
     * </p>
     * <h1>Вимоги:</h1>
     * <ol style="font-size:12px">
     *     <li>Не змінювати зміні a, b</li>
     *     <li>Не чіпати знак ></li>
     * </ol>
     */
    public static void main(String[] args) {
        int sum = (1 + 100) * 100 / 2;
        double average = (double) sum / 100;
        System.out.println("Середнє арифметичне суми чисел від 1 до 100: " + average);
    }
}
