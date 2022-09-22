package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

public class CheckoutPage {
    private WebDriver driver;
   // private WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);

    public CheckoutPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "head > title")
    private WebElement pageTitle;

    @FindBy(css="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
    private WebElement checkoutButtonSummary;

    @FindBy(css = "#center_column > form > p > button > span")
    private WebElement checkoutButtonAddress;

    @FindBy(id = "cgv")
    private WebElement confirmShippingCheckBox;

    @FindBy(css = "#form > p > button > span")
    private WebElement checkoutButtonConfirmShipping;


    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
    private WebElement payByBankWireOption;

    @FindBy(css = "#cart_navigation > button > span")
    private WebElement confirmMyOrderButton;

    @FindBy(css = "#center_column > div > p > strong")
    private WebElement orderConfirmationMessage;

    public Boolean checkTitle(String title) {
        return pageTitle.getText().equalsIgnoreCase("Order - My Store");
    }

    public void goToCheckout() {
      WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonSummary));
        checkoutButtonSummary.click();
    }

    public void confirmAddress() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonAddress));
        checkoutButtonAddress.click();
    }

    public void confirmShipping() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButtonConfirmShipping));
        confirmShippingCheckBox.click();
        checkoutButtonConfirmShipping.click();
    }

    public void payByBankWire(){
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(payByBankWireOption));
        payByBankWireOption.click();

    }

    public void confirmMyOrder(){
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(confirmMyOrderButton));
        confirmMyOrderButton.click();

    }
    public Boolean verifyOrderCompleteText() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(orderConfirmationMessage));
        return orderConfirmationMessage.getText().equalsIgnoreCase(Constants.COMPLETE_ORDER_MESSAGE);
    }

}
