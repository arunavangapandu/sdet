import drivers.DriverSingleton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/*import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;*/
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Constants;
import utils.FrameworkProperties;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class SearchTests {
    static FrameworkProperties frameworkProperties;
    static WebDriver driver;
    static HomePage homePage;
    static LoginPage loginPage;
    static CheckoutPage checkoutPage;
    static String searchString;
    static Boolean expectedResult;

    @BeforeAll
    public static void initializeObjects() {
        frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty(Constants.BROWSER));
        driver = DriverSingleton.getDriver();
        homePage = new HomePage();
        loginPage = new LoginPage();
        checkoutPage = new CheckoutPage();
    }

    public SearchTests(String searchString, Boolean expectedResult) {
        this.searchString = searchString;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    private static Collection data() {
        return Arrays.asList(new Object[][] {
                {new SearchTests("Shirt", true)},
                {new SearchTests("Blouse", true)}
        });
    }

    @Test
    public void testingSearch() {
        driver.get(Constants.URL);
        assertEquals(expectedResult, homePage.searchElement(searchString));
    }

    @AfterAll
    public static void closeObjects() {
        driver.close();
    }
}
