package com.hillel.qa.java.branching.homework;

public class HomeWork1 {
    /**
     *  <p style="font-size:12px">
     *     В нас є ім'я та вік. Якщо вік у межах 18–26 (включно),
     *     то вивести напис «Ім'я, вітаю ви розібралися як працює if».
     *  </p>
     */
    public static void main(String[] args) {
        String name = "Jobs";

        int age = 25;
        if (age >= 18 && age<=26) {
            System.out.println(name + "_вітаю ви розібралися як працює if");
        } else {
            System.out.println("СЛОЖНА!");
        }



    }
}
