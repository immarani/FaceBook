Feature: create new account in facebook 

Background: Launching facebook 
Given user launch the face web Application "https://www.facebook.com/"
When user click on create new account button


@create
Scenario Outline: Create New Account 
When user enter firstname "<firstname>"
And user enters the surname "<surname>"
And user enters the mobile number or email value "<mobilenumber>"
And user enters the new password "<password>"
And user select the day "<day>"
And user select the month "<month>"
And user select the year "<year>"
And user select the gender Option "<genders>"
And user clicks on singup button "<screen>"
Then Verify firstname,surname ,mobile number or email ,password,dob,gender,signup
 
Examples: 
|firstname|surname|mobilenumber|password|day|month|year|genders|screen|
|Imma|Rani|5677888760|dfgh678895|8|12|1997|Female|screen1|
|riya|riya|40000000988|hy6778gfhy|2|11|1994|Female|screen2|
|divya|div|9000000000|ghdyuuhhdre|18|2|1985|Female|screen3|
|ima|joy|7654345676|fdhju78965|28|8|2001|Female|screen4|




