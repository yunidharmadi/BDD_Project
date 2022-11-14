Feature: Login Feature

  Scenario Outline: Test Login with Valid Credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigated to homepage

    Examples:
    | username | password|
    | Admin     | hUKwJTbofgPU9eVlw/CnDQ== |