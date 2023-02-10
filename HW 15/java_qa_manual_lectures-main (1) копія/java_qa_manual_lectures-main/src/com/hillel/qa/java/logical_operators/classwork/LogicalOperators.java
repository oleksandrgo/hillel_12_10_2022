package com.hillel.qa.java.logical_operators.classwork;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Логічні оператори</h1>
 */
public class LogicalOperators {
    /**
     * <p style="font-size:12px">
     * Крім операцій над числами, Java існують також операції над булевими змінними - true і false.
     * Ці операції виконуються за допомогою логічних операторів
     * </p>
     * <br><br>
     * <h2>Логічні оператори:</h2>
     * <ol style="font-size:12px">
     *     <li>! — унарний оператор “НІ”</li>
     *     <li>&& — бінарний оператор “І”</li>
     *     <li>|| — бінарний оператор “АБО”</li>
     * </ol>
     *
     * <p style="font-size:12px">
     *     <b>Оператор &&</b> - повертає значення true тільки в тому випадку, якщо обидва операнди є true.
     *     <br>
     *     <b>Оператор ||</b> - повертає значення у випадку, якщо хоча б один операнд є true.
     *     <br>
     *     <b>Оператор !</b> - перевертає результат, повертає false, якщо результат істинний
     * </p>
     * <br>
     * <h2>Додаткова інформація</h2>
     *
     * @see <a href="https://www.w3schools.com/java/java_operators.asp">Стаття про логічні оператори</a>
     */
    public static void main(String[] args) {
       /* boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!(a || b));*/

       /* TODO: Приклад маленької задачі. У вас э вхідні значення:
           1. Чи Студент ?
           2. Чи відмінник ?
           3. Є стипендія ?
           Якщо людина має всі якості які перераховані вище, тоді вона заслуговую на підвищену стипендію
        */

        /*
        Дуже важливо розуміти що можна міксувати команди між собою.
        Наприклад, людина може отримати надбавку до пенсії якщо:
        1. Її вік 70 і вище
        2. Вона одружена
        3. В неї немає дітей
         */

        /*
        int age = 70;
        int minAge = 60;
        boolean isMarried = true;
        boolean hasChildren = false;
        boolean result = age >= age && isMarried && (!hasChildren);
        System.out.println(result);
        */


    }

}
