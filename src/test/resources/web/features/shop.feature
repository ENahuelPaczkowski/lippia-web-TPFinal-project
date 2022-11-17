@Shop
Feature: Shop

  Background:
    Given the client enter the Home page
    When the client click on "Shop" Menu
    When click on the Add to basket button on shop page
    Then user can view that book in the Menu item with price
    When click on Menu item
    Then user find total and subtotal values just above Proceed to Checkout button
    And the total always > subtotal
    When click on Proceed to Checkout button
    Then user can view Billing Details,Order Details,Additional details and Payment gateway details

#  11.Shop-Add to Basket-View Basket through Item link
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on the Add To Basket button which adds that book to your basket
#  5) User can view that Book in the Menu item with price .
#  6) Now click on Item link which navigates to proceed to check out page.
#  7) Now user can find total and subtotal values just above the Proceed to Checkout button.
#  8) The total always < subtotal because taxes are added in the subtotal
#  9) Now click on Proceed to Check out button which navigates to payment gateway page.
#  10) User can view Billing Details,Order Details,Additional details and Payment gateway details.
#  11) Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
#  12) Now click on Place Order button to complete process
#  13) On clicking place order button user completes his process where the page navigates to Order confirmation page
#  with order details,bank details,customer details and billing details
  Scenario: Shop-Add to Basket-View Basket through Item link
    When user enter 'Crowdar' on 'first_name' textbox
    And user enter 'Academy' on 'last_name' textbox
    And user enter 'crowdar@mail.com' on 'email' textbox
    And user enter '123456' on 'phone' textbox
    And user enter 'Argentina' on country textbox
    And user enter 'Calle falsa 123' on 'address_1' textbox
    And user enter 'Concordia' on 'city' textbox
    And user enter 'Entre Rios' on state textbox
    And user enter '1234' on 'postcode' textbox
    When click on place order button
    Then user navigates to Order Confirmation page

#  12. Shop-Add to Basket-View Basket-Tax Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on the Add To Basket button which adds that book to your basket
#  5) User can view that Book in the Menu item with price .
#  6) Now click on Item link which navigates to proceed to check out page.
#  7) Now user can find total and subtotal values just above the Proceed to Checkout button.
#  8) The total always < subtotal because taxes are added in the subtotal
#  9) The tax rate variers for India compared to other countries
#  10) Tax rate for indian should be 2% and for abroad it should be 5%
  @Nahuel
  Scenario Outline: Shop-Add to Basket-View Basket-Tax Functionality
    When user enter '<country>' on country textbox
    Then tax rate should be '<percentage>'% for <country>

    Examples:
      | country   | percentage |
      | India     | 2          |
#      | Argentina | 5          |
#      | Canada    | 5          |