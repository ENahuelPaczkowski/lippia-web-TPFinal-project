@Shop
Feature: Shop

  Background:
    Given the client enter the Home page
    When the client click on "Shop" Menu
    When click on the Add to basket button on shop page
    Then user can view that book in the Menu item with price
    When click on Menu item
    When click on Proceed to Checkout button

  @PlaceOrderThroughItemLink
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

  @Tax
  Scenario Outline: Shop-Add to Basket-View Basket-Tax Functionality
    When user enter '<country>' on country textbox
    Then tax rate should be '<percentage>'% for <country>

    Examples:
      | country   | percentage |
      | India     | 2          |
      | Argentina | 5          |