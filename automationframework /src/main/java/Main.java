import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Constants;
import utils.FrameworkProperties;

public class Main {
    public static void main(String[] args) {
        FrameworkProperties frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty("browser"));
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("http://automationpractice.com");
        HomePage homePage = new HomePage();
        homePage.addFirstElementToCart();
        homePage.addSecondElementToCart();

        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.goToCheckout();

        LoginPage loginPage = new LoginPage();
        /*loginPage.logIn(frameworkProperties.getProperty("eamil"),
                frameworkProperties.getProperty("password"));*/
        loginPage.logIn(frameworkProperties.getProperty(Constants.EMAIL),
                frameworkProperties.getProperty(Constants.PASSWORD));

        checkoutPage.confirmAddress();
       // checkoutPage.confirmShippingCheckBox();
        checkoutPage.confirmShipping();
        checkoutPage.payByBankWire();
        checkoutPage.confirmMyOrder();
        if(checkoutPage.verifyOrderCompleteText())
            System.out.println("Test case completed!");
    }
}
