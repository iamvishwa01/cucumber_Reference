package StepDef;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class BaseClass {
    public WebDriver driver;

    public void captureScreen(WebDriver driver, String name) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trgt = new File(System.getProperty("user.dir") + "/screenshots" + name + ".png");
        FileUtils.copyFile(src, trgt);
        System.out.println("Screenshot taken");
    }

    public String getTitle() {

        return driver.getTitle();
    }

}
