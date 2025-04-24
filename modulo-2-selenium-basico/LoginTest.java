
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://automationexercise.com/login");
    }

    @Test
    public void loginConCredencialesValidas() {
        driver.findElement(By.name("email")).sendKeys("usuario@ejemplo.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
