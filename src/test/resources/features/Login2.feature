@Login
Feature: Login

  Background:
    Given I launch elementalSelenium application

  @ValidCredentials
  Scenario: verify valid credential
    When I sign in with username "tomsmith" and password "SuperSecretPassword!" in login page
    Then I should see login secure page
    When I get logged out
    Then I should see login page


  @InvalidCredentials
  Scenario Outline: verify invalid credentials scenario 1
    When I sign in with username "<username>" and password "<password>" in login page
    Then I should get error message "<message>" in login page

    Examples:
      | username      | password             | message                                |
      |               |                      | Your username is invalid!              |
      | John          | John123              | Your username is invalid!              |
      | Siva          | Siva456              | Your username is invalid!              |
      | tomsmith      | errorPassword        | Your password is invalid!              |
      | errorUserName | SuperSecretPassword? | Your username and password is invalid! |



