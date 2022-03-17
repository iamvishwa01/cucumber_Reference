Feature: Validating data

  @smokeTest
 Scenario Outline: on the page
   Given user alredy on test page
   When user fill the both fields <Username> and <Password> and  submit
   Then data should saved
   And saved popup msg should appear
   But if if data is incorrect
   Then it should throw error
   Examples:
   | Username | Password |
   | sujeet | vishwakarma |
   | shivam | Vishwakarma |
   | Rahul | Yadav |
   | Ruchit | Japee |
   | Sanjay | Rajkonda |

@smokeTest
  Scenario Outline: on the page
    Given user alredy on test page
    When user fill the both fields <Username> and <Password> and  submit
    Then data should saved
    And saved popup msg should appear
    But if if data is incorrect
    Then it should throw error
    Examples:
      | Username | Password |
      | sujeet | vishwakarma |
      | shivam | Vishwakarma |
      | Rahul | Yadav |
      | Ruchit | Japee |
      | Sanjay | Rajkonda |

  Scenario Outline: on the page
    Given user alredy on test page
    When user fill the both fields <Username> and <Password> and  submit
    Then data should saved
    And saved popup msg should appear
    But if if data is incorrect
    Then it should throw error
    Examples:
      | Username | Password |
      | sujeet | vishwakarma |
      | shivam | Vishwakarma |
      | Rahul | Yadav |
      | Ruchit | Japee |
      | Sanjay | Rajkonda |