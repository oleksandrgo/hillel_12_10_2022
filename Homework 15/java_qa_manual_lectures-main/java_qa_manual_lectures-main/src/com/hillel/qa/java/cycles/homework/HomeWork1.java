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
        boolean isExit = false;
        String s = console.nextLine();
        int i = 10;
        while (!isExit) {
            System.out.println(s + " найкраще авто");
            i--;
            if (i<0){
            isExit = true;}

        }
        }
    }

