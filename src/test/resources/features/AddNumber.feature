@AddNumbers
Feature: Adding numbers

  @AddTwo
  Scenario: Adding Two Numbers
    When User enter the first number
    And User enter the second number
    Then User add this two number
    And Print the sum

  @AddThree
  Scenario: Adding Three Numbers
    When User enter the first number
    And User enter the second number
    And User enter the third number
    Then User add this three number
    And Print the sum