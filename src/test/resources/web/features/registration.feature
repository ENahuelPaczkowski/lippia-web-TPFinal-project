@Registration
Feature: Registration

#  4. Registration with empty password
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter valid Email Address in Email-Address textbox
#  5) Enter empty password in password textbox
#  6) Click on Register button
#  7) Registration must fail with a warning message(ie please enter an account password)
  Scenario Outline: Registration Failure
    Given the client enter the Home page
    When the client click on 'My Account' Menu
    And enter '<email>' in register email-adress textbox
    And enter '<password>' in register password texbox
    And click Register button
    Then show registration message error: '<message>'

    Examples:
      | email          | password | message                                      |
      | valid@mail.com |          | Error: Please enter an account password.     |
      |                |          | Error: Please provide a valid email address. |

#  5. Registration with empty Email-id & password
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on My Account Menu
#  4) Enter empty Email Address in Email-Address textbox
#  5) Enter empty password in password textbox
#  6) Click on Register button
#  7) Registration must fail with a warning message(ie please provide valid email address)