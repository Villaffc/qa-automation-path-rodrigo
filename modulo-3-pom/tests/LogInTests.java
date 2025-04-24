
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LogInTests {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://automationexercise.com/login");
    }

    @Test
    public void loginConPageObject() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.logIn("usuario@ejemplo.com", "123456");
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
