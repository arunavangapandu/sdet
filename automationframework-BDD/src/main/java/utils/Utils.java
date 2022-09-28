package utils;

import com.sun.tools.internal.jxc.ap.Const;
import drivers.DriverSingleton;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Random;

public class Utils {
    public static String decode64(String encodedStr){
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodedStr.getBytes()));
    }

    public static boolean takeScreenShot() {
        TakesScreenshot takesScreenshot = ((TakesScreenshot) DriverSingleton.getDriver());
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
           FileUtils.copyFile(file, new File(Constants.SCREENSHOTS_FOLDER +
                    generateRandomString(
                    Constants.SCREENSHOT_NAME_LENGTH)+
                        Constants.SCREENSHOT_EXTENSION));
           // FileUtils.copyFile(file, new File("prints//screenshot.png"));
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    private static String generateRandomString(int length) {
        String seedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        int  i = 0;
        Random random = new Random();
        while(i < length) {
            int bound = random.nextInt(seedChars.length());
            sb.append(seedChars.charAt(bound));
            i++;
        }
        return sb.toString();
    }
}
