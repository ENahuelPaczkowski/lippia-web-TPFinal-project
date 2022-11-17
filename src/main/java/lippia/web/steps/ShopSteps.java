package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {

    @Then("tax rate should be '(.*)'% for (.*)")
    public void taxRateShouldBePercentageForCountry(double percentage) {
        ShopService.verifyTaxRate(percentage);
    }

    @When("click on the Add to basket button on shop page")
    public void clickOnTheAddToBasketButtonOnShopPage() {
        ShopService.clickAddToBacketButton();
    }
}
