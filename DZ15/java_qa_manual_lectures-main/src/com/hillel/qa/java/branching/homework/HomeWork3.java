package com.hillel.qa.java.branching.homework;

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

        int payment = 35;
        double cardPayment = 1.02;
        double accountPayment = 1.05;
        int paymentType = 6;
        switch (paymentType) {
            case 1:
                System.out.println("Оплата готівкою" + payment + "гривень");
                break;
            case 2:
                System.out.println("Оплата карткою" + payment * cardPayment + "гривень");
                break;
            case 3:
                System.out.println("Оплата за рахунком" + payment * accountPayment + "гривень" );
                break;
            default:
                System.out.println("Помилка способу оплати !");
        }
    }
}
