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
Feature: Make appoipment
  I want to make appoipment

  @tag1
  Scenario Outline: Make appoipment
    And I click on facility button
    And I check on hospital readmission 
    And I check on healthcare program
    And I click on visit date
    And I click on comment
    And I click on book appoipment button
    Then I should be able to appoipment successfully
