Feature: OrdersHistory
  Scenario : Checking Orders History functionality
    Given I navigate to Website
    When I click on sign in button
    Then I enter email: "atlanta@gmail.com" I enter password: "Asdf4321-"
    Then I click submit button
    Given I click on Orders History  button

#    Then Sign out