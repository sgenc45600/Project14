Feature: Testing the Specials Page functions

  Scenario: Checking the Specials
    Given I navigate to Website
    When I click on sign in button
    Then I enter email: "atlanta@gmail.com" I enter password: "Asdf4321-"
    Then I click submit button
    When I click Order History And Details Button
    Then I compare Order Reference and Total Price in the Order History Page to DataTable
      | FQRUOWWZP | $29.00  |
      | TMAZXYQDP | $107.97 |
      | JYXNIKSMC | $18.40  |


