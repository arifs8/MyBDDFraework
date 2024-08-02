#
#Feature: Remote Downlaod Setting Page Screen Functionality
#
#Background:
#Given User navigates to the Remore Downlaod login page
#When User has entered valid accountname "d-gl" into account field
#And User has entered valid rdusername "user1" into username field
#And User has entered valid rdpassword "user1" into password field
#And User clicks on remote download login button
#
#
#Scenario: Remote Download Setting page tab
#Given User navigates to "REMOTE DOWNLOAD SETTINGS" screen page by clicking
#When User verify "Delegate File Download" title in the page
#Then User verify the Authorize icon
#
#
#Scenario: Remote Downlaod Authorize field and button
#Given User navigates to "REMOTE DOWNLOAD SETTINGS" screen page by clicking
#When User verify "Delegate File Download" title in the page
#Then User verify the Authorize icon
#And user veify there is a text field to pass
#And Authorize button is disabled
#
#Scenario: Remote Downlaod Authorize Account to be passed
#Given User navigates to "REMOTE DOWNLOAD SETTINGS" screen page by clicking
#When User verify "Delegate File Download" title in the page
#Then User verify the Authorize icon
#And User verify Account name "rtmdemo" to be pass in the text field
#And User verify Authorize button is enabled and click on it
#And User verify a popup message with "AUTHORIZE" as title
#And User verify two options with Yes and No 
#And User verify when clicks on No there will be no Revoke button
#And User verify there is a success message "Authorization Delegation Success" displayed
#And User when clicks on Yes there will be Revoke button
#And User verify correct symbol after success delegation
#
#
#Scenario: Remote Downlaod Authorize Account revoke button
#Given User navigates to "REMOTE DOWNLOAD SETTINGS" screen page by clicking
#When User verify "Delegate File Download" title in the page
#Then User verify the Authorize icon
#And User verify Account name "rtmdemo" to be pass in the text field
#And User verify Authorize button is enabled and click on it
#And User verify a popup message with "AUTHORIZE" as title
#And User verify two options with Yes and No 
#And User verify when clicks on No there will be no Revoke button
#And User verify there is a success message "Authorization Delegation Success" displayed
#And User when clicks on Yes there will be Revoke button
#And User verify Revoke button is enabled
#And User click on Revoke button veify the title "REVOKE"
#And User verify there are two options with yes and no
#And User clicks on No then Revoke button will be in enabled state
#And User clicks on Yes button there will be authorize button
#And User verify the "Revoke Authorization Success" message of revoke button
#
#
#Scenario: Remote Downlaod Authorize Account for fail scenario
#Given User navigates to "REMOTE DOWNLOAD SETTINGS" screen page by clicking
#When User verify "Delegate File Download" title in the page
#Then User verify the Authorize icon
#And User verify Account name "d-gl" to be pass in the text field
#And User verify Authorize button is enabled and click on it
#And User verify "Self Authorization" message is displayed
#
#
#Scenario: Remote Downlaod Authorization Account with invalid name
#Given User navigates to "REMOTE DOWNLOAD SETTINGS" screen page by clicking
#When User verify "Delegate File Download" title in the page
#Then User verify the Authorize icon
#And User verify Account name "Syed Arif" to be pass in the text field
#And User verify Authorize button is enabled and click on it
#And User verify cross mark