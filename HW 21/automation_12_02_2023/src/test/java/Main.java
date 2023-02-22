import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.UUID;

public class Main {
    WebDriver driver;

    @BeforeClass
    public static void setupDriver(){
        String path = String.format("%s/chromedriver_mac64/chromedriver",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",path);
    }

    @Before
    public void precondition(){
        driver = new ChromeDriver();
    }

    @Test

    public void firstTest() throws InterruptedException {
    //public void firstTest(){driver.get("https://www.google.com/");
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        driver.findElement(By.id("signupName")).sendKeys("Helennnn");
        driver.findElement(By.id("signupLastName")).sendKeys("Polischukkkk");
        driver.findElement(By.id("signupEmail")).sendKeys("qwertysa@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("Qwerty65");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Qwerty65");
        driver.findElement(By.cssSelector(".modal-footer .btn")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-white btn-sidebar sidebar_btn -profile']")).click();
        WebElement ProfileName = driver.findElement(By.xpath("//p[@class='profile_name display-4']"));
        Assert.assertEquals("Incorrect Name and LastName ", "Helennnn Polischukkkk ",  ProfileName.getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-white btn-sidebar sidebar_btn']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.id("addCarBrand")).click();
        Select drpBrand = new Select(driver.findElement(By.id("addCarBrand")));
        drpBrand.selectByVisibleText("Audi");
        driver.findElement(By.id("addCarModel")).click();
        Select drpModel = new Select(driver.findElement(By.id("addCarModel")));
        drpModel.selectByVisibleText("Q7");
        driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        driver.findElement(By.xpath("//button[@class='car_add-expense btn btn-success']")).click();
        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("10");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("100");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("100");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        driver.findElement(By.xpath("//a[@routerlink='settings']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-danger-bg']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
    }

}

