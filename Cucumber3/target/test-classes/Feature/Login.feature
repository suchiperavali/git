Feature: Login Feature
  Verify if user is able to Login in to the site
@tag1
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters "john" and "12345"
    
    @tag2
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters "Ron" and "12345"