#Feature: Assign Company card Screen Functionality
#
#Background:
#Given User navigates to the Remore Downlaod login page
#When User has entered valid accountname "rtmdemo" into account field
#And User has entered valid rdusername "Testuser1" into username field
#And User has entered valid rdpassword "Testuser1" into password field
#And User clicks on remote download login button
#
#
#Scenario: Assign company card Screen tab
#Given User navigates to the "COMPANY CARDS" screen page by clicking
#When User navigates to the "ASSIGN COMPANY CARDS" screen page by clicking on it in Hostmanagemnet Screen
#Then User navigate to CompanyCard page by clicking on Assign Company Card button
#And User needs to verify the title "COMPANY CARDS ASSIGNMENT" in the page

#Scenario: Assign Company Card page company list
#Given User navigates to the "COMPANY CARDS" screen page by clicking
#When User navigates to the "ASSIGN COMPANY CARDS" screen page by clicking on it in Hostmanagemnet Screen
#Then User navigate to CompanyCard page by clicking on Assign Company Card button
#And User verify company list title "COMPANIES LIST" in the page
#And User verify there is a search field 
#And User verify sorting option to be present
#And User verify list of the Account names
#And User send "rtmdemo" in the search field
#And User verify the company name "rtmdemo" is listed

#Scenario: Assign Company Card page checkbox and titles
#Given User navigates to the "COMPANY CARDS" screen page by clicking
#When User navigates to the "ASSIGN COMPANY CARDS" screen page by clicking on it in Hostmanagemnet Screen
#Then User navigate to CompanyCard page by clicking on Assign Company Card button
#And User send "dmmdemo" in the search field
#And User verify the company name "dmmdemo" is listed
#And User verify title as "All available cards" and checkbox present in the available card
#And User verify checkbox present on assigned cards
#And User verify by clicking on any account "dmmdemo" show cards assigned
#
#Scenario: Assign Company Card page arrow button enable
#Given User navigates to the "COMPANY CARDS" screen page by clicking
#When User navigates to the "ASSIGN COMPANY CARDS" screen page by clicking on it in Hostmanagemnet Screen
#Then User navigate to CompanyCard page by clicking on Assign Company Card button
#And User send "dmmdemo" in the search field
#And User verify the company name "dmmdemo" is listed
#And User verify title as "All available cards" and checkbox present in the available card
#And User verify checkbox present on assigned cards
#And User verify by clicking on any account "dmmdemo" show cards assigned
#And User select an account by clicking on checkbox
#And User verify arrrow is enable
#And User select a companie card from available cards
#And User verify right arrow is enable
#
#
#
#Scenario: Assign Company Card page SAVE and CANCEL button
#Given User navigates to the "COMPANY CARDS" screen page by clicking
#When User navigates to the "ASSIGN COMPANY CARDS" screen page by clicking on it in Hostmanagemnet Screen
#Then User navigate to CompanyCard page by clicking on Assign Company Card button
#And User send "dmmdemo" in the search field
#And User verify the company name "dmmdemo" is listed
#And User verify title as "All available cards" and checkbox present in the available card
#And User verify checkbox present on assigned cards
#And User verify by clicking on any account "dmmdemo" show cards assigned
#And User verify SAVE button is disbaled
#And User select an account by clicking on checkbox
#And User verify arrrow is enable
#And User verify SAVE button is enabled
#And User verify CANCEL button is clickable
#And User verify after clicking cancel button popup title "UNSAVED CHANGES"
#And User verify cancel popup has yes and no options
#And User click on No option stay in current page "COMPANY CARDS ASSIGNMENT"
#And User verify CANCEL button is clickable
#And User click on Yes option comes to "REMOTE DOWNLOAD" page
#
#
#
#
#
