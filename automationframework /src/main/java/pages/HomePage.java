package pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

public class HomePage {

    private WebDriver driver;

    public HomePage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
    private WebElement addToCartFirstElement;

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-mobile-line.hovered > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
    private WebElement addToCartSecondElement;

    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    private WebElement cart;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    private WebElement continueShoppingElement;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    private WebElement proceedToCheckoutElement;

    @FindBy(css = "#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line")
    private WebElement firstElementHover;

    @FindBy(css = "#homefeatured > li:nth-child(2)")
    private WebElement secondElementHover;

    @FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
    private WebElement signInButton;

    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(1) > a > span")
    private WebElement userName;

    public void clickSignIn() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }

    public String getUserName() {
        return userName.getText();
    }

    public void addFirstElementToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        Actions hover = new Actions(driver);
        hover.moveToElement(firstElementHover).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(addToCartFirstElement));
        addToCartFirstElement.click();
        // WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingElement));
        continueShoppingElement.click();
        if (cart.getText().contains(Constants.CART_QUANTITY)) {
            System.out.println("counting added items to cart are correct");
        } else {
            System.out.println("cart hasn't been updated");
        }
    }

    public void addSecondElementToCart() {
        Actions hover = new Actions(driver);
        hover.moveToElement(secondElementHover).build().perform();
        addToCartSecondElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Constants.TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutElement));
        proceedToCheckoutElement.click();
    }
}


