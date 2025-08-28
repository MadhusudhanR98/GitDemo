Feature: Login into the application
Background:
  Given open the browser
  When user enter the url
  Then login page is displayed

@multipleloginmobile
  Scenario Outline: Login into the applications with valid credentials
    Given User opens the application url
    When user enters the email "<id>" and "<password>"
    And clicks on login button
    Then home page should be displayed
    Examples:
     | id | password|
     | madhu | good@123 |
     | ravi | great@123 |

  @multiplefieldsmobile
  Scenario: Login into the applications with valid credentials
    Given User opens the application url
    When user enters the
      | madhu |
      | ravi |
      | meena |
    And clicks on login button
    Then home page should be displayed

