package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class MyAccountService extends ActionManager {

    public static void clickAccountdetailButton() {
        waitClickable(MyAccountConstants.ACCOUNTDETAIL_BUTTON);
        click(MyAccountConstants.ACCOUNTDETAIL_BUTTON);
    }

    public static void verifyPasswordChangeOption() {
        waitPresence(MyAccountConstants.PASSWORD_CHANGE);
        Assert.assertTrue(getElement(MyAccountConstants.PASSWORD_CHANGE).isDisplayed(),"No se encontro la seccion de cambio de password");
    }

    public static void clickLogoutButton() {
        click(MyAccountConstants.LOGOUT_BUTTON);
    }

    public static void verifyLogout() {
        Assert.assertTrue(getElement(MyAccountConstants.LOGIN_PAGE).isDisplayed(),"No se encontro la pagina de Login");
    }
}
