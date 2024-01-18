package StepDefinition;

import io.cucumber.java.en.Then;
import static pages.RegistrationPage.*;
import static org.junit.Assert.assertEquals;
public class RegistrationPage {
    @Then("User should be able to view the Registration Page")
    public void user_should_be_able_to_view_the_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        String actualRegistrationPageHeading=visibility_registrationheading();
        assertEquals(actualRegistrationPageHeading,"User Registration Page");
    }
}
