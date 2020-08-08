Feature: Contact us

  Scenario: login in to Website
    Given I navigate to Website
    When I click on sign in button
    Then I enter email: "atlanta@gmail.com" I enter password: "Asdf4321-"
    Then I click submit button

  Scenario Outline: Checking contact us functionality
    Given I click on contact us button
    When I select an "<MenuOption>" from Subject Heading
    And I select an "<Option>" from Order Reference
    And I select product from product input
    Then I enter "<Message>"
    Then I click Send button
    Examples:
      | MenuOption       | Option   | Message                            |
      | Customer Service | Option 1 | Please check my order              |
      | Webmaster        | Option 2 | I could not sign in my credentials |
      | Customer Service | Option 3 | I want to return my package        |




