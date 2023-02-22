package ua.ithillel.automation.unit;

import org.junit.Assert;
import org.junit.Test;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Unit test</h1>
 * <p style="font-size:12px">Цей клас дає наглядний приклад що таке unit test. В нас є наступні методи:</p>
 * <ol style="font-size:12px">
 *  <li><b style="color: #ffd700">Sum</b> - додає два числа</li>
 *  <li><b style="color: #ffd700">Add</b> - множить два числа</li>
 *</ol>
 *
 */

public class SimpleUnitTest {

    /**
     * <p style="font-size:12px">Тест перевіряє суму чисел 5 і 5.
     * <b style="color: #ffd700">Assert.assertEquals </b>- це спеціальний метод який допомагає робити перевірки.
     * </p>
     */
    @Test
    public void testSum(){
        Assert.assertEquals("Неправильна сума",10,sum(5,5));
    }

    /**
     * <p style="font-size:12px">Тест перевіряє суму чисел -5 і -5.
     * <b style="color: #ffd700">Assert.assertEquals </b>- це спеціальний метод який допомагає робити перевірки.
     * </p>
     */
    @Test
    public void testSumWithNegativeData(){
        Assert.assertEquals("Неправильна сума",-10,sum(-5,-5));
    }

    /**
     * <p style="font-size:12px">Тест перевіряє множення чисел 5 і 5.
     * <b style="color: #ffd700">Assert.assertEquals </b>- це спеціальний метод який допомагає робити перевірки.
     * </p>
     */
    @Test
    public void testMultiply(){
        Assert.assertEquals("Неправильний результат множення",25,multiply(5,5));
    }

    /**
     * <p style="font-size:12px">Тест перевіряє множення чисел -5 і -5.
     * <b style="color: #ffd700">Assert.assertEquals </b>- це спеціальний метод який допомагає робити перевірки.
     * </p>
     */
    @Test
    public void testMultiplyWithNegativeData(){
        Assert.assertEquals("Неправильний результат множення",25,multiply(-5,-5));
    }


    //Метод складає два числа
    public static int sum(int a, int b){
        return a + b;
    }

    //Метод помножує два числа
    public static int multiply(int a, int b){
        return a * b;
    }
}
