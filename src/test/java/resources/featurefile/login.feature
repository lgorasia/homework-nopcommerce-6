Feature: Login Test
  As user I want to login into nop commerce website
@smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
@smoke
  Scenario: User Should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "9prafulpatel20@gmail.com"
    And I enter password "12345678"
    And I click on login button
   Then I should login successfully

@sanity
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "abcd@gmail.com"
    And I enter password "12345678"
    And I click on login button
    Then I should see the error message
@regression
    Scenario:Verify that user should log out successFully
      Given I am on homepage
      When I click on login link
      And I enter email "10prafulpatel20@gmail.com"
      And I enter password "12345678"
      And I click on login button
      And I click on logout button
      Then I should see login button


