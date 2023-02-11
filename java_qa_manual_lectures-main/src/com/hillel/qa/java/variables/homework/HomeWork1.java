package com.hillel.qa.java.variables.homework;

public class HomeWork1 {
    /**
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>У методі main оголоси чотири змінні типу int, double, String, boolean.</li>
     *     <li>Змінні повинні мати імена year, height, countryName, isStudent.</li>
     *     <li>Змінним одразу потрібно присвоїти значення.</li>
     * </ul>
     */
    public static void main(String[] args) {
        int year = 2023;
        double height = 169.3;
        String countryName = "Ukraine";
        boolean isStudent = false;

        System.out.println("Today's year: " + year);
        System.out.println("My height: " + height);
        System.out.println("My Country Name: " + countryName);
        System.out.println("Is student: " + isStudent);
    }
}
