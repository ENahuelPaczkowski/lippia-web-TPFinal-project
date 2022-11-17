package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShopService extends ActionManager {

    public static void verifyTaxRate(double percentage) {
        double subtotal = getSubtotal();
        double tax = getTax();
        double taxRate = (subtotal * tax)/100;

        Assert.assertEquals(taxRate, percentage, "El porcentaje de impuestos no es el esperado");
    }

    public static double getSubtotal(){
        WebElement subtotal = getElement(ShopConstants.SUBTOTAL);
        return Double.parseDouble(subtotal.getText().substring(1));
    }

    public static double getTax(){
        WebElement total = getElement(ShopConstants.TAX);
        return Double.parseDouble(total.getText().substring(1));
    }

    public static void clickAddToBacketButton() {
        WebElement element = getElement(ShopConstants.ADD_TO_BACKET_BUTTON);
        click(element);
    }
}
