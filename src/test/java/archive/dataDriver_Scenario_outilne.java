package archive;

import io.cucumber.java.en.*;

public class dataDriver_Scenario_outilne {
    @Given("^user alredy on test page$")
    public void user_alredy_on_test_page() throws Throwable {
        System.out.println("user alredy on test page");
    }

    @When("^user fill the both fields (.+) and (.+) and  submit$")
    public void user_fill_the_both_fields_and_and_submit(String username, String password) throws Throwable {
        System.out.println("user fill the both fields and submit");
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^data should saved$")
    public void data_should_saved() throws Throwable {
        System.out.println("data should saved");
    }

    @Then("^it should throw error$")
    public void it_should_throw_error() throws Throwable {
        System.out.println("it should throw error");
    }

    @And("^saved popup msg should appear$")
    public void saved_popup_msg_should_appear() throws Throwable {
        System.out.println("saved popup msg should appear");
    }

    @But("^if if data is incorrect$")
    public void if_if_data_is_incorrect() throws Throwable {
        System.out.println("if if data is incorrect");
    }


}
