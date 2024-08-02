#Feature: Registration functionality
#
#Scenario: User creates an account only with mandatory fields
#Given User navigates to Register Account page
#When User enters the details into below fields
#|firstName	| 	Reshma1						 	|
#|lastName		| 	Shaik							 	|
#|telephone  |		6589475214					|
#|password		|		qwerty123						|
#And User selects Privacy Policy
#And User clicks n Continue button
#Then User account should get created successfully
#
#
#Scenario: User creates an account with all fields
#Given User navigates to Register Account page
#When User enters the details into below fields
#|firstName	| 	Reshma1						 	|
#|lastName		| 	Shaik							 	|
#|telephone  |		6589475214					|
#|password		|		qwerty123						|
#And User selects Yes for Newsletter
#And User selects Privacy Policy
#And User clicks n Continue button
#Then User account should get created successfully
#
#Scenario: User creates a duplicate account
#Given User navigates to Register Account page
#When User enters the details into below fields with duplicate email
#|firstName	| 	Reshma1						 	|
#|lastName		| 	Shaik							 	|
#|email 			|		arifsyed83@gmail.com	|
#|telephone  |		6589475214					|
#|password		|		qwerty123						|
#And User selects Yes for Newsletter
#And User selects Privacy Policy
#And User clicks n Continue button
#Then User account should get a proper warning about duplicate email
#
#Scenario: User creates an account without filling any details
#Given User navigates to Register Account page
#When User dont enter any details into fields
#And User clicks n Continue button
#Then User should get proper warning messages for every mandatory field
#
