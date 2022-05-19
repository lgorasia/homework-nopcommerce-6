Feature: Register
  As user I want to register on nop commerce website
@smoke
  Scenario: Verify user should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should see register text
@sanity
  Scenario: Verify that firstname lastname email passwor and confirm password fields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on registration
    Then I should see error message for mandatory field
@regression
  Scenario: Verify that user should create account successfully
    Given I am on homepage
    When I click on register link
    And I select gender
    And I enter firstname
    And I enter lastname
    And I select day
    And I select month
    And I select year
    And I enter email
    And I enter password
    And I enter Confirm Password
    And I click on registration
    Then I should see Your registration completed message


