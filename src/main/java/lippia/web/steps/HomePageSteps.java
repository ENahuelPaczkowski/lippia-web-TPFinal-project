package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {

    @Given("the client enter the Home page")
    public void home() {
        HomePageService.navegarWeb();
    }

    @Then("the client verify the Homa page has '(.*)' arrivals only")
    public void verifyArrivals(int number) {
        HomePageService.verifyArrivals(number);
    }

    @When("click the image in the arrivals")
    public void clickTheImageInTheArrivals() {
        HomePageService.clickArrival();
    }

    @Then("test whether it is navigating to next page where the user can add that book into his basket")
    public void verifyTheUserCanAddThatBookIntoHisBasket() {
        HomePageService.findAddToBacketButton();
    }

    @When("click on the Add to basket button")
    public void clickOnTheAddToBasketButton() {
        HomePageService.clickAddToBasketButton();
    }

    @Then("user can view that book in the Menu item with price")
    public void userCanViewThatBookInTheMeniItemWithPrice() {
        HomePageService.verifyMenuItem();
    }

    @When("click on Menu item")
    public void clickOnMenuItem() {
        HomePageService.clickCartButton();
    }

    @Then("user find total and subtotal values just above Proceed to Checkout button")
    public void totalAndSubtotalAboveProceedToCheckoutButton() {
        HomePageService.verifyPosition();
    }

    @And("the total always > subtotal")
    public void theTotalAlwaysSubtotal() {
        HomePageService.verifyTotalBiggerThanSubtotal();
    }

    @When("click on Proceed to Checkout button")
    public void clickOnProceddToCheckoutButton() {
        HomePageService.clickCheckoutButton();
    }

    @Then("user can view Billing Details,Order Details,Additional details and Payment gateway details")
    public void verifyCheckoutDetails() {
        HomePageService.verifyCheckoutDetails();
    }

    @When("user enter {string} on {string} textbox")
    public void userFillBillingDetails(String data, String textbox) {
        HomePageService.setDetail(data, textbox);
    }

    @And("user enter {string} on country textbox")
    public void userCountryOnCountryTextbox(String country) {
        HomePageService.setCountry(country);
    }

    @And("user enter {string} on state textbox")
    public void userEnterStateOnStateTextbox(String state) {
        HomePageService.setState(state);
    }

    @And("user select payment {string}")
    public void userSelectPayment(String payment) {
        HomePageService.setPayment(payment);
    }

    @Then("user has the feasibility to add coupon in the payment gateway page")
    public void verifyAddCouponInThePaymentGatewayPage() {
        HomePageService.verifyAddCoupon();
    }

    @When("click on place order button")
    public void clickOnPlaceOrderButton() {
        HomePageService.clickPlaceOrderButton();
    }

    @Then("user navigates to Order Confirmation page")
    public void userNavigatesToOrderConfirmationPage() {
        HomePageService.verifyOrderConfirmationPage();
    }

}
