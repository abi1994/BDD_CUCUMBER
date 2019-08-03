$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login1.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "verify valid credential",
  "description": "",
  "id": "login;verify-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ValidCredentials"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch elementalSelenium application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I sign in with username \"tomsmith\" and password \"SuperSecretPassword!\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see login secure page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I get logged out",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "verify invalid credentials scenario 1",
  "description": "",
  "id": "login;verify-invalid-credentials-scenario-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@InvalidCredentials"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I launch elementalSelenium application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I sign in with username \"\" and password \"\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should get error message \"Your username is invalid!\" in login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "verify invalid credentials scenario 2",
  "description": "",
  "id": "login;verify-invalid-credentials-scenario-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@InvalidCredentials"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I launch elementalSelenium application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I sign in with username \"John\" and password \"John123\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I should get error message \"Your username is invalid!\" in login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 25,
  "name": "verify invalid credentials scenario 3",
  "description": "",
  "id": "login;verify-invalid-credentials-scenario-3",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@InvalidCredentials"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I launch elementalSelenium application",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I sign in with username \"Siva\" and password \"Siva456\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should get error message \"Your username is invalid!\" in login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 31,
  "name": "verify invalid credentials scenario 4",
  "description": "",
  "id": "login;verify-invalid-credentials-scenario-4",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@InvalidCredentials"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "I launch elementalSelenium application",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I sign in with username \"tomsmith\" and password \"errorPassword\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I should get error message \"Your password is invalid!\" in login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 37,
  "name": "verify invalid credentials scenario 5",
  "description": "",
  "id": "login;verify-invalid-credentials-scenario-5",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@InvalidCredentials"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I launch elementalSelenium application",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I sign in with username \"errorUserName\" and password \"SuperSecretPassword?\" in login page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I should get error message \"Your username is invalid!\" in login page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});