Feature: Login into the application
Background:
  Given open the browser

@multipleloginmobile @android
  Scenario Outline: Login into the android applications with valid credentials
    Given User opens the application url
    When user enters the email "<id>" and "<password>"
    And clicks on login button
    Then home page should be displayed
    Examples:
     | id | password|
     | madhu | good@123 |
     | ravi | great@123 |

  @multiplefieldsmobile @ios
  Scenario: Login into the ios applications with valid credentials
    Given User opens the application url
    When user enters the
      | madhu |
      | ravi |
      | meena |
    And clicks on login button
    Then home page should be displayed

