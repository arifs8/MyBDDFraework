#Feature: Remote Downlaod Task Page Screen Functionality
#
#Background:
#Given User navigates to the Remore Downlaod login page
#When User has entered valid accountname "d-gl" into account field
#And User has entered valid rdusername "user1" into username field
#And User has entered valid rdpassword "user1" into password field
#And User clicks on remote download login button
#
#Scenario: Remote Download Task page Company/Account dropdown
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify dropdown of "Company/Account" field
#Then User verify search option is having "All" account
#And User verify search field under company or account
#And User verify there is a scroll bar
#
#
#Scenario: Remote Download Task page Status dropdown
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify dropdown of "Status" field in the page
#Then User verify select "All" by default
#And User verify by chnaging to Planned
#And User verify there is a scroll bar
#
#
#Scenario: Remote Download Task page Status dropdown
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify dropdown of "File type" field the page
#Then User verify select "All" by default in page
#And User verify there is a scroll bar
#
#Scenario: Remote Download Task page Status dropdown
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify dropdown of "Device" in the page field
#Then User verify select "All" by default in the page field
#And User verify there is a scroll bar
#
#Scenario: Remote Download Task page Screen Auto refresh
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify the name of the auto sync in Remote Download Task
#Then User needs to check the toggle bar status in Remote Download Task
#And User needs to check the icon sync status in Remote Download Task
#
#Scenario: Remote Download Task page Screen Header items verification
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify the Header of the page in Remote Download Task
#Then User verify the Header items are present in Remote Download Task
#And User verify the data present in the table in Remote Download Task
#
#Scenario: Remote Download Task page Screen to check CSV file
#Given User navigates to "REMOTE DOWNLOAD TASKS" page by clicking on it
#When User verify the Header of the page in Remote Download Task
#Then User verify the CSVfile icon is present in the page
#Then User verify file is getting downloaded with "HostManagement" and "csv" timeout with "5000" should present
#And User verify when there is an empty record then file should not get downlaod
#
#Scenario: Remote Download Task page Screen to check PDF file
#Given User navigates to the Host Managemnet screen page
#When User verify the PDFfile icon is present in the page
#Then User verify file is getting downloaded with "HostManagement" and "pdf" timeout with "5000" should present
#And User verify when there is an empty record then file should not get downlaod