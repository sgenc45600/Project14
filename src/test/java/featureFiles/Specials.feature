Feature: Testing the Specials Page functions

  Scenario: Checking the Specials
    Given I navigate to Website
    When I click on sign in button
    Then I enter email: "atlanta@gmail.com" I enter password: "Asdf4321-"
    Then I click submit button
    Then Click Specials
    Then Sort by price Lowest First
    Then Find out the number of the special items
    Then Check the discounted prices

