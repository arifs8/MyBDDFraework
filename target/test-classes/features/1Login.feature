#Feature: Login Functionality
#
  #Scenario Outline: Login with valid credentials
  #Given User navigates to login page
  #When User has entered valid email address <username> into email field
  #And User has entered valid password <password> into password field
  #And User clicks on login button
  #Then User should get successfuly logged in
  #Examples:
  #|username							|password		|
  #|arifsyed83@gmail.com	|qwerty123	|
  #|reshma@gmail.com			|1111				|
  #
  #
  
  
  
  
  #Scenario Outline: Login to the Remote Download application with a valid credentials
    #Given User navigates to the Remore Downlaod login page
    #When User has entered valid email id <emailID> into account field
    #Then User clicks on continue button
    #And User has entered valid password <password> into password field
    #Then User clicks on continue button
    #And User verify specific account name <accountname> then click on it
    #And User verify landing page is remote download
#
    #Examples: 
      #| emailID                               | accountname | password           |
      #| syed.arif@continental-corporation.com | dmmdemo     | Syedaakibidris@786 |
      #
      #
      
      
      
      
      
#Scenario Outline: Login to the Remote Download application with a valid credentials
#Given User navigates to the Remore Downlaod login page
#When User has entered invalid email address into email field
#And User enters invalid password "123456789" into the password field
#And User clicks on login button
#Then User should get a proper warning message about credentials missmatch
#
#
#Scenario: Login with invalid credentials
#Given User navigates to login page
#When User has entered invalid email address into email field
#And User enters invalid password "123456789" into the password field
#And User clicks on login button
#Then User should get a proper warning message about credentials missmatch
#
#Scenario: Login with valid email and invalid password
#Given User navigates to login page
#When User has entered valid email address "arifsyed83@gmail.com" into email field 
#And User enters invalid password "123456789" into the password field
#And User clicks on login button
#Then User should get a proper warning message about credentials missmatch 
#
#Scenario: Login with invalid email and valid password
#Given User navigates to login page
#When User has entered invalid email address into email field
#And User has entered valid password "12345" into password field
#And User clicks on login button
#Then User should get a proper warning message about credentials missmatch
#
#Scenario: Login without providing any credentials
#Given User navigates to login page
#When User dont enter email address into email field
#And User dont enter password into password field
#And User clicks on login button
#Then User should get a proper warning message about credentials missmatch 
