package com.hillel.qa.java.branching.homework;

import java.util.Scanner;

public class HomeWork3 {
    /**
     * <h1>Вимоги</h1>
     * <p style="font-size:12px">
     * 1. Оплата за товар проводитиметься способами:
     * <br>
     * - готівкою, додаткова комісія не стягується;
     * <br>
     * - карткою, стягується додаткова комісія 2% від суми купівлі.
     * <br>
     * - за рахунком, стягується додаткова комісія 5% від суми купівлі.
     * <br>
     * 2. Сума купівлі (призначити самостійно) сплачена карткою.
     * <br>
     * 3. Виведіть суму для оплати (сума купівлі з урахуванням суми комісії).
     * <br>
     * 4. Врахуйте варіанти виведення, коли немає відповідності будь-якому способу оплати.
     * <br>
     * 5. Завдання необхідно виконати за допомогою switch case
     * </p>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Спосіб оплати та сума");
        String payment = String.valueOf(scanner.next());
        int sum = scanner.nextInt();
        double comission = 0.0;
       // int pay = sum + (sum*2/100);//
        switch (payment) {
            case "Cash":
                 comission = 0.0;
                System.out.println("Додаткова комісія не стягується");
            break;
            case "Card":
                comission = 0.02;
                System.out.println("Стягується додаткова комісія 2% від суми купівлі.");
        break;
            case "Bill":
                comission = 0.05;
                System.out.println("Стягується додаткова комісія 5% від суми купівлі");
       break;
            default: System.out.println("Hемає відповідності будь-якому способу оплати");
        }
    double totalAmount = sum * (1.0 + comission);
System.out.println("Сума до сплати: " + totalAmount);
    }}