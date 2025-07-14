Feature: Logintest

  @tag1
  Scenario: Title of your scenario outline
    Given I want navigate to pos homepage
    When I enter '35600' as the postcode from Malaysia Country
    And I Enter 'India' Country
    And I select "India" with code "IN"
    And I insert '1' as Weight
    Then I Click Calculate button
		