import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    WebDriver driver;
    @BeforeClass
    public static void setupDriver(){
        String path = String.format("%s/bin/cromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.crome.driver",path);
    }
    @Before
    public void precondition(){
        driver = new ChromeDriver();
    }
@Test
    public void firstTest(){
    driver.get("https://www.google.com/");
}

}
