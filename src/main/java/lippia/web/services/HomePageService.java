package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void verifyArrivals(int number) {
        List<WebElement> elements = getElements(HomePageConstants.ARRIVALS);
        Assert.assertEquals(elements.size(), number,"El numero de arrivals encontrados no es el esperado");
    }

    public static void clickArrival() {
        click(HomePageConstants.ARRIVAL);
    }

    public static void findAddToBacketButton() {
        Assert.assertTrue(getElement(HomePageConstants.ADD_TO_BASKET_BUTTON).isDisplayed(), "No se encontro el boton Add to basket");
    }

    public static void clickAddToBasketButton() {
        click(HomePageConstants.ADD_TO_BASKET_BUTTON);
    }

    public static void verifyMenuItem() {
        String cartcontents = getText(HomePageConstants.CART_CONTENTS);
        Assert.assertNotEquals(cartcontents, "0 items", "La cantidad de items en el carrito es 0");

        String amount = getText(HomePageConstants.CART_AMOUNT);
        Assert.assertNotEquals(amount, "₹0.00", "El dinero en el carrito es 0.00");
    }

    public static void clickCartButton() {
        click(HomePageConstants.CART_CONTENTS);
    }

    public static void verifyPosition() {
        WebElement totals = getElement(HomePageConstants.TOTALS_TABLE);
        WebElement checkoutButton = getElement(HomePageConstants.CHECKOUT_BUTTON);
        Assert.assertTrue(totals.getLocation().getY() < checkoutButton.getLocation().getY(), "La posicion de los elementos no es la esperada");
    }

    public static void verifyTotalBiggerThanSubtotal() {
        double subtotal = getSubtotal();
        double total = getTotal();

        Assert.assertTrue(subtotal < total, "El subtotal es mayo al subtotal");
    }

    public static double getSubtotal(){
        WebElement subtotal = getElement(HomePageConstants.SUBTOTAL);
        return Double.parseDouble(subtotal.getText().substring(1));
    }

    public static double getTotal(){
        WebElement total = getElement(HomePageConstants.TOTAL);
        return Double.parseDouble(total.getText().substring(1));
    }
    public static void clickCheckoutButton() {
        click(HomePageConstants.CHECKOUT_BUTTON);
    }

    public static void verifyCheckoutDetails() {
        Assert.assertTrue(getElement(HomePageConstants.CHECKOUT_DETAILS).isDisplayed(),"No se encontraron los detalles del checkout");
    }

    public static void setCountry(String country) {
        setInput(HomePageConstants.INPUT_COUNTRY, country);
        Actions action = new Actions(DriverManager.getDriverInstance());
        WebElement element = getElement(HomePageConstants.COUNTRY_FIRST_OPTION);
        action.moveToElement(element).click();
//        waitVisibility(HomePageConstants.COUNTRY_FIRST_OPTION);
//        click(HomePageConstants.COUNTRY_FIRST_OPTION);
    }

    public static void setState(String state){
        setInput(HomePageConstants.INPUT_STATE, state);
        Actions action = new Actions(DriverManager.getDriverInstance());
        WebElement element = getElement(HomePageConstants.STATE_FIRST_OPTION);
        action.moveToElement(element).click();
//        waitVisibility(HomePageConstants.STATE_FIRST_OPTION);
//        click(HomePageConstants.STATE_FIRST_OPTION);
    }

    public static void setPayment(String payment){
//        setCheckbox(String.format(HomePageConstants.INPUT_PAYMENT,payment), false);
//        click(String.format(HomePageConstants.INPUT_PAYMENT,payment));
//
//        getElement(String.format(HomePageConstants.INPUT_PAYMENT,payment)).;

        Actions action = new Actions(DriverManager.getDriverInstance());
        WebElement element = getElement(String.format(HomePageConstants.INPUT_PAYMENT,payment));
        action.moveToElement(element).click();
    }

    public static void verifyAddCoupon() {
//        Actions action = new Actions(DriverManager.getDriverInstance());
//        WebElement element = getElement(HomePageConstants.SHOW_COUPON);
//        action.moveToElement(element).click();
        click(HomePageConstants.SHOW_COUPON);
        Assert.assertTrue(getElement(HomePageConstants.COUPON_FORM).isDisplayed(), "No se encotro el formulario para agregar cupon");
    }

    public static void setDetail(String data, String textbox) {
        setInput(String.format(HomePageConstants.INPUT_TEXTBOX, textbox), data);
    }

    public static void clickPlaceOrderButton() {
        click(HomePageConstants.PLACEORDER_BUTTON);
    }

    public static void verifyOrderConfirmationPage() {
        Assert.assertTrue(getElement(HomePageConstants.ORDER_CONFIRMATION_PAGE).isDisplayed(), "No se encotro la pagina de confirmacion de la compra");
    }
}
