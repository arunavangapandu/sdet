package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id= "passwd")
    private WebElement pwd;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @FindBy(id = "email_create")
    private WebElement emailSignUpField;

    @FindBy(id = "SubmitCreate")
    private WebElement signUpButton;

    public void logIn(String email, String password) {
        emailField.sendKeys(email);
        pwd.sendKeys(Utils.decode64(password));
        loginButton.click();
    }

    public void signUp(String email) {
        emailSignUpField.sendKeys(email);
        signUpButton.click();
    }
}
