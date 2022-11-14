#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature
  I want to login to the CURE Health Application

  @tag1
  Scenario Outline: Login with valid credentials
    Given I navigate to CURA Health Application
    When I click on make appoipment button
    And I enter username <username> and password <password>
    And I click login button
    Then I should be able to login successfully

    Examples: 
      | username  | password               | 
      | John Doe  |     g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM | 