
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "ruta/a/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationexercise.com");

        WebElement signupLogin = driver.findElement(By.linkText("Signup / Login"));
        signupLogin.click();

        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement passwordInput = driver.findElement(By.name("password"));

        emailInput.sendKeys("test@example.com");
        passwordInput.sendKeys("123456");

        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
        loginBtn.click();

        System.out.println("Login realizado");

        driver.quit();
    }
}
