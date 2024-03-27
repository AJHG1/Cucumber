Feature: Search for Desired Words on Amazon

@HW1
  Scenario Outline: Search for Keywords on Ebay
    * I open the browser
    Given the user navigates to the Ebay homepage
    When the user searches for "<value>"
    Then the user verifies that the search results contain "<value>"

    Examples:
      | value   |
      | mac     |
      | windows |
      | linux   |