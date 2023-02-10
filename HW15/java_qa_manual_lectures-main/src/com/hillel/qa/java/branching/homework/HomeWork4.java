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
        Scanner sideA = new Scanner(System.in);
        Scanner sideB = new Scanner(System.in);
        Scanner sideC = new Scanner(System.in);

        System.out.println("Введіть довжину сторони трикутника (А): ");
        int a = sideA.nextInt();
        System.out.println("Введіть довжину сторони трикутника (B): ");
        int b = sideB.nextInt();
        System.out.println("Введіть довжину сторони трикутника (C): ");
        int c = sideC.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Трикутник не можливо побудувати");
        } else System.out.println("Трикутник можливо побудувати");
    }
}
