Feature: create a new account in facebook 

Background: Launching facebook app
Given user launch the face book web Application "https://www.facebook.com/"
When user clicks on create new account button

@create
Scenario Outline:: Create New Accounts 
When user enter firstnametab "<firstnames>"
And user enters the surnametab "<surnames>"
And user enters the mobile number or email values "<mobilenumbers>"
And user enters the new passwords "<passwords>"
And user select the date of births
And user select the gender Options
And user clicks on singup buttons 
Then Verify firstnametab,surnametab ,mobile number or email values ,passwords,dobs,genderoption,signupbut
 
Examples: 
|firstnames|surnames|mobilenumbers|passwords|
|Imma|Rani|5677888760|dfgh678895|
|riya|riya|40000000988|hy6778gfhy|
|divya|div|9000000000|ghdyuuhhdre|
|ima|joy|7654345676|fdhju78965|
