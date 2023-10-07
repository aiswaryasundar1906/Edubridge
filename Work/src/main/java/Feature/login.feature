Feature: Login to Facebook
  In this feature, we will log in to facebook website.
 
  Scenario: Login with correct credentials.
    Given user navigates to facebook website
    Then user enters the emailId as aiswarya.sundaraganesh1906@gmail.com
    Then user enters the password as k26711474
    Then user clicks on login button
    And user logged in successfully
    And user closes the browser
