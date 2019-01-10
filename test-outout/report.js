$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("freecrmlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Login Feature",
  "description": "\r\n\r\n//Scenario: Free CRM Login Test Scenario",
  "id": "free-crm-application-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Given user is already on Login Page"
    },
    {
      "line": 7,
      "value": "#When title of login page is Free CRM"
    },
    {
      "line": 8,
      "value": "#Then user enters \"rashmi ag\" and \"test@123\""
    },
    {
      "line": 9,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 10,
      "value": "#Then user is on home page"
    }
  ],
  "line": 13,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-application-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User is on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "validate home page tittle",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "validate logged in username",
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
});