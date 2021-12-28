package StepDef;

import PageObj.LoginObj;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.Password;

public class LoginStepDef extends BaseClass{
    public WebDriver driver;
    LoginObj  l1;
    @Given("User on login page")
    public void user_on_login_page() {
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }
    @When("User login with username {string} and password {string}")
    public void user_login_with_username_and_password(String Username, String Password) {
    l1 = new LoginObj(driver);
    l1.setUsername().clear();
    l1.SetPassword().clear();
    l1.setUsername().sendKeys(Username);
        l1.SetPassword().sendKeys(Password);

    }
    @When("Clicked on Login page")
    public void clicked_on_login_page() {
        l1.ClickLogin().click();
    }
    @Then("User should able to logged in and redirect to Dashboard")
    public void user_should_able_to_logged_in_and_redirect_to_dashboard() {
        Assert.assertEquals("Dashboard / nopCommerce administration",driver.getTitle());
    }
    @Then("Close the browser")
    public void close_the_browser() {
    driver.close();
    }
}
