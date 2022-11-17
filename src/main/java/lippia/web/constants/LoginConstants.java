package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class LoginConstants {


    public static final String LOGIN_USERNAME_TEXTBOX = "id:username";
    public static final String LOGIN_PASSWORD_TEXTBOX = "id:password";
    public static final String LOGIN_BUTTON = "xpath://input[@name='login']";
    public static final String LOGOUT = "xpath://a[contains(text(),'Logout')]";;
    public static final String BUTTON_MENU = "xpath://a[contains(text(),'%s')]";
    public static final String LOGIN_ERROR = "xpath://*[@class='woocommerce-error']";
    public static final String SINGOUT = "xpath://*[contains(text(),'Sign out')]";
}
