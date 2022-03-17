package StepDef;

import io.cucumber.java.en.*;

public class hooks_test {

    @Given("^user alredy on test page$")
    public void user_alredy_on_test_page() throws Throwable {
       System.out.println("user alredy on test page");
    }

    @Given("^user on login page$")
    public void user_on_login_page() throws Throwable {
        System.out.println("user on login page");
    }

    @When("^user fill the both fields (.+) and (.+) and  submit$")
    public void user_fill_the_both_fields_and_and_submit(String username, String password) throws Throwable {
        System.out.println("user fill the both fields (.+) and (.+) and  submit");
    }

    @When("^user login to using username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_using_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("user login to using username and password ");
    }

    @Then("^data should saved$")
    public void data_should_saved() throws Throwable {
        System.out.println("data should saved");
    }

    @Then("^it should throw error$")
    public void it_should_throw_error() throws Throwable {
        System.out.println("it should throw error");
    }

    @Then("^Error msg should appear$")
    public void error_msg_should_appear() throws Throwable {
        System.out.println("Error msg should appear");
    }

    @And("^saved popup msg should appear$")
    public void saved_popup_msg_should_appear() throws Throwable {
        System.out.println("saved popup msg should appear");
    }

    @And("^user redirect to homepage$")
    public void user_redirect_to_homepage() throws Throwable {
        System.out.println("user redirect to homepage");
    }

    @But("^if if data is incorrect$")
    public void if_if_data_is_incorrect() throws Throwable {
        System.out.println("if if data is incorrect");
    }

    @But("^if username and password not matches$")
    public void if_username_and_password_not_matches() throws Throwable {
        System.out.println("if username and password not matches");
    }


}
