package com.hillel.qa.java.arithmetic_operators.homework;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     * Написати програму, яка виводить на екран рік народження мого друга.
     * </p>
     *<br>
     * <h2>Вимоги:</h2>
     * <ul style="font-size:12px">
     *     <li>Створіть змінну currentYear, яка буде містити поточний рік.</li>
     *     <li>Створіть змінну friendYear, яка буде містити рік народження друга.</li>
     *     <li>Вивести в консоль "Моєму другу (число) років".</li>
     * </ul>
     */
    public static void main(String[] args) {
        int currentYear = 2023;
        int friendYear = 1990;
        int age;

        age = currentYear - friendYear;

        System.out.println("Моєму другу (число) років ="+age);

    }
}

public class Test{
    static int power(int x, int n){
        int result = 1;
        for (int i=1; i<=b; i++){
            result = result*x;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println( power(x,n));
    }
}

public static void main(String[] args) {
        int num [] = {1-100};
        double sum = 0;
        for (int x: num) {
        sum += x;
        }
        System.out.print(""среднее арифметическое суммы чисел:""  + sum/num.length);
        }
        }
