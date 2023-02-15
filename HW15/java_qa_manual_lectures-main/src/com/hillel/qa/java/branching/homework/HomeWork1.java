package com.hillel.qa.java.branching.homework;

public class HomeWork1 {
    /**
     *  <p style="font-size:12px">
     *     В нас є ім'я та вік. Якщо вік у межах 18–26 (включно),
     *     то вивести напис «Ім'я, вітаю ви розібралися як працює if».
     *  </p>
     */
    public static void main(String[] args) {
        int age = 18;
        int tillAge = 26;
        String userName = "Vika";
        if (age >= 18){
            System.out.println( userName + ", вітаю ви розібралися як працює if");
        } else if (age == 26) {
            System.out.println( userName + ", вітаю ви розібралися як працює if");
        }
    }
}
