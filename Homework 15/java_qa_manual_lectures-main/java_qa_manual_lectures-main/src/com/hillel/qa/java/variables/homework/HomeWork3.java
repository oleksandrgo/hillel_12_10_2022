package com.hillel.qa.java.variables.homework;

public class HomeWork3 {
    /**
     * <p style="font-size:12px">
     * У методі main виводяться значення трьох рядків.
     * Зміни код так, щоб замість значень рядків виводилась їх довжина.
     * </p>
     */
    public static void main(String[] args) {
        String emptyString = "";

        System.out.println(emptyString.length());
        System.out.println("Hello world!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
