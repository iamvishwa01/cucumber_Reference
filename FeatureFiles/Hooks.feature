Feature: Validating data

#  @smokeTest
#  Scenario Outline: on the page
#    Given user alredy on test page
#    When user fill the both fields <Username> and <Password> and  submit
#    Then data should saved
#    And saved popup msg should appear
#    But if if data is incorrect
#    Then it should throw error
#    Examples:
#      | Username | Password |
#      | sujeet | vishwakarma |
#      | shivam | Vishwakarma |


  @MobileTesting
  Scenario:
    Given user on login page
    When user login to using username "sujeet" and password "pass"
    And user redirect to homepage
    But if username and password not matches
    Then Error msg should appear
