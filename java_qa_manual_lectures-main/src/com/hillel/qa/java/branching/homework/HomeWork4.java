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
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);

        System.out.println("Type A side of a triangle: ");
        int a = scannerA.nextInt();

        System.out.println("Type B side of a triangle: ");
        int b = scannerB.nextInt();

        System.out.println("Type C side of a triangle: ");
        int c = scannerC.nextInt();

        if (b >= a + c || a >= b + c || c >= a + b) {
            System.out.println("It's possible to build a triangle");
        } else {
            System.out.println("It's not possible to build a triangle");
        }
    }
}
