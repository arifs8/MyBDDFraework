Feature: HostManagement Screen Functionality

Background:
Given User navigates to the Remore Downlaod login page
When User has entered valid accountname "d-gl" into account field
And User has entered valid rdusername "user1" into username field
And User has entered valid rdpassword "user1" into password field
And User clicks on remote download login button


@RD-2393
Scenario: Host Managemnet Screen dropdown fielters field
Given User navigates to the Host Managemnet screen page
When User verify dropdown of Company or Account field
And User verify search option is havin "rtmdemo" account
And User verify client status in Host Management screen
And User verify Version title in Hast Management screen
And User verify service title in Host Management screen


@RD-614
Scenario: Host Managemnet Screen Auto refresh
Given User navigates to the Host Managemnet screen page
When User verify the name of the auto sync
Then User needs to check the toggle bar status
And User needs to check the icon sync status

Scenario: Host Management Screen AC Client installer
Given User navigates to the Host Managemnet screen page
When User verify the AC Client installer present
Then User verify the AC Client version "1.31.1" is present
And User verify the DC Client installer present
And User verify DC Client version "1.21.1" is present

Scenario: Host Management Screen Header items verification
Given User navigates to the Host Managemnet screen page
When User verify the Header of the page
Then User verify the Header items are present
And User verify the data present in the table

Scenario: Host management Screen to check CSV file
Given User navigates to the Host Managemnet screen page
When User verify the CSVfile icon is present in the page
Then User verify file is getting downloaded with "HostManagement" and "csv" timeout with "5000" should present
And User verify when there is an empty record then file should not get downlaod

Scenario: Host Management Screen for Search icon
Given User navigates to the Host Managemnet screen page
When User verify search functionality is working properly
Then User verify by passing the value "rtmdemo" into the search field

