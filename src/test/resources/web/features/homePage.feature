@Homepage
Feature: Home page
  Background:
    Given the client enter the Home page
    When the client click on "Shop" Menu
    And the client click on "Home" Menu
    Then the client verify the Homa page has '3' arrivals only
    When click the image in the arrivals
    Then test whether it is navigating to next page where the user can add that book into his basket
    When click on the Add to basket button
    Then user can view that book in the Menu item with price
    When click on Menu item
    Then user find total and subtotal values just above Proceed to Checkout button
    And the total always > subtotal
    When click on Proceed to Checkout button
    Then user can view Billing Details,Order Details,Additional details and Payment gateway details
    When user enter 'Crowdar' on 'first_name' textbox
    And user enter 'Academy' on 'last_name' textbox
    And user enter 'crowdar@mail.com' on 'email' textbox
    And user enter '123456' on 'phone' textbox
    And user enter 'Argentina' on country textbox
    And user enter 'Calle falsa 123' on 'address_1' textbox
    And user enter 'Concordia' on 'city' textbox
    And user enter 'Entre Rios' on state textbox
    And user enter '1234' on 'postcode' textbox
#  17. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Now click on Home menu button
#  5) Test whether the Home page has Three Arrivals only
#  6) The Home page must contains only three Arrivals
#  7) Now click the image in the Arrivals
#  8) Test whether it is navigating to next page where the user can add that book into his basket.
#  9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
#  10) Click on the Add To Basket button which adds that book to your basket
#  11) User can view that Book in the Menu item with price.
#  12) Now click on Item link which navigates to proceed to check out page.
#  13)Now user can find total and subtotal values just above the Proceed to Checkout button.
#  14)The total always < subtotal because taxes are added in the subtotal
#  15)Now click on Proceed to Check out button which navigates to payment gateway page.
#  16)User can view Billing Details,Order Details,Additional details and Payment gateway details.
#  17)Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
#  18)User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.
  Scenario Outline: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    When user select payment '<payment>'
    Then user has the feasibility to add coupon in the payment gateway page

    Examples:
      | payment                 |
#      | payment_method_bacs    |
      | payment_method_cheque          |
#      | payment_method_cod        |
#      | payment_method_ppec_paypal |

#  18. Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Now click on Home menu button
#  5) Test whether the Home page has Three Arrivals only
#  6) The Home page must contains only three Arrivals
#  7) Now click the image in the Arrivals
#  8) Test whether it is navigating to next page where the user can add that book into his basket.
#  9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
#  10) Click on the Add To Basket button which adds that book to your basket
#  11) User can view that Book in the Menu item with price.
#  12) Now click on Item link which navigates to proceed to check out page.
#  13) Now user can find total and subtotal values just above the Proceed to Checkout button.
#  14) The total always < subtotal because taxes are added in the subtotal
#  15) Now click on Proceed to Check out button which navigates to payment gateway page.
#  16) User can view Billing Details,Order Details,Additional details and Payment gateway details.
#  17) Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
#  18) Now click on Place Order button to complete process
#  19) On clicking place-order button user completes the process where the page navigates to Order confirmation page
#  with order details,bank details,customer details and billing details.

  Scenario: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
    When click on place order button
    Then user navigates to Order Confirmation page