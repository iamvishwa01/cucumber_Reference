package Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Helper {
public WebDriver driver;

    public static void getSS(WebDriver driver,String name){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trgt = new File(System.getProperty("user.dir")+"/screenshots/"+name+"_"+getDate()+".png");
    }

    public static String  getDate(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd_MM_yyyy HH_mm_ss");
        return myDateObj.format(myFormatObj);
    }


}
