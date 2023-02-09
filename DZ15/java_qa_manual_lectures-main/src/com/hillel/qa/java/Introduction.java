package com.hillel.qa.java;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Вітаю усіх. Ми з вами розпочинаємо знайомство з мовою JAVA. В рамках занять ми з вами розберемо</h1>
 * <ol style="font-size:12px">
 *     <li>Поняття змінні</li>
 *     <li>Арифметичні оператори</li>
 *     <li>Логічні оператори</li>
 *     <li>Оператори порівняння</li>
 *     <li>Розгалуження</li>
 *      <li>Цикли</li>
 *      <li>Поняття клас, метод </li>
 *  </ol>
 *  <p style="font-size:12px">
 *      Як ви можете бачити наша програма складається с класу <b style="color: #ffd700">Introduction</b>
 *      в якій міститься метод <b style="color: #ffd700">main.</b> Зверніть вашу увагу на те що клас пишеться
 *      з великої літери, а метод з маленької.
 *  </p>
 */
public class Introduction {
    /**
     * <h2>Метод main</h2>
     * <p style="font-size:12px">
     * В JAVA існує метод з якого все починається і це <b style="color: #ffd700">main.</b>
     * Взагалі можна сказати що метод складається з команд. Можна навіть сказати, що метод — це група команд.
     * Приклад одної з найпростіших команд <b style="color: #ffd700">System.out.println().</b>
     * </p>
     * <br> <br>
     * <h2>Додаткова інформація</h2>
     *
     * @see <a href="https://www.geeksforgeeks.org/java-main-method-public-static-void-main-string-args/">Стаття стосовно main методу</a>
     */
    public static void main(String[] args) {
        /*
        Наша перша команда, виводить в консоль те що ви помістили в лапки.
        Важливо розуміти що регістр в JAVA має значення, system.out.println("Hello world");
        не спрацює, тому що з маленької букви.
         */
        System.out.println("Hello world");

        // TODO: Створіть свій клас та виведіть там "QA це круто!"
    }
}
