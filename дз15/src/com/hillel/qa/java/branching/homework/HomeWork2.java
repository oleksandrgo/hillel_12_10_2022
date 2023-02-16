package com.hillel.qa.java.branching.homework;

import java.util.Scanner;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     *     Згадаймо математику та систему координат.
     *     Необхідно написати програму в якій будуть дві зміні x, y.
     *     Програма повинна казати в якій чверті знаходиться ціль згідно зміним x, y.
     *     В консоль повинно виводиться - "Ціль знаходиться в (номер чверті)!",
     *     врахуйте обробку якщо x, y будуть 0.
     * </p>
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ціль");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if ((x > 0) && (y > 0))
            System.out.println("Ціль знаходить у 1 четверті");
        else
        {
            if ((x < 0) && (y > 0))
                System.out.println("Ціль знаходиться у 2 четверті");
            else
            {
                if ((x == 0) && (y == 0))
                    System.out.println("Ви на початку");
            }
            }
        }
    }
