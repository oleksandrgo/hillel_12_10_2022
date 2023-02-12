package com.hillel.qa.java.cycles.homework;
import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        System.out.println("Please type a car you like: ");
        String car = scanner.nextLine();

        while (index < 10) {
            System.out.println(car + " the best auto :) ");

            index++;
        }
    }
}
