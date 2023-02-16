package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String carBrand = console.nextLine();
        int n = 10;
        while (n > 0) {
            System.out.println(carBrand + " найкраще авто.");
            n --;
        }
    }
}
