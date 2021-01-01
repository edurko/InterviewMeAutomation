package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CommonUtils {
    private WebDriver driver;

    public CommonUtils(WebDriver driver) {
        this.driver = driver;
    }


    public void takeScreenShot(WebDriver driver)throws IOException{
       File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile, new File("screenshit.png"));
   }
}
