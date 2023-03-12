Feature: As a new user to Mercury Tours
  I need to register to the system
  So that I can utilize its services
  Background: user should be on Registration page
    Given user is on Mercury Home Page -->Register Page
    Scenario: new user registration
      Given user enter first name as "Imperial"
      And user enter last name as "college"
      When user clicks on submit
      Then salutation message will denote as "Dear Imperial College,"