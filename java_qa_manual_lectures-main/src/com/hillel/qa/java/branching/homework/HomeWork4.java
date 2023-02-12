package com.hillel.qa.java.branching.homework;
import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, яка буде рахувати можливість існування трикутника,
     * виходячи з довжин його сторін.
     * Вимоги:
     *     <ol style="font-size:12px">
     *         <li>Ввести з клавіатури три числа — довжини сторін передбачуваного трикутника.
     *         Для того щоб це зробити самостійно гляньте як працює Scanner scanner = new Scanner(System.in);</li>
     *         <li>Визначити можливість існування трикутника з даними сторонами.</li>
     *         <li> Результат вивести на екран : "Трикутник можливо побудувати" або "Трикутник не можливо побудувати".</li>
     *     </ol>
     * </p>
     *
     * @see <a href="https://www.w3schools.com/java/java_user_input.asp">Стаття як користуватися Scanner</a>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type A side of a triangle: ");
        int a = scanner.nextInt();

        System.out.println("Type B side of a triangle: ");
        int b = scanner.nextInt();

        System.out.println("Type C side of a triangle: ");
        int c = scanner.nextInt();

        boolean isPossibleToBuildTriangle =  b >= a + c
                || a >= b + c
                || c >= a + b;

        String resultMessage = isPossibleToBuildTriangle
                ? "It's possible to build a triangle"
                : "It's not possible to build a triangle";

        System.out.println(resultMessage);
    }
}
