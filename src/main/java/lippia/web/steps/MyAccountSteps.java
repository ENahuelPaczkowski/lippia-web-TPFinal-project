package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BaseService;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps extends PageSteps {

    @When("click on Account Details")
    public void clickAccountDetails() {
        MyAccountService.clickAccountdetailButton();
        BaseService.cerrarPopup("Account Details");
    }

    @Then("verify change password in accounts details")
    public void verifyChangePasswordOption() {
        MyAccountService.verifyPasswordChangeOption();
    }

    @When("click on Logout button")
    public void clickLogoutButton() {
        MyAccountService.clickLogoutButton();
    }

    @Then("verify loguot successfully")
    public void verifyLoguotSuccessfully() {
        MyAccountService.verifyLogout();
    }
}
