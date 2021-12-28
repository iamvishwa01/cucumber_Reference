Feature: NopCommerce application
  Scenario: login functionality check
    Given User on login page
    When User login with username "admin@yourstore.com" and password "admin"
    And Clicked on Login page
    Then User should able to logged in and redirect to Dashboard
    And Close the browser
