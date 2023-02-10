package com.hillel.qa.java.arithmetic_operators.classwork;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Арифметичні оператори</h1>
 */
public class ArithmeticOperators {
    /**
     * <p style="font-size:12px">
     * Операцій над числами у програмуванні існує безліч. Почнемо з найпростішого – з арифметичних операцій.
     * <br><br>
     * <h2>Арифметичні операцій:</h2>
     * <ol style="font-size:12px">
     *     <li>Додавання (+),</li>
     *     <li>Віднімання (-)</li>
     *     <li>Множення (*)</li>
     *     <li>Поділ (/)</li>
     *     <li>Залишок від поділу (%)</li>
     * </ol>
     * </p>
     * <br>
     * <h2>Додаткова інформація</h2>
     * @see <a href="https://www.w3schools.com/java/java_operators.asp">Стаття про арефметичні оператори</a>
     */
    public static void main(String[] args) {
        /*
        int a = 8;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        */

        /*
        TODO: напишіть маленьку програму яка рахуе площу прямокутника.
         1. Створіть три змінні a, b та result
         2. Виведіть в консоль результат
        */

        /*
        Також доречно буде розібрати унарні, та бінарні операції.
        I так, унарні операції називаються "унарними" від слова "uno" - "один".
        Таку назву вони отримали тому, що проводяться над одним числом, а не кількома.
        Операції:
        1. Унарний (+) - вказує, що число позитивне
        2. Унарний (-) - вказує, що число негативне
        3. Унарне ні (!) - перетворює true на false, так false на true
        4. Інкремент (++) - збільшує число на одиницю
        5. Декремент (--) - зменшує на одиницю.
         */

        /*
        int a = +5;
        int b = -5;
        System.out.println(a + b);
        */

       /*
       boolean hasInsurance = true;
       System.out.println(!hasInsurance);
       */

        /*
        Існує інкремент та декремент постфіксний, суфіксний. Розглянемо обидва варіанти
         */
        // Префіксний інкремент та декремент, виконується спочатку виразу!
        /*
        int a = 10;
        System.out.println(++a); // спочатку збільшиться, потім виведе в консоль
        System.out.println(--a); // спочатку зменшиться, потім виведе в консоль
        System.out.println(a);
        */

        // Постфіксний інкремент та декремент виконується після виразу
        /*
        int a = 10;
        System.out.println(a++);  // Спочатку виведе в консоль, потім збільшить
        System.out.println(a--); // Спочатку виведе в консоль, потім зменшить
        System.out.println(a);
        */

        /*
         Конкатенація - склеювання строк.
         Щоб склеїти два рядки, потрібно використати знак +. Це дуже просто:
         */

        /*
        String a = "Hello " + "world";
        System.out.println(a);
        */

        //Перетворення до строкового типу.
        /*
        int a = 100;
        String text = "Я виконую ДЗ на " + a;
        System.out.println(text);
        */

        //Арифметичні операції з типом String проводити не можна. Навіть якщо рядок повністю складається з цифр.
       /*
       String a = "5";
       String b = "10" + a;
       System.out.println(b);
       */
    }
}
