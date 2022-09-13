import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.udemy.com");
        WebElement signUpButton = driver.findElement(By.cssSelector("#udemy > div.main-content-wrapper >" +
                " div.ud-app-loader.ud-component--header-v6--header.udlite-header.ud-app-loaded > div.udlite-text-sm.header--header--3sK1h.header--flex-middle--2Xqjv > div:nth-child(9) > a > span"));
        // clicking with Javascript executor
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);

        // setting up timeouts
        ((JavascriptExecutor)driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        // changing the webpage
        ((JavascriptExecutor) driver).executeScript("window.location='https://wikipedia.com'");
        // scroll the webpage
        ((JavascriptExecutor) driver).executeScript("window.location='https://wikipedia.com'");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");
        // driver.close();
    }
}
