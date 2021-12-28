package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObj {
public WebDriver driver;

public LoginObj(WebDriver driver){
    this.driver=driver;
}
    By username = By.id("Email");
    By password = By.id("Password");
    By submit = By.xpath("//button[@type='submit']");
    public WebElement setUsername(){
        return driver.findElement(username);
    }
    public WebElement SetPassword(){
        return driver.findElement(password);
    }
    public WebElement ClickLogin(){
        return driver.findElement(submit);
    }

}
