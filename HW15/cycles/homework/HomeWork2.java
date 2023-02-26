package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

import static java.awt.SystemColor.text;

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
        Scanner number = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Введіть число");
            int curNumber = number.nextInt();
            sum +=curNumber;
            System.out.println("Якщо ви хочете завершити, напишіть Exit");
            String exit = text.nextLine();
            if (text.equals("Exit"))
                break;
        }
        System.out.println(sum);
    }
}
