Feature: user Login with edubridge app
Scenario Outline: Valid user login successfull
    Given The user is on the login page
    When They enter "<username>" and "<password>"
    Then Message displayed Login Successfully
Examples:

    | username   | password |
    | aiswarya | admin_world |