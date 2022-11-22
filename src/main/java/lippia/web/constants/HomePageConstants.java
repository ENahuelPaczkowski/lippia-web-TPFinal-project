package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class HomePageConstants {
    public static final String ARRIVALS = "xpath://*[@class='products']";
    public static final String ARRIVAL = "xpath://*[@class='products'][1]";
    public static final String ADD_TO_BASKET_BUTTON = "xpath://button[text()='Add to basket']";
    public static final String CART_CONTENTS = "xpath://span[@class='cartcontents']";
    public static final String SHOPPING_CART = "xpath://*[@id='wpmenucartli']/a";
    public static final String TOTALS_TABLE = "xpath://*[@class='cart_totals ']/table";
    public static final String CHECKOUT_BUTTON = "xpath://*[@id=\"page-34\"]/div/div[1]/div/div/div/a";
    public static final String SUBTOTAL = "xpath://*[contains(@data-title,'Subtotal')]";
    public static final String TOTAL = "xpath://*[contains(@data-title,'Total')]/strong";
    public static final String CHECKOUT_DETAILS = "id:customer_details";
    public static final String INPUT_COUNTRY = "id:s2id_autogen1";
    public static final String COUNTRY_FIRST_OPTION = "xpath://*[@id='select2-results-1']";
    public static final String COUNTRY_INDIA = "xpath://*[@id=\"select2-results-1\"]/li[2]";
    //*[@id="select2-results-1"]/li[2]

    public static final String INPUT_STATE = "id:s2id_autogen2";
    public static final String STATE_FIRST_OPTION = "xpath://*[@id='select2-results-2']/li";
    public static final String INPUT_PAYMENT = "xpath://*[contains(text(),'%s')]";
//    public static final String INPUT_PAYMENT = "id:%s";
//    public static final String INPUT_PAYMENT = "xpath://li[contains(@class,'%s')]/input";
    //li[contains(@class,'payment_method_bacs')]
    public static final String COUPON_FORM = "xpath://*[@class='checkout_coupon']";
    public static final String INPUT_TEXTBOX = "id:billing_%s";
    public static final String SHOW_COUPON = "xpath://*[@class='showcoupon']";
    public static final String PLACEORDER_BUTTON = "id:place_order";
    public static final String ORDER_CONFIRMATION_PAGE = "xpath://*[@class='woocommerce']";
}
