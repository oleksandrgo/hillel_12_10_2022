import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
/*
import dev.selenium.BaseChromeTest;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;
*/
public class main{
    String name = "Iks";
    String lastName = "User";
    String randomEmail() {
        return "test" + (int) ((Math.random() * 10000)) + "@test.com";
    }
    String email = "test@test2test.com";
    String password = "1234qweR";
    WebDriver driver;

    @BeforeClass
    public static void setUpDriver(){
       final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
       System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
    }

    @Test
    public void createUser() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        driver.findElement(By.id("signupName")).sendKeys(name);
        driver.findElement(By.id("signupLastName")).sendKeys(lastName);
        driver.findElement(By.id("signupEmail")).sendKeys(randomEmail());
        driver.findElement(By.id("signupPassword")).sendKeys(password);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(password);
        driver.findElement(By.cssSelector(".modal-footer .btn")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://qauto.forstudy.space/panel/profile");
        WebElement getName = driver.findElement(By.cssSelector(".display-4"));
        Assert.assertEquals("Incorrect name ", name +" "+ lastName, getName.getText());
        driver.navigate().back();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(2000);
        WebElement selectCarBrand = driver.findElement(By.id("addCarBrand"));
        Select selectBrand = new Select(selectCarBrand);
        selectBrand.selectByVisibleText("Porsche");
        Thread.sleep(2000);
        WebElement selectCarModel = driver.findElement(By.id("addCarModel"));
        Select selectModel = new Select(selectCarModel);
        selectModel.selectByVisibleText("Panamera");
        driver.findElement(By.id("addCarMileage")).sendKeys("10");
        driver.findElement(By.cssSelector(".justify-content-end .btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".car_add-expense")).click();
        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("25");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("8");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("127,5");
        driver.findElement(By.cssSelector(".modal-footer .btn-primary")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://qauto.forstudy.space/panel/settings");
        driver.findElement(By.cssSelector(".user-settings_form .btn-danger-bg")).click();
        driver.findElement(By.cssSelector(".modal-footer .btn-danger")).click();
        Thread.sleep(2000);
    }
/*
    @Test
    public void checkUserName() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".header_signin")).click();
        driver.findElement(By.id("signinEmail")).sendKeys(email);
        driver.findElement(By.id("signinPassword")).sendKeys(password);
        driver.findElement(By.cssSelector(".modal-footer .btn-primary")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://qauto.forstudy.space/panel/profile");
        Thread.sleep(2000);
        WebElement getName = driver.findElement(By.cssSelector(".display-4"));
        Assert.assertEquals("Incorrect name ", name +" "+ lastName, getName.getText());

    }
*/
/*   @Test
    public void createCar() throws InterruptedException {
       driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
       driver.findElement(By.cssSelector(".header_signin")).click();
       driver.findElement(By.id("signinEmail")).sendKeys(email);
       driver.findElement(By.id("signinPassword")).sendKeys(password);
       driver.findElement(By.cssSelector(".modal-footer .btn-primary")).click();
       Thread.sleep(2000);
       WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(selectCarModel));
       driver.findElement(By.cssSelector(".btn-primary")).click();
       //Thread.sleep(1000);
       WebElement selectCarBrand = driver.findElement(By.id("addCarBrand"));
       Select selectBrand = new Select(selectCarBrand);
       selectBrand.selectByVisibleText("Porsche");
       //Thread.sleep(1000);
       WebElement selectCarModel = driver.findElement(By.id("addCarModel"));
       Select selectModel = new Select(selectCarModel);
       selectModel.selectByVisibleText("Panamera");
       //Thread.sleep(1000);
       WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
               .until(ExpectedConditions.visibilityOf(selectCarModel));
       driver.findElement(By.id("addCarMileage")).sendKeys("10");
       //Thread.sleep(1000);
       driver.findElement(By.cssSelector(".justify-content-end .btn-primary")).click();
   }*/
    /*@Test
    public void addExpense() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".header_signin")).click();
        driver.findElement(By.id("signinEmail")).sendKeys(email);
        driver.findElement(By.id("signinPassword")).sendKeys(password);
        driver.findElement(By.cssSelector(".modal-footer .btn-primary")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".car_add-expense")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseMileage")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseMileage")).sendKeys("25");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("8");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("127,5");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".modal-footer .btn-primary")).click();
        Thread.sleep(2000);
    }*/

    /*@Test
    public void deleteAccount() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".header_signin")).click();
        driver.findElement(By.id("signinEmail")).sendKeys(email);
        driver.findElement(By.id("signinPassword")).sendKeys(password);
        driver.findElement(By.cssSelector(".modal-footer .btn-primary")).click();
        Thread.sleep(2000);
        driver.navigate().to("https://qauto.forstudy.space/panel/settings");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".user-settings_form .btn-danger-bg")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".modal-footer .btn-danger")).click();
        Thread.sleep(2000);
    }*/

}



