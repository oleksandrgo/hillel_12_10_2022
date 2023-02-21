package ua.ithillel.automation.ui;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>UI test</h1>
 * <p style="font-size:12px">В цьому класі описані базові методи які допомагають нам автоматизувати веб сторінки:</p>
 */
public class SimpleUiTest {
    private WebDriver driver;

    /**
     * <h2>Налаштування WebDriver</h2>
     * <p style="font-size:12px"><b style="color: #ffd700">WebDriver</b> – це драйвер браузера, тобто програмна бібліотека, що не має інтерфейсу користувача,
     * яка дозволяє різним іншим програмам взаємодіяти з браузером,
     * керувати його поведінкою, отримувати від браузера якісь дані і змушувати браузер виконувати якісь команди.<br>
     * В методі <b style="color: #ffd700">setUpDriver</b>  ми налаштовуємо роботу chromeDriver. В константі path ми зберігаємо наш шлях до файлу chromedriver.exe.<br>
     * В <b style="color: #ffd700">System.setProperty</b> - встановлюємо зміні нашого середовища. Тобто говоримо нашій OS що існує драйвер у нашій системі.
     * </p>
     */
    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    /**
     * <h2>Створюємо об'єкт класу WebDriver та налаштовуємо розмір вікна</h2>
     */
    @Before
    public void precondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * <h2>Розгляд методів пошуку елементів на сторінці та деякі додаткові.</h2>
     */
    @Test
    public void learnHowToFindElements() throws InterruptedException {
        // Метод get відкриває нам потрібну вкладку.
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");

        /*
         Метод findElement може шукати один елемент за допомогою різних способів.
         Їх дуже багато, але ми розберемо базові.
         */
        //Пошук по cssSelector кнопки Sign up. Також бачимо метод click - який говорить сам за себе. Натискає кнопку Sign up
        /*driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(2000);*/

        // Пошук по xpath кнопки Sign up. Також бачимо метод click - який говорить сам за себе. Натискає кнопку Sign up
        /*driver.findElement(By.xpath("//button[@class='hero-descriptor_btn btn btn-primary']")).click();
        Thread.sleep(2000);*/

        // Пошук по className кнопки Sign up. Також бачимо метод click - який говорить сам за себе. Натискає кнопку Sign up
        /*driver.findElement(By.className("hero-descriptor_btn")).click();
        Thread.sleep(2000);*/

        /*driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        // Пошук по id поля Name. Також бачимо метод sendKeys - який вводить значення у знайдене поле.
        driver.findElement(By.id("signupName")).sendKeys("Test");
        Thread.sleep(2000);*/

        //Метод findElements шукає багато елементів. Зараз метод знайде всі теги div на відкритій сторінці.
        //driver.findElements(By.cssSelector("div"));
    }

    /**
     * <h2>Розгляд методів навігації в браузері.</h2>
     */
    @Test
    public void learnHowToNavigateBetweenWebPages() throws InterruptedException {
        driver.get("https://google.com.ua/");

        // Метод getCurrentUrl повертає вам адрес сторінки де ви знаходитесь
        /*String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);*/

        // Метод navigate.to() відкриє в вашій вкладці нову адресу
       /* driver.navigate().to("https://www.google.com/doodles");
        Thread.sleep(2000);*/

        // Метод navigate.back() імітує роботу коли ви натискаєте стрілки в браузері назад
       /* driver.navigate().back();
        Thread.sleep(2000);*/

        //Метод navigate.forward() імітує роботу коли ви натискаєте стрілки в браузері вперед
       /* driver.navigate().forward();
        Thread.sleep(1000);*/

        //Метод navigate.refresh() імітує роботу коли ви перевантажуєте сторінку в браузері.
        /*driver.navigate().refresh();
        Thread.sleep(1000);*/

    }

    /**
     * <h2>Розгляд методів для отримання інформації з тегів.</h2>
     */
    @Test
    public void learnHowToGetDataFromElements() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        //Записуємо в зміну signUpButton кнопку Sign up
        WebElement signUpButton = driver.findElement(By.cssSelector(".hero-descriptor_btn"));

        // Метод getCssValue повертає значення css яке ви вказали в аргументі. Виводимо в консоль який в кнопки колір
        System.out.println(signUpButton.getCssValue("color"));

        // Метод getAttribute повертає значення атрибута яке ви вказали у аргументі. Виводимо в консоль значення класу.
        //System.out.println(signUpButton.getAttribute("class"));

        // Метод getText повертає текст який зберігається у вказаному елементі. Виводимо в консоль значення яке зберігається в елементі.
        //System.out.println(signUpButton.getText());
    }

    /**
     * <h2>Розгляд методів для порівняння expected та actual result.</h2>
     */
    @Test
    public void learnBaseAssertions() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        WebElement signUpButton = driver.findElement(By.cssSelector(".hero-descriptor_btn"));

        // Assert це клас який містить купу метод для порівняння expected та actual result.
        // assertEquals - це один з методів який може порівнювати строки, числа і так далі.
        Assert.assertEquals("Incorrect button name ", "Sign up", signUpButton.getText());

        /*
        Ви бачите три зміні
        1. actualText - зберігає текст який ми витягли з кнопки signUpButton
        2. expectedText - це текст який ми очікуємо
        3. result - містить результат порівняння двох попередніх змінних
         Assert.assertTrue - якщо true то тест пройдено успішно, якщо false тест не пройдено.
        */
        /*String actualText = signUpButton.getText();
        String expectedText = "Sign up";
        boolean result = actualText.equals(expectedText);
        Assert.assertTrue(result);*/
    }


    @After
    public void postCondition() {
        //Метод quit() завершує роботу драйвера, закриваючи всі пов’язані вікна.
        driver.quit();
    }

}
