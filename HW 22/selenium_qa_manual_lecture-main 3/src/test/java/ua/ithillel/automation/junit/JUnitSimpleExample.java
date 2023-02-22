package ua.ithillel.automation.junit;

import org.junit.*;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Junit</h1>
 * <p style="font-size:12px">Цей клас описує базову роботу с бібліотекою Junit. JUnit – це Java-фреймворк для тестування,
 * перша його мета це тестування окремих частин коду, наприклад, методів або класів. Але його також використовують у API/UI тестах.
 * Наша задача розібрати базові анотації.</p>
 * <br><br>
 * <h2>Додаткова інформація</h2>
 * @see <a href="https://junit.org/junit4/">Junit doc</a>
 */

public class JUnitSimpleExample {

    /**
     * <h2>BeforeClass</h2>
     *<p style="font-size:12px">Виконується один раз перед запуском усіх тестів.
     * Використовується для ініціалізації загальних для всього тесту даних, наприклад для створення екземплярів класів.</p>
     */
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    /**
     * <h2>Before</h2>
     *<p style="font-size:12px">Виконується перед запуском методу з анотацією @Test. Використовується для ініціалізації даних наступного тесту.</p>
     */
    @Before
    public void before(){
        System.out.println("Before");
    }

    /**
     * <h2>Test</h2>
     *<p style="font-size:12px">Сам тест.</p>
     */
    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    /**
     * <h2>After</h2>
     *<p style="font-size:12px">Виконується після завершення кожного тесту. Підчищаємо за собою.</p>
     */
    @After
    public void after(){
        System.out.println("after");
    }

    /**
     * <h2>AfterClass</h2>
     *<p style="font-size:12px">Виконується один раз після проходження всіх тестів. Підчищаємо за собою ті речі, які нагадували в @BeforeClass..</p>
     */
    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }
}
