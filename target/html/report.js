$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/facebook.feature");
formatter.feature({
  "name": "create new account in facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "user enter firstname \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the surname \"\u003csurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the mobile number or email value \"\u003cmobilenumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the new password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select the day \"\u003cday\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select the month \"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select the year \"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select the gender Option \"\u003cgenders\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on singup button \"\u003cscreen\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify firstname,surname ,mobile number or email ,password,dob,gender,signup",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "surname",
        "mobilenumber",
        "password",
        "day",
        "month",
        "year",
        "genders",
        "screen"
      ]
    },
    {
      "cells": [
        "Imma",
        "Rani",
        "5677888760",
        "dfgh678895",
        "8",
        "12",
        "1997",
        "Female",
        "screen1"
      ]
    },
    {
      "cells": [
        "riya",
        "riya",
        "40000000988",
        "hy6778gfhy",
        "2",
        "11",
        "1994",
        "Female",
        "screen2"
      ]
    },
    {
      "cells": [
        "divya",
        "div",
        "9000000000",
        "ghdyuuhhdre",
        "18",
        "2",
        "1985",
        "Female",
        "screen3"
      ]
    },
    {
      "cells": [
        "ima",
        "joy",
        "7654345676",
        "fdhju78965",
        "28",
        "8",
        "2001",
        "Female",
        "screen4"
      ]
    }
  ]
});
formatter.background({
  "name": "Launching facebook",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the face web Application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBookBase.user_launch_the_face_web_Application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_click_on_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "user enter firstname \"Imma\"",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname \"Rani\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile number or email value \"5677888760\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_mobile_number_or_email_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"dfgh678895\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_new_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the day \"8\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the month \"12\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the year \"1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the gender Option \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_gender_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on singup button \"screen1\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_clicks_on_singup_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify firstname,surname ,mobile number or email ,password,dob,gender,signup",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat facebook.FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup(FaceBookBase.java:160)\r\n\tat ✽.Verify firstname,surname ,mobile number or email ,password,dob,gender,signup(./src/test/resources/facebook.feature:19)\r\n",
  "status": "pending"
});
formatter.background({
  "name": "Launching facebook",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the face web Application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBookBase.user_launch_the_face_web_Application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_click_on_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "user enter firstname \"riya\"",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname \"riya\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile number or email value \"40000000988\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_mobile_number_or_email_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"hy6778gfhy\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_new_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the day \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the month \"11\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the year \"1994\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the gender Option \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_gender_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on singup button \"screen2\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_clicks_on_singup_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify firstname,surname ,mobile number or email ,password,dob,gender,signup",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat facebook.FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup(FaceBookBase.java:160)\r\n\tat ✽.Verify firstname,surname ,mobile number or email ,password,dob,gender,signup(./src/test/resources/facebook.feature:19)\r\n",
  "status": "pending"
});
formatter.background({
  "name": "Launching facebook",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the face web Application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBookBase.user_launch_the_face_web_Application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_click_on_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "user enter firstname \"divya\"",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname \"div\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile number or email value \"9000000000\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_mobile_number_or_email_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"ghdyuuhhdre\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_new_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the day \"18\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the month \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the year \"1985\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the gender Option \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_gender_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on singup button \"screen3\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_clicks_on_singup_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify firstname,surname ,mobile number or email ,password,dob,gender,signup",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat facebook.FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup(FaceBookBase.java:160)\r\n\tat ✽.Verify firstname,surname ,mobile number or email ,password,dob,gender,signup(./src/test/resources/facebook.feature:19)\r\n",
  "status": "pending"
});
formatter.background({
  "name": "Launching facebook",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launch the face web Application \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBookBase.user_launch_the_face_web_Application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_click_on_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New Account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@create"
    }
  ]
});
formatter.step({
  "name": "user enter firstname \"ima\"",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookBase.user_enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname \"joy\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile number or email value \"7654345676\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_mobile_number_or_email_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"fdhju78965\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_enters_the_new_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the day \"28\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_day(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the month \"8\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the year \"2001\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the gender Option \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_select_the_gender_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on singup button \"screen4\"",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookBase.user_clicks_on_singup_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify firstname,surname ,mobile number or email ,password,dob,gender,signup",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat facebook.FaceBookBase.verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup(FaceBookBase.java:160)\r\n\tat ✽.Verify firstname,surname ,mobile number or email ,password,dob,gender,signup(./src/test/resources/facebook.feature:19)\r\n",
  "status": "pending"
});
});