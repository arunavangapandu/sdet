import com.google.common.annotations.VisibleForTesting;
import drivers.DriverSingleton;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Constants;
import utils.FrameworkProperties;

import java.sql.Driver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Tests {

    static FrameworkProperties frameworkProperties;
    static WebDriver driver;
    static HomePage homePage;
    static LoginPage loginPage;
    static CheckoutPage checkoutPage;

    @BeforeAll
    public static void initializeObjects() {
        frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty(Constants.BROWSER));
        driver = DriverSingleton.getDriver();
        homePage = new HomePage();
        loginPage = new LoginPage();
        checkoutPage = new CheckoutPage();
    }


    @Test
    public void testingAuthentication() {
        driver.get(Constants.URL);
        homePage.clickSignIn();
        loginPage.logIn(frameworkProperties.getProperty(Constants.EMAIL),
                frameworkProperties.getProperty(Constants.PASSWORD));
        assertEquals(frameworkProperties.getProperty(Constants.USERNAME),
                homePage.getUserName());
    }

    @Test
    public void testShoppingCartQuantity() {
        driver.get(Constants.URL);
        homePage.addFirstElementToCart();
        homePage.addSecondElementToCart();
        //checkoutPage.goToCheckout();
        assertEquals((Constants.CART_QUANTITY_TEST), checkoutPage.getOrderQuantity());
    }

    @Test
    public void testBuyingProcess() {
        driver.get(Constants.URL);
        homePage.addFirstElementToCart();
        homePage.addSecondElementToCart();
        checkoutPage.goToCheckout();
        checkoutPage.confirmAddress();
        checkoutPage.confirmShipping();
        checkoutPage.payByBankWire();
        checkoutPage.confirmMyOrder();
        assertTrue(checkoutPage.verifyOrderCompleteText());
        //assertThat("test", is("test"));
        assertThat(checkoutPage.verifyOrderCompleteText(), is(true));
    }

    @AfterAll
    public static void closeObjects() {
       // driver.close();
    }
}
