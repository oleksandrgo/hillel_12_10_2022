import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.crypto.Data;
import java.util.UUID;


public class Main {

    WebDriver driver;

    @BeforeClass
    public static void setupDriver() {
        String path = String.format("%s/bin/chromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void firstTest() throws InterruptedException {
        // driver.get("https://chromedriver.storage.googleapis.com/index.html?path=109.0.5414.25/");
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")) .click();
        Thread.sleep(2000);
        String randomEmail = "test+" + UUID.randomUUID().toString() + "@example.com";
        driver.findElement(By.id("signupName")) .sendKeys("Joe");
        driver.findElement(By.id("signupLastName")) .sendKeys("Biden");
        driver.findElement(By.id("signupEmail")) .sendKeys(randomEmail);
        driver.findElement(By.id("signupPassword")) .sendKeys("Qwerty12345");
        driver.findElement(By.id("signupRepeatPassword")) .sendKeys("Qwerty12345");
        driver.findElement(By.cssSelector(".modal-footer .btn")) .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()=' Profile ']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Joe Biden']"));
        Assert.assertEquals("not match", "Joe Biden", "Joe Biden");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Garage']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add car']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.id("addCarBrand")) .click();
        Select se = new Select(driver.findElement(By.id("addCarBrand")));
        se.selectByVisibleText("Porsche");
        Thread.sleep(2000);
        driver.findElement(By.id("addCarModel")) .click();
        Select me = new Select(driver.findElement(By.id("addCarModel")));
        me.selectByVisibleText("Cayenne");
        Thread.sleep(2000);
        driver.findElement(By.id("addCarMileage")) .sendKeys("500");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add fuel expense']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseMileage")) .clear();
        driver.findElement(By.id("addExpenseMileage")) .sendKeys("1000");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseLiters")) .sendKeys("50");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseTotalCost")) .sendKeys("75");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add']")) .click();
        driver.findElement(By.xpath(".//*[text()=' Settings ']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Remove my account']")) .click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Remove']")) .click();

    }
}
