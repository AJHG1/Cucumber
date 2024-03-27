Feature: Scenario Outline feature

  Scenario Outline:
    Given I open the browser
    And i am on google homePage
    When I search for "<searchInput>" on google
    Then I should see "<searchInput>" on the results
    Then I close the browser
    Examples:
      | searchInput |
      | ebay        |
      | amazon      |
      |             |




