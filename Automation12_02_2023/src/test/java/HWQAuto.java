import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HWQAuto {
    private final String domain = "https://guest:welcome2qauto@qauto.forstudy.space";
    private static WebDriver driver;
    private final String password = "Qwerty123";

    private String email;

    private final int sleep = 1000;

    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    @Before
    public void precondition() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Random random = new Random();
        int x = random.nextInt(1000);
        email = "exam_" + x + "@mail.com";
        driver.navigate().to(domain);
    }

    @Test
    public void aSingUp() throws InterruptedException {
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//button[@class='hero-descriptor_btn btn btn-primary']")).click();
        Thread.sleep(sleep);

        driver.findElement(By.id("signupName")).sendKeys("Jin");
        driver.findElement(By.id("signupLastName")).sendKeys("Bin");
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        driver.findElement(By.id("signupPassword")).sendKeys(password);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(password);
        Thread.sleep(sleep);

        driver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary']")).click();
        Thread.sleep(sleep);
    }

    @Test
    public void bCheckProfile() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='btn btn-white btn-sidebar sidebar_btn -profile']")).click();
        Thread.sleep(sleep);
        String name = driver.findElement(By.xpath("//p[@class='profile_name display-4']")).getText();
        Thread.sleep(sleep);
        Assert.assertEquals(name, "Jin Bin");
    }

    @Test
    public void cAddCar() throws InterruptedException {
        driver.findElement(By.xpath("//a[@routerlink='garage']")).click();
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(sleep);

        driver.findElement(By.id("addCarMileage")).sendKeys("200");
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//div[@class='modal-footer d-flex justify-content-end']//button[@class='btn btn-primary']")).click();
        Thread.sleep(sleep);
        String miles = driver.findElement(By.xpath("//input[@formcontrolname='miles']")).getAttribute("value");
        Assert.assertEquals(miles, "200");
    }

    @Test
    public void dAddExpense() throws InterruptedException {
        driver.findElement(By.xpath("//a[@routerlink='expenses']")).click();
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(sleep);
        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("300");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("50");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("100");
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//div[@class='modal-footer d-flex justify-content-end']//button[@class='btn btn-primary']")).click();
        Thread.sleep(sleep);

        String miles = driver.findElement(By.xpath("//table[@class='table expenses_table']/tbody/tr/td[2]")).getText();
        String liters = driver.findElement(By.xpath("//table[@class='table expenses_table']/tbody/tr/td[3]")).getText();
        String cost = driver.findElement(By.xpath("//table[@class='table expenses_table']/tbody/tr/td[4]")).getText();

        Assert.assertEquals(miles, "300");
        Assert.assertEquals(liters, "50L");
        Assert.assertEquals(cost, "100.00 USD");
    }

    @Test
    public void eDeleteAccount() throws InterruptedException {
        driver.findElement(By.xpath("//a[@routerlink='settings']")).click();
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//button[@class='btn btn-danger-bg']")).click();
        Thread.sleep(sleep);
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(sleep);
        String signUp = driver.findElement(By.xpath("//button[@class='hero-descriptor_btn btn btn-primary']")).getText();
        Assert.assertEquals(signUp,"Sign up");
        Thread.sleep(sleep);
    }

    @AfterClass
    public static void postCondition() {
        driver.quit();
    }
}
