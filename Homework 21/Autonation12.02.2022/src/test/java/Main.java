import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    WebDriver driver;

    @BeforeClass
    public static void setupDriver() {
        String path = String.format("%s/bin/chromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
    }

    @Test
    public void Enter() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("signupName")).sendKeys("Andrii");
        driver.findElement(By.id("signupLastName")).sendKeys("Chempion");
        driver.findElement(By.id("signupEmail")).sendKeys("voi18qwd@gmail.com");
        driver.findElement(By.id("signupPassword")).sendKeys("67467960Ff!");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("67467960Ff!");
        driver.findElement(By.cssSelector(".modal-footer .btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()=' Profile ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Andrii Chempion']"));
        Assert.assertEquals("Не правильно", "Andrii Chempion", "Andrii Chempion");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Garage']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add car']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addCarBrand")).click();
        Select se = new Select(driver.findElement(By.id("addCarBrand")));
        se.selectByVisibleText("Porsche");
        Thread.sleep(2000);
        driver.findElement(By.id("addCarModel")).click();
        Select me = new Select(driver.findElement(By.id("addCarModel")));
        me.selectByVisibleText("911");
        Thread.sleep(2000);
        driver.findElement(By.id("addCarMileage")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add fuel expense']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("200000");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("150");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("3000");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Add']")).click();
        driver.findElement(By.xpath(".//*[text()=' Settings ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Remove my account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[text()='Remove']")).click();

    }
}