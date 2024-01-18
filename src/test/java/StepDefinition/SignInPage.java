package StepDefinition;

import io.cucumber.java.en.When;
import static pages.SignInPage.*;
public class SignInPage {
    @When("User successfully enter the log in details")
    public void user_successfully_enter_the_log_in_details() {
     sendkeys_username();
     sendkeys_password();
     click_login_btn();
    }
    @When("User clicks on new Registration Button")
    public void user_clicks_on_new_registration_button() {
        // Write code here that turns the phrase above into concrete actions
        click_newregistration_btn();
    }
}
