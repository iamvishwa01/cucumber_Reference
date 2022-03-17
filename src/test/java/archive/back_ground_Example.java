package archive;

import io.cucumber.java.en.*;

public class back_ground_Example {

    //a pre-requiste to all the test cases/ scenario

    // it will run first then execute all the test cases

    @Given("^Browser should launch$")
    public void browser_should_launch() throws Throwable {
      System.out.println("Browser should launch");
    }

    @Given("^User on login page$")
    public void user_on_login_page() throws Throwable {
        System.out.println("User on login page");
    }

    @When("^browser should load the URL$")
    public void browser_should_load_the_url() throws Throwable {
        System.out.println("browser should load the URL");
    }

    @When("^User login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("User login with username and password");
    }

    @Then("^Page should load$")
    public void page_should_load() throws Throwable {
        System.out.println("Page should load");
    }

    @Then("^User should able to logged in and redirect to Dashboard$")
    public void user_should_able_to_logged_in_and_redirect_to_dashboard() throws Throwable {
        System.out.println("User should able to logged in and redirect to Dashboard");
    }

    @And("^Clicked on Login page$")
    public void clicked_on_login_page() throws Throwable {
        System.out.println("User should able to logged in and redirect to Dashboard");
    }

    @And("^Close the browser$")
    public void close_the_browser() throws Throwable {
        System.out.println("Close the browser");
    }

}
