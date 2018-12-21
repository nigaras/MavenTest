@MultiplyNumbers
Feature: Multiplying numbers

  @MultiplyTwo
  Scenario: Multiplying Two Numbers
    When User enter the first number
    And User enter the second number
    Then User multiply this two number
    And Print the multiplication

  @MultiplyThree
  Scenario: Multiplying Three Numbers
    When User enter the first number
    And User enter the second number
    And User enter the third number
    Then User multiply this three number
    And Print the multiplication