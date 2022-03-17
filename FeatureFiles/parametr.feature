Feature:
  Scenario:
    Given user on login page
    When user login to using username "sujeet" and password "pass"
    And user redirect to homepage
    But if username and password not matches
    Then Error msg should appear

