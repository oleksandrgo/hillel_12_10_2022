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
        Scanner myNum1 = new Scanner(System.in);
        Scanner myNum2 = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        int sum;
        boolean isExit = false;

        while (!isExit) {
            System.out.println("Введите первое целое число");
            int num1 = myNum1.nextInt();

            System.out.println("Введите второе целое число");
            int num2 = myNum2.nextInt();

            sum = num1 + num2;
            System.out.println("Сумма двух чисел равна "+ sum);

            String exit = console.nextLine();
            isExit = exit.equals("exit");
        }
    }
}
