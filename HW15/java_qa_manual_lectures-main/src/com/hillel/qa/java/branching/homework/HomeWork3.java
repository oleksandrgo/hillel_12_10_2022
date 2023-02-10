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

       double card = 1.02;
       double invoice = 1.05;
       double result;

       System.out.println("Введіть суму за товар: ");
       Scanner myPay = new Scanner(System.in);
       double payment = myPay.nextDouble();

       System.out.println("Введіть вид оплати (1 - Готівка, 2 - Карткою, 3 - Згідно рахунку): ");
       Scanner myPayType = new Scanner(System.in);
       int paymentType = myPayType.nextInt();

       switch (paymentType){
           case 1:
               System.out.println("Ви розрахувались готівкою, з вас: "+ payment+" грн.");
               break;
           case 2:
               result = payment * card;
               System.out.println("Ви розрахувались карткою, з вас: "+ result+" грн.");
               break;
           case 3:
               result = payment * invoice;
               System.out.println("Ви розрахувались згідно рахунку, з вас: "+ result+" грн.");
               break;
           default:
               System.out.println("Інші види платежів НЕ ПРИЙМАЄМО!");
       }
    }
}
