package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void clickButtonMenu(String button) {
        click(String.format(LoginConstants.BUTTON_MENU, button));
    }

    public static void enterUsername(String username) {
        waitPresence(LoginConstants.LOGIN_USERNAME_TEXTBOX);
        setInput(LoginConstants.LOGIN_USERNAME_TEXTBOX, username);
    }

    public static void enterPassword(String password) {

        setInput(LoginConstants.LOGIN_PASSWORD_TEXTBOX, password);
    }

    public static void clickLoginButton() {
        waitClickable(LoginConstants.LOGIN_BUTTON);
        click(LoginConstants.LOGIN_BUTTON);
    }

    public static void verifyLogin() {
        waitPresence(LoginConstants.LOGOUT);
        Assert.assertTrue(getElement(LoginConstants.LOGOUT).isDisplayed(), "No se encontro el boton de Logout");
    }

    public static void verifyErrorMessage() {
        Assert.assertTrue(getElement(LoginConstants.LOGIN_ERROR).isDisplayed(),"No se encontro el mensaje de error");
    }

    public static void clickSignOut() {
        click(LoginConstants.SINGOUT);
    }

    public static void pressBackButton() {
        DriverManager.getDriverInstance().navigate().back();
    }

    public static void verifySignout() {
        Assert.assertFalse(isPresent(LoginConstants.SINGOUT),"Sign out no se realizo correctamente");
    }
}
