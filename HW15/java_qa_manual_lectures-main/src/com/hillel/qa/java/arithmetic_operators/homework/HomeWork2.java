package com.hillel.qa.java.arithmetic_operators.homework;

public class HomeWork2 {
    /**
     * <p style="font-size:12px">
     * У змінній number записане число.
     * У змінну lastDigit потрібно записати останню цифру цього числа.
     * </p>
     * <br>
     * <h2>Вимоги:</h2>
     *  <ul>
     *      <li>Останню цифру необхідно отримати математичним шляхом, а не просто вписати цифру 8.</li>
     *      <li>Програма повинна виводити на екран значення змінної lastDigit.</li>
     *  </ul>
     */
    public static void main(String[] args) {
        final int number = 278;
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}
