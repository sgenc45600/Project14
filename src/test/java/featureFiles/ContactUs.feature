Feature: Contact us

  //Scenario: login in to Website

  Scenario Outline: Checking contact us functionality
    Given I navigate to Website
    When I click on sign in button
    Then I enter email: "atlanta@gmail.com" I enter password: "Asdf4321-"
    Then I click submit button
    Given I click on contact us button
    When I select an "<MenuOption>" from Subject Heading
    And I select an "<Order reference>" from Order Reference
    And I select "<Product>" from product input
    Then I enter "<Message>"
    Then I click Send button
    Then I verify "Your message has been successfully sent to our team." text
    Then Sign out

    Examples:
      | MenuOption       | Order reference        | Product                                          | Message                     |
      | Customer service | FUUIEDAMF - 08/01/2020 | Printed Chiffon Dress - Color : Yellow, Size : S | Please check my order       |
      | Webmaster        | CLVKDVKMQ - 08/02/2020 | Printed Chiffon Dress - Color : Yellow, Size : S | Please check my order       |
      | Customer service | ERGARNZDJ - 08/03/2020 | Printed Chiffon Dress - Color : Yellow, Size : S | I want to return my package |




