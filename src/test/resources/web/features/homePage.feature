@Homepage
Feature: Home page

  Background:
    Given the client enter the Home page
    When click the image in the arrivals
    When click on the Add to basket button
    Then user can view that book in the Menu item with price
    When click on Menu item
    When click on Proceed to Checkout button
    When user enter 'Crowdar' on 'first_name' textbox
    And user enter 'Academy' on 'last_name' textbox
    And user enter 'crowdar@mail.com' on 'email' textbox
    And user enter '123456' on 'phone' textbox
    And user enter 'Argentina' on country textbox
    And user enter 'Calle falsa 123' on 'address_1' textbox
    And user enter 'Concordia' on 'city' textbox
    And user enter 'Entre Rios' on state textbox
    And user enter '1234' on 'postcode' textbox

  @PaymentGateway
  Scenario Outline: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    Then user can select payment '<payment>'
    Then user has the feasibility to add coupon in the payment gateway page

    Examples:
      | payment                 |
      | Direct Bank Transfer    |
      | Check Payments          |
      | Cash on Delivery        |
      | PayPal Express Checkout |

  @PlaceOrder
  Scenario: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
    When click on place order button
    Then user navigates to Order Confirmation page