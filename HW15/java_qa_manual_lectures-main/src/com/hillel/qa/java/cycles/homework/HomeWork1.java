package com.hillel.qa.java.cycles.homework;
import java.util.Scanner;
public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Введіть вашу улюблену марку авто");
        Scanner myCar = new Scanner(System.in);
        String carModel = myCar.nextLine();
        while (i <= 10){
            System.out.println(carModel + " найкраще авто");
            i++;
        }
    }
}
