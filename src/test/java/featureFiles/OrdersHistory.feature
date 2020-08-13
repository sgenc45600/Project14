Feature: Try the order histoy

  //Scenario: login in to Website

  Scenario: Checking contact us functionality
    Given I navigate to Website
    When I click on sign in button
    Then I enter email: "atlanta@gmail.com" I enter password: "Asdf4321-"
    Then I click submit button
    Given I click on contact us button