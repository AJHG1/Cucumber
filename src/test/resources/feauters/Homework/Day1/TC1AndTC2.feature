Feature: Task in site

  @samsung
  Scenario: TC01_samsungSearch
    Given user gose to google page
    When user searches for samsung
    Then tests that the page title contains the word samsung

#-----------------------------------------------
  @cucmber
  Scenario: TC02_cucumberSearch
    Given user gose to google page
    When user search for cucumber
    Then tests that the page title contains the word cucmber
    And close the page