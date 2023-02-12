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
        double price = 552.30;

        double cardCommission = 1.02;
        double invoiceCommission = 1.05;

        enum PaymentType {
            Card,
            Cash,
            Invoice
        }

        PaymentType paymentVia = PaymentType.Card;

        switch (paymentVia) {
            case Card:
                System.out.println("You have paid: " + (price * cardCommission) + "$ via card!");
                break;
            case Invoice:
                System.out.println("You have paid: " + (price * invoiceCommission) + "$ via invoice!");
                break;
            case Cash:
                System.out.println("You have paid: " + price + "$ via cash!");
                break;

            default:
                System.out.println("This type of payment is not allowed!");
        }
    }
}
