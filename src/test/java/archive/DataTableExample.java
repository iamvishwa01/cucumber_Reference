package archive;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class DataTableExample {

    @Given("^user on login page$")
    public void user_on_login_page() throws Throwable {
        System.out.println("user on login page");
    }

    @Given("^User sign up page$")
    public void user_sign_up_page() throws Throwable {
        System.out.println("User sign up page");
    }

    @When("^user login to application using username and password$")
    public void user_login_to_application_using_username_and_password() throws Throwable {
        System.out.println("user login to application using username and password");
    }

    @When("^user login with below details$")
    public void user_login_with_below_details(DataTable data) throws Throwable {
        System.out.println("user login with below details");
           List<List<String>> obj = data.asLists(String.class);
           System.out.println(obj.get(0).get(0));
           System.out.println(obj.get(0).get(1));
           System.out.println(obj.get(0).get(2));
    }

    @Then("^redirect to home page$")
    public void redirect_to_home_page() throws Throwable {
        System.out.println("redirect to home page");
    }

    @Then("^error msg should show up$")
    public void error_msg_should_show_up() throws Throwable {
        System.out.println("error msg should show up");
    }

    @Then("^user should register successfully$")
    public void user_should_register_successfully() throws Throwable {
        System.out.println("user should register successfully");
    }

    @Then("^Error msg appear$")
    public void error_msg_appear() throws Throwable {
        System.out.println("Error msg appear");
    }

    @And("^if username and password matches$")
    public void if_username_and_password_matches() throws Throwable {
        System.out.println("if username and password matches");
    }

    @And("^user popup msg appear$")
    public void user_popup_msg_appear() throws Throwable {
        System.out.println("user popup msg appear");
    }

    @But("^if username and password not matches$")
    public void if_username_and_password_not_matches() throws Throwable {
        System.out.println("if username and password not matches");
    }

    @But("^if data is not correct then error msg should show up$")
    public void if_data_is_not_correct_then_error_msg_should_show_up() throws Throwable {
        System.out.println("if username and password not matches");
    }

}
