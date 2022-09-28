/*
import java.io.File;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.annotations.Test;

public class page{
@Test
public void take() throws IOException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver  = new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
//step 1: Convert your driver to an object to TakeScreenshot
TakesScreenshot screenshot =((TakesScreenshot)driver);
//step 2: Call getScreenshotAs method to create image file
File file = screenshot.getScreenshotAs(OutputType.FILE);
//step 3: Copy file to the Location you want
FileUtils.copyFile(file, new File("prints//screenshot.png"));
}
}*/
