Feature: Application HDFC bank
#  Scenario: Login check
#    Given user on login page
#    When user login to application using username and password
#    And if username and password matches
#    Then redirect to home page
#    But if username and password not matches
#    Then error msg should show up



  Scenario: Register User to portal
    Given User sign up page
    When user login with below details
    | sujeet | pass | email@email | number123 | zip231 |
    Then user should register successfully
    And user popup msg appear
    But if data is not correct then error msg should show up
    Then Error msg appear
