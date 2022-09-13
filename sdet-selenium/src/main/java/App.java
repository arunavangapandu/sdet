import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.disney.com/");

       // WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));

        /*WebElement  loginButton = driver.findElement(By.id("login_google_submit"));
        loginButton.click();*/

        WebElement  image = driver.findElement(By.id("#ref-1-4 > div > ul > li:nth-child(2) > div > div > a"));
        image.click();


        /*String titleText = titleOfWebPage.getText();

        String expectedText = "Wikipedia";

        if(titleText.equals(expectedText)){
            System.out.println("Test has passed!");
        }
        else{
            System.out.println("Test did not pass!");
            driver.close();
            throw new Exception();
        }
*/
        //driver.close();
    }
}
