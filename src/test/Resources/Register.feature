Feature: Register functionality
  @SmokeTest1
  Scenario: User able to register sucessfully
    Given user already on homepage
    When I Click on Register
    Then I should be navigate to Register page sucessfully
    When I select male gender
    And I enter first name
    And I enter last name
    And I enter email
    And I enter password
    And I entr confirm password
    And I click on register button
    Then I should be register succesfully
