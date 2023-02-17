package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, в яку потрібно вводити з клавіатури цілі числа й рахувати їх суму,
     * якщо користувач введе слово "Exit", закінчуємо програму. Вивести на екран отриману суму й завершити програму.
     * Використовуйте цикл while().
     * </p>
     * <br>
     * <h2>Підказка</h2>
     *
     * @see <a href="https://www.w3schools.blog/string-to-int-java">String To Int In Java</a>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            String f = console.nextLine();
            if (f.equals("exit")) {
                isExit = true;
            } else {
                int number = Integer.parseInt(f);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
