package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class BaseService extends ActionManager {

    public static void cerrarPopup(String boton) {
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        if (url.contains("/#google_vignette")) {
            setUrl(boton);
        }

    }
    public static void cerrarPopup() {
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        navigateTo(url.replace("/#google_vignette",""));
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
            case "Shopping Cart":
                navigateTo("https://practice.automationtesting.in/basket/");
                break;
            case "Sellect Arrival":
                navigateTo("https://practice.automationtesting.in/product/selenium-ruby/");
                break;
            default:
                System.out.println("No se encontro la url");
        }
    }

    public static void scrollDown(String pixels){
        String script = String.format("window.scrollBy(0,%s)", pixels);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriverInstance();
        js.executeScript(script);
    }

    public static void scrollTop(){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriverInstance();
        js.executeScript("window.scrollTo(0, 0)");
    }

    public static void scrollbottom(){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriverInstance();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void getMyWait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
