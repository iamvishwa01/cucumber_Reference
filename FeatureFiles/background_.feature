Feature:
  Background: invoking chrome browser
    Given Browser should launch
    When browser should load the URL
    Then Page should load
  Scenario: login functionality check
    Given User on login page
    When User login with username "admin@yourstore.com" and password "admin"
    And Clicked on Login page
    Then User should able to logged in and redirect to Dashboard
    And Close the browser