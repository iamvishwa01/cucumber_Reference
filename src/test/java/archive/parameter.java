package archive;

import io.cucumber.java.en.*;

public class parameter {

    @Given("^user on login page$")
    public void user_on_login_page() throws Throwable {
        System.out.println("user on login page");
    }

    @When("^user login to using username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_using_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("user login to application using username" + " " +strArg1 );
        System.out.println("user login to application using password" + " " +strArg2 );
    }



    @Then("^Error msg should appear$")
    public void error_msg_should_appear() throws Throwable {
        System.out.println("Error msg should appear");
    }

    @And("^user redirect to homepage$")
    public void user_redirect_to_homepage() throws Throwable {
        System.out.println("user redirect to homepage");
    }

    @But("^if username and password not matches$")
    public void if_username_and_password_not_matches() throws Throwable {
        System.out.println("if username and password not matches");
    }

}
