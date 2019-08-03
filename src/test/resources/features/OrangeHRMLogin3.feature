@Login
Feature: Login

  Background:
    Given I launch OrangeHRM application

  @ValidCredentials
  Scenario: verify valid credential
    When I sign in with username "Admin" and password "admin123"
    Then I should see dashbord page
  @InvalidCredentials
  Scenario Outline: verify invalid credentials scenario 2
    When I sign in with username "<user>" and password "<Password>"
    Then I should get error message "Invalid credentials"

    Examples:
      |user |Password|
      |admin|admin124|
      |Admin|Admin123|