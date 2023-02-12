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
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        boolean isExit = false;

        while (!isExit) {
            System.out.println("Please type a number or exit: ");
            String input = scanner.next();

            if (input.equals("exit")) {
                System.out.println("The sum of numbers is  " + result);

                isExit = true;
            } else {
                result = Integer.parseInt(input) + result;
            }
        };
    }
}
