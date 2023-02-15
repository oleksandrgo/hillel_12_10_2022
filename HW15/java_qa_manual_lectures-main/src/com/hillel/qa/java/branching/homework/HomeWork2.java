package com.hillel.qa.java.branching.homework;

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
        int x = 7;
        int y = -9;
        String quadrant;

        if (x == 0 || y == 0)
        {
            quadrant = "Target is on the coordinate axis.";
        }
        else if (x > 0 && y > 0)
        {
            quadrant = "Target is in 1 quadrant.";
        }
        else if (x < 0 && y > 0)
        {
            quadrant = "Target is in 2 quadrant.";
        }
        else if (x < 0 && y < 0) {
            quadrant = "Target is in 3 quadrant.";
        }
        else {
            quadrant = "Target is in 4 quadrant.";
        }

        System.out.println(quadrant);
    }
}

