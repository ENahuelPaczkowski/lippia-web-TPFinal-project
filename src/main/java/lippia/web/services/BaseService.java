package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.BaseConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class BaseService extends ActionManager {

    public static void cerrarPopup(String boton) {
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        if (url.contains("/#google_vignette")) {
            setUrl(boton);
        }

    }

    public static void setUrl(String boton) {
        switch (boton) {
            case "My Account":
                navigateTo("http://practice.automationtesting.in/my-account/");
                break;
            case "Shop":
                navigateTo("https://practice.automationtesting.in/shop/");
                break;
            case "Tests Cases":
                navigateTo("https://practice.automationtesting.in/test-cases/");
                break;
            case "Account Details":
                navigateTo("https://practice.automationtesting.in/my-account/edit-account/");
                break;
            case "Home":
                navigateTo("https://practice.automationtesting.in/");
                break;
            default:
                System.out.println("No se encontro la url");
        }
    }
}
