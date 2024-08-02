Feature: Company Card Screen Functionality

  Background: CLogin to the Remote Download application with a valid credentials
    Given User navigates to the Remore Downlaod login page
    When User has entered valid email id "syed.arif@continental-corporation.com" into account field
    Then User clicks on continue button
    And User has entered valid password "Syedaakibidris@786" into password field
    Then User clicks on continue button
    And User verify specific account name "dmmdemo" then click on it
    And User verify landing page is remote download

  #@RD-650 @RD-649
  #Scenario Outline: Company Card Screen dropdown fielters field
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify the count of sites and vehicle present under <VehicleNumber>
  #And User needs to click on the <VehicleNumber> button to add site or vehicle
  #Then User needs to assign new vehicle <New Vehicle> and site
  #And User needs to verify sites and Vehicles are under <CompanyCardNumber>
  #And User needs to navigate back and verify added vehcile or site reflects for the perticular <HostNumber>
  #And User needs to click on the <VehicleNumber> button to add site or vehicle
  #Then User needs to assign new vehicle <New Vehicle> and site
  #And User needs to assign back sites and Vehicles are under
  #
  #Examples:
  #|CompanyCard  | VehicleNumber | HostNumber | New Vehicle| CompanyCardNumber |
  #|COMPANY CARDS| OZD3423W			| OZD3423W	 | VS CO 3    | 4200000000076000  |
  #@RD-617
  #Scenario Outline: Company Card Screen dropdown fielters field
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify the delete icon
  #
  #Examples:
  #|CompanyCard  | VehicleNumber | HostNumber | New Vehicle| CompanyCardNumber |
  #|COMPANY CARDS| OZD3423W			| OZD3423W	 | VS CO 3    | 4200000000076000  |
  #@RD-614
  #Scenario Outline: Company Card Screen dropdown fielters field
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify the refresh icon
  #
  #Examples:
  #|CompanyCard  | VehicleNumber | HostNumber | New Vehicle| CompanyCardNumber |
  #|COMPANY CARDS| OZD3423W			| OZD3423W	 | VS CO 3    | 4200000000076000  |
  #
  #@RD-611
  #Scenario Outline: Company Card Screen dropdown fielters fields
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify the pagenation <defaultvalue>
  #
  #Examples:sss
  #|CompanyCard  | defaultvalue | HostNumber |
  #|COMPANY CARDS| 50			     | OZD3423W	  |
  #@RD-609 @RD-294
  #Scenario Outline: Company Card Screen dropdown fielters fields
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify the CompanyCard Status
  #And User needs to verify the filter dropdown
  #
  #Examples:
  #|CompanyCard  | defaultvalue | HostNumber |
  #|COMPANY CARDS| 50			     | OZD3423W	  |
  #
  #@RD-602
  #Scenario Outline: Company Card Screen dropdown fielters fields
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify thew filter present in all colums
  #
  #Examples:
  #|CompanyCard  | defaultvalue | HostNumber |
  #|COMPANY CARDS| 50			     | OZD3423W	  |
  #@RD-596
  #Scenario Outline: Company Card Screen dropdown fielters fields
  #Given User navigates to the <CompanyCard> screen page by clicking on it
  #When User verify Host number <HostNumber> under Host Computer coloum
  #And User needs to verify the search field by passing the <CompanyCardNumber>
  #
  #Examples:
  #|CompanyCard  | defaultvalue | HostNumber | CompanyCardNumber |
  #|COMPANY CARDS| 50			     | OZD3423W	  | 4200000000076000  |
  #@RD-297
  #Scenario Outline: Company Card Screen dropdown fielters fields
    #Given User navigates to the <CompanyCard> screen page by clicking on it
    #When User verify Host number <HostNumber> under Host Computer coloum
    #And User needs to verify the Company or Account namedropdown fields
#
    #Examples: 
      #| CompanyCard   | defaultvalue | HostNumber | CompanyCardNumber |
      #| COMPANY CARDS |           50 | OZD3423W   |  4200000000076000 |

  @RD-293
  Scenario Outline: Company Card Screen dropdown fielters fields
    Given User navigates to the <CompanyCard> screen page by clicking on it
    When User verify Host number <HostNumber> under Host Computer coloum
    And User needs to verify the status of the company card

    Examples: 
      | CompanyCard   | defaultvalue | HostNumber | CompanyCardNumber |
      | COMPANY CARDS |           50 | OZD3423W   |  4200000000076000 |
      
#Scenario: Company Card Screen Auto refreshS
#Given User navigates to the "COMPANY CARDS" screen page by clicking on it
#When User verify the name of the auto sync in Company card page
#Then User needs to check the toggle bar status in Company card page
#And User needs to check the icon sync status in Company card page
#
#Scenario: Company card Screen Header items verification
#Given User navigates to the "COMPANY CARDS" screen page by clicking on it
#When User verify the Header of the page in Company card page
#Then User verify the Header items are present in Company card page
#And User verify the data present in the table of Company card page
#
#Scenario: Company card Screen Delete items verification
#Given User navigates to the "COMPANY CARDS" screen page by clicking on it
#When User verify the delete icon is disbaled at initial point
#Then User clicks on account name and delete icon gets enabled
#
#Scenario: Host management Screen to check CSV file
#Given User navigates to the "COMPANY CARDS" screen page by clicking on it
#When User verify the CSVfile icon is present in the company card page
#Then User verify file is getting downloaded with "CompanyCardManagement" and "csv" timeout with "5000" should present in company card page
 #need to work on below code for some more senarios
#And User verify when there is an empty record then file should not get downlaod in the company card page
#
#Scenario: Host management Screen to check PDF file
#Given User navigates to the "COMPANY CARDS" screen page by clicking on it
#When User verify the PDFfile icon is present in the company card page
#Then User verify file is getting downloaded with "CompanyCardManagement" and "pdf" timeout with "5000" should present in company card pages
