package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @And("enter {string} in register email-adress textbox")
    public void enterEmailInRegisterEmailAdressTextbox(String email) {
        RegistrationService.enterEmail(email);
    }

    @And("enter {string} in register password texbox")
    public void enterPasswordInRegisterPasswordTexbox(String password) {
        RegistrationService.enterPassword(password);
    }

    @And("click Register button")
    public void clickRegisterButton() {
        RegistrationService.clickRegisterButton();
    }

    @Then("show registration message error: {string}")
    public void showRegistrationMessageError(String message) {
        RegistrationService.verifyErroMessage(message);
    }
}
