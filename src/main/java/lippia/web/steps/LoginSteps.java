package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BaseService;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;

public class LoginSteps extends PageSteps {

    @When("the client click on {string} Menu")
    public void navigateToButtonMenu(String button) {
        LoginService.clickButtonMenu(button);
        BaseService.cerrarPopup(button);
    }

    @And("enter registered in username texbox")
    public void enterRegisteredInUsernameTexbox() {
        String username = PropertyManager.getProperty("valid.user");
        LoginService.enterUsername(username);
    }

    @And("enter password in password textbox")
    public void enterPasswordInPasswordTextbox() {
        String password = PropertyManager.getProperty("valid.pass");
        LoginService.enterPassword(password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        LoginService.clickLoginButton();
    }

    @Then("login to the web page")
    public void verifyLogin() {
        LoginService.verifyLogin();
    }

    @When("enter the case changed username in username textbox")
    public void enterTheCaseChangedUsernameInUsernameTextbox() {
        String username = PropertyManager.getProperty("invalid.user");
        LoginService.enterUsername(username);
    }

    @And("enter the case chenged password in the password tetxbox")
    public void enterTheCaseChengedPasswordInThePasswordTetxbox() {
        String password = PropertyManager.getProperty("invalid.pass");
        LoginService.enterPassword(password);
    }

    @Then("login must fail saying incorrect username-password")
    public void loginMustFailSayingIncorrectUsernamePassword() {
        LoginService.verifyErrorMessage();
    }

    @When("click on sign out link")
    public void clickSignOut() {
        LoginService.clickSignOut();
    }

    @Then("sign out of the site")
    public void signOutOfTheSite() {
        MyAccountService.verifyLogout();
    }

    @When("press back button")
    public void pressBackButton() {
        LoginService.pressBackButton();
    }

    @Then("user shouldn’t be signed in to his account")
    public void userShouldnTBeSignedInToHisAccount() {
        LoginService.verifySignout();
    }
}
