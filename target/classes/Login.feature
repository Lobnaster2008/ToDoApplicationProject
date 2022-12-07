#Author: mhamdi.lobna@gmail.com
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
Feature: To be able to login with a email and password
  I want to use a user and password to authentify

  @login
  Scenario: Authentification
    Given I go to the home page "https://qacart-todo.herokuapp.com/login"
    When I write my email "mhamdi.lobna@gmail.com"
    And I write my password "L@yene2008"
    And I click on Login button
    Then I am redirected to my home page where title is written "QAcart Todo App - Todos page"
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
