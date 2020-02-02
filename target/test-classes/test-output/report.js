$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyaccountLogin.feature");
formatter.feature({
  "line": 2,
  "name": "My account login feature",
  "description": "Description:  log-in to application",
  "id": "my-account-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@First"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Simple login Without parameters"
    }
  ],
  "line": 6,
  "name": "log-in wtih valid username and Password",
  "description": "",
  "id": "my-account-login-feature;log-in-wtih-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter url \"http://practice.automationtesting.in/\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on My Account menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Registered username and password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user must sucessfully login to application",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountloginStepDefinitions.open_browser()"
});
formatter.result({
  "duration": 5199024300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://practice.automationtesting.in/",
      "offset": 11
    }
  ],
  "location": "MyAccountloginStepDefinitions.enter_url(String)"
});
formatter.result({
  "duration": 15708182900,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountloginStepDefinitions.click_on_My_Account_menu()"
});
formatter.result({
  "duration": 4549725800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountloginStepDefinitions.registered_username_and_password()"
});
formatter.result({
  "duration": 547678900,
  "error_message": "java.lang.NullPointerException\r\n\tat Reporting.Extent_Reporting.Log_Pass_with_Screenshot(Extent_Reporting.java:43)\r\n\tat stepDefination.MyAccountloginStepDefinitions.registered_username_and_password(MyAccountloginStepDefinitions.java:85)\r\n\tat ✽.And Registered username and password(MyaccountLogin.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyAccountloginStepDefinitions.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccountloginStepDefinitions.user_must_sucessfully_login_to_application()"
});
formatter.result({
  "status": "skipped"
});
});