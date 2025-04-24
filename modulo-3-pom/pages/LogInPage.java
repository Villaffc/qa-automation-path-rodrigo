
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LogInPage {
    WebDriver driver;

    @FindBy(name = "email") WebElement emailField;
    @FindBy(name = "password") WebElement passwordField;
    @FindBy(xpath = "//button[text()='Login']") WebElement loginButton;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logIn(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
