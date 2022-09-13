import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframesTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_layout_float");

        /*String title = driver.switchTo().frame(0).findElement(By.cssSelector("#main > h1")).getText();
        System.out.println(title);
*/
        // driver.findElement(By.id("iframeResult"));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body > section > nav > ul > li:nth-child(1) > a")).click();

        //driver.switchTo().parentFrame();

        Thread.sleep(5000);
    }
}
