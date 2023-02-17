package com.hillel.qa.java.cycles.classwork;

import java.util.Scanner;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Цикли</h1>
 */
public class Cycles {
    /**
     * <p style="font-size:12px">
     * У житті нам дуже часто доводиться багато разів виконувати одні і ті самі дії.
     * Наприклад, читаючи книгу нам необхідно перегортати сторінки.
     * І так до тих пір поки ми не закінчимо читання. Ось булоб добре якби сторінки самі перегортались.
     * Для того шоб в програмуванні автоматизувати одні і ті самі дії, використовують цикли.
     * </p>
     * <br>
     * <h2>Ми з вами розглянемо наступні види циклів:</h2>
     * <ul style="font-size:12px">
     *     <li>Цикл while</li>
     *     <li>Цикл do while</li>
     *     <li>Цикл for</li>
     * </ul>
     *
     * @see <a href="https://www.w3schools.com/java/java_while_loop.asp">Java While Loop</a>
     * <br>
     * <a href="https://www.w3schools.com/java/java_for_loop.asp">Java For Loop</a>
     * <br>
     * <a href="https://www.w3schools.com/java/java_break.asp">Java Break and Continue</a>
     */

    public static void main(String[] args) {
        /*
        Оператор циклу while дуже простий і складається лише з двох частин: умови та тіла циклу.
        Тіло циклу виконується знов і знов, доки умова дорівнює true. Цикл while має такий загальний вигляд:
         */

        /*int  n = 5;
        while (n > 0)
        {
            System.out.println(n);
            n--;
        }*/

        /*
        Все дуже просто. Команда або блок команд виконуються знову й знову,
        доки умова циклу істинна, тобто дорівнює true.
         */

        // Довічний цикл
       /*
       while (true)
            System.out.println("Хай живе Україна!");
        */

        /*
        TODO: Написати програму яка виводить 50 разів "QA це круто!"
         */
        int  n = 0;
        while (n < 50)
        {
            System.out.println("QA це круто!");
            n++;}
        /*
        Ще один приклад.
        Програма буде вводити рядки з клавіатури,
        доки не буде введено рядок exit.
         */

        /*
        Scanner console = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String s = console.nextLine();
            isExit = s.equals("exit");
        }
        */

        /*
        Команда break.
        Розгляньмо приклад. Вище ми бачимо як за допомогою зміни isExit, ми завершили роботу циклу.
        У мові Java є спеціальний оператор break, який дає змогу спростити такий код.
        Якщо виконати команду break всередині циклу, він одразу завершується,
        і програма починає виконувати команди, які йдіть після циклу.
        Розглянемо як це буде виглядати з командою break.
         */

        /*
        Scanner console = new Scanner(System.in);
        while (true)
        {
            String s = console.nextLine();
            if (s.equals("exit"))
                break;
        }
        */

        /*
        Команда continue.
        Проте break — це не єдиний оператор, за допомогою якого можна керувати виконанням циклів.
        У мові Java є ще один оператор — continue. Якщо виконати команду continue всередині циклу,
        поточний виток циклу завершиться достроково.
        Одноразове виконання тіла циклу називають витком циклу.
         На відміну від команди break, команда continue перериває поточний виток циклу, але не сам цикл.
         */

       /*
       int i = 0;
       while (i <= 20) {
            if ((i % 2) == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        */

        /*
        Зворотний цикл do while.
        У Java є ще один різновид циклу while — цикл do-while.
        Він дуже схожий на while і так само складається з двох частин: «умови» й «тіла циклу».
        Тіло циклу виконується знов і знов, доки умова дорівнює true. Цикл do-while має такий загальний вигляд:
         */

       /*
       int n = 5;
       do {
            System.out.println(n);
            n--;
        } while (n > 0);
        */

        /*
        Фактично, різниця між циклами while і do-while полягає лише в тому,
        що тіло циклу в циклі do-while виконується принаймні один раз.
         */

        /*
        Цикл for - це конструкція програмного коду, що керує,
        яка порушує лінійність виконання алгоритму і дозволяє виконати зазначений код безліч разів.
        Як працює цикл ?
        for(<початкова точка>; <умова>; <лічильник>) {
	        Тіло циклу
         }
         початкова точка - це наш ітератор
         умова - до якого моменту буде виконуватись цикл
         лічильник - задається крок для нашого циклу
         */

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        */

        // Як би виглядав цикл while
        /*
        int i = 0;
        while (i < 10)
        {
            System.out.println(i);
            i++;
        }
        */
    }
}
