package com.hillel.qa.java.cycles.homework;

import java.util.Scanner;

public class HomeWork4{
    /**
     * <p style="font-size:12px">
     * Намалюйте в консолі прямокутний трикутник із зірочок
     * (або плюсиків, або будь-якого другого символу):
     * на першому рядку - одна зірочка, на другій дві, і так далі.
     * </p>
     * <br>
     * <h2>Вимоги</h2>
     * <ol style="font-size:12px">
     *     <li>Висоту та символ трикутника отримати з клавіатури</li>
     *     <li>Висота трикутника дорівнює висоті яку ми отримали з клавіатури</li>
     *     <li>Трикутник малювати символом який отримали з клавіатури</li>
     *     <li>Використовувати цикл for</li>
     * </ol>
     * <br>
     * <h2>Приклад</h2>
     * <p style="font-size:12px">
     *     Наприклад ввели з клавіатури число 4 та символ "+"
     *     <br>
     *     Вивід:
     *      <br>
     *     +
     *     <br>
     *     ++
     *      <br>
     *     +++
     *     <br>
     *     ++++
     * </p>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int g = console.nextInt();

        for (int i = 0; i < g; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(s);
            }

            System.out.println();


            }

        }

    }



      /*  public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            String s = console.nextLine();
                int n = console.nextInt();

            for (int i = 0; i <= n; ++i) {
                s += "*";
                System.out.println(s);
            }
        }
        }*/
