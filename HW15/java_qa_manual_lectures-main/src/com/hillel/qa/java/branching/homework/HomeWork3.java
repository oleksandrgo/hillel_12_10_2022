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
        int paymentType = 2 ;
        int payment = 100;
        double payCard = 1.02;
        double paymentAccount = 1.05;
        switch (paymentType) {
            case 1:
                System.out.println("Оплата готівкою, сума складає" + payment + "грн.");
                break;
            case 2:
                System.out.println("Оплата карткою, сума з комісією складає" + payment * payCard + "грн");
                break;
            case 3:
                System.out.println("Оплата за рахунком, сума з комісією складає" + payment * paymentAccount + "грн");

                break;
            default:
                System.out.println("Такого способу оплати не існує");
        }
    }
}
