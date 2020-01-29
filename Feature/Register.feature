Feature: Register

Scenario: Register on TestMeApp
Given user open TestMeApp
When user click signup
And  enter User name as "Gauriiii"
And enter First Name as "Gauriii"
And enter Last Name as "Gauri"
And enter Password as "Gauri123"
And enter Confirm Password as "Gauri123"
And enter gender as "Female"
And enter E-mail as "gauri@gmail.com"
And enter Mobile Number as "9955995599"
And enter DOB as "08/16/1996"
And address as "Pune"
And Security Question as "What is your Birth Place?"
And Answer as "wardha"
And click on Register

@login
Scenario: Login using datatable
Given user open TestMeApp
When user click Signin
And user enyters credentials as
|lalitha|
|Password123|