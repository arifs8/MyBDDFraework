package pages;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utils.AbstractTestClass;
import utils.ElementsUtils;
import utils.commonUtils;

public class CompanycardPage{

	public WebDriver driver;
	private ElementsUtils eu;

	public CompanycardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}
	
	
	

	@FindBy(xpath = "//*[contains(text(),'Company cards')]")
	private WebElement companyCardtab;

	@FindBy(xpath = "//span[text()='Company/Account']")
	private WebElement companyAccountdropdownText;

	@FindBy(xpath = "(//div[contains(@class,'mat-form-field-flex')]//child::*[contains(@class,'mat-select-arrow-wrapper ng-tns-c60')])[1]")
	private WebElement companyDropdown;

	@FindBy(xpath = "//span[text()=' rtmdemo ']")
	private WebElement accountName;

	@FindBy(xpath = "//div[@role='listbox']//child::input[@placeholder='Search...']")
	private WebElement searchField;

	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//child::*[text()='All']")
	private WebElement allOPtion;

	@FindBy(xpath = "//span[text()='Status']")
	private WebElement clientStatusText;

	@FindBy(xpath = "//mat-select[@id='mat-select-10']//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]")
	private WebElement clientStatusDropdown;

	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//child::span")
	private List<WebElement> dropDownElementsClientStatus;

	@FindBy(xpath = "//div[text()='auto sync']")
	private WebElement autoSyncTitleText;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-2-input' and @aria-checked='true']")
	private WebElement togglebarTrue;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-2-input' and @aria-checked='false']")
	private WebElement togglebarFalse;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-2-input']//following-sibling::*")
	private WebElement togglebarButton;

	@FindBy(xpath = "//*[contains(@class,'syncing disabled')]")
	private WebElement iconSyncDisable;

	@FindBy(xpath = "//*[contains(@class,'icon-sync')]")
	private WebElement iconSync;

	@FindBy(xpath = "//*[@role='table']")
	private WebElement headerTable;

	@FindBy(xpath = "//*[@role='table']//child::*[@role='columnheader']")
	private List<WebElement> headerTanleElements;

	@FindBy(xpath = "//span[@class='mat-checkbox-label']//child::*[text()='All']")
	private WebElement selectAllItam;

	@FindBy(xpath = "//mat-table//mat-row")
	private List<WebElement> dataAvailableinTable;

	@FindBy(xpath = "//div[text()=' No data available ']")
	private WebElement emptyDataAvailableinTable;

	@FindBy(xpath = "//div[contains(@class,'unassign-button disabled ng-star-inserted')]")
	private WebElement disabledDeleteIcon;

	@FindBy(xpath = "//div[contains(@class,'ng-star-inserted')]//*[text()='delete']")
	private WebElement enabledDeleteIcon;

	@FindBy(xpath = "(//div[contains(@class,'unassign-container')])[1]")
	private WebElement firstCheckBoxOFRow;

	@FindBy(xpath = "//p[text()='Host management']")
	private WebElement hostmanagemnetTab;

	@FindBy(xpath = "//span[text()='8']")
	private WebElement hostmangementCSVFileICon;

	@FindBy(xpath = "//span[text()='This file contains no data']")
	private WebElement noDataWarningMessage;

	@FindBy(xpath = "//span[text()='r']")
	private WebElement pdfFileICOnCompanycard;

	@FindBy(xpath = "//mat-table//mat-header-cell//child::*[text()=' Host Computer ']")
	private WebElement HastComputerTitle;

	@FindBy(xpath = "//span[text()=' All Vehicles ']")
	private WebElement AllVehicleRadioButton;

	@FindBy(xpath = "//mat-icon[text()='search']")
	private WebElement searchIcon;

	@FindBy(xpath = "//input[@placeholder='Search Vehicle']")
	private WebElement searchBarPlaceHolder;

	@FindBy(xpath = "//mat-select-trigger[contains(text(),'All Vehicles')]")
	private WebElement allVehiclePlaceHodler;

	@FindBy(xpath = "//div[contains(@class,'filter')]//child::*[contains(@class,'mat-select-arrow ng-tns-c61-24')]")
	private WebElement downArrow;

	@FindBy(xpath = "//span[@data-glyph='sort-ascending']")
	private WebElement sortingOrder;

	@FindBy(xpath = "//tis-button[@class='button-cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//tis-button[@class='button-save']")
	private WebElement saveButton;

	@FindBy(xpath = "//mat-icon[text()='chevron_right']")
	private WebElement rightArrow;

	@FindBy(xpath = "//mat-icon[text()='chevron_left']")
	private WebElement leftArrow;

	@FindBy(xpath = "//span[text()='Associated Sites / Vehicles']")
	private WebElement associateSitePlaceholder;

	@FindBy(xpath = "//span[@class='mat-checkbox-label']//following::*[text()=' All Sites ']")
	private WebElement allSites;

	@FindBy(xpath = "//span[text()='Association/un-association of the company card is successful']")
	private WebElement successMessage;

	@FindBy(xpath = "//span[text()=' yes ']")
	private WebElement yesButton;

	@FindBy(xpath = "//mat-icon[text()='delete']")
	private WebElement deleteIcon;

	@FindBy(xpath = "//em[text()='sync']")
	private WebElement syncIcon;

	@FindBy(xpath = "//div[text()=' Items per page: ']")
	private WebElement pagenationTitle;

	@FindBy(xpath = "//span[text()='50']")
	private WebElement defaultPaginationValue;

	@FindBy(xpath = "(//span[text()='50']//following::*)[1]")
	private WebElement paginationDropdownArrow;

	@FindBy(xpath = "//div[@role='listbox']//child::mat-option")
	private List<WebElement> paginationList;

	@FindBy(xpath = "//span[text()='Status']")
	private WebElement statusTitle;

	@FindBy(xpath = "(//span[text()='All']//following::*)[1]")
	private WebElement companyCardStatusDropdown;

	@FindBy(xpath = "//div[@role='listbox']//child::mat-option")
	private List<WebElement> statusFilterElements;

	@FindBy(xpath = "//mat-header-cell//*[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition')]")
	private List<WebElement> sortFilterInCC;

	@FindBy(xpath = "//input[@data-placeholder='Search...']")
	private WebElement placeholderSearch;

	@FindBy(xpath = "//input[@data-placeholder='Search...']//following::*[text()='P']")
	private WebElement searchIconPresent;
	
	@FindBy(xpath = "//span[text()='Company/Account']")
	private WebElement companyAccountNamePlaceholder;
	
	@FindBy(xpath = "(//span[text()='dmmdemo']//following::*)[1]")
	private WebElement accountNameDropdownButton;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchFieldInAccount;
	
	@FindBy(xpath = "//*[text()='Status']")
	private WebElement statusField;
	
	@FindAll({
		   @FindBy(xpath ="class1"),
		   @FindBy(xpath =  "class2")
		})
	private WebElement dropDownElement;
	
	
	
	
	

	public String verifyCompanycardTitle() {

		eu.visibilityOfElement(companyCardtab, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time);
	}

	public void clickOnCompanycardTab() {

		// eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(companyCardtab, commonUtils.Explicit_Wait_Time);
	}

	public String verifyCompanyAccountText() {

		return eu.getTextFromElement(companyAccountdropdownText, commonUtils.Explicit_Wait_Time);

	}

	public void verifyDropdownisClickable() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);

	}

	public void verifyAccountName() {

		eu.visibilityOfElement(accountName, commonUtils.Explicit_Wait_Time);

		eu.clickOnElement(accountName, commonUtils.Explicit_Wait_Time);

	}

	public void sendTextINSearchField(String string) {

		eu.visibilityOfElement(searchField, commonUtils.Explicit_Wait_Time);
		eu.typeTextIntoElement(searchField, string, commonUtils.Explicit_Wait_Time);
	}

	public void selectAllAccounts() {

		eu.checkBoxSelect(allOPtion, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
	}

	public String verifyClientStatusText() {
		return eu.getTextFromElement(clientStatusText, commonUtils.Explicit_Wait_Time);
	}

	public ArrayList<String> selectClientSatusDropdown() {
		eu.clickOnElement(clientStatusDropdown, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(dropDownElementsClientStatus, commonUtils.Explicit_Wait_Time);

	}

	public void clikOperation() {
		eu.clickEscapeINBetween();
	}

	public String verifyAutoSyncTitle() {

		return eu.getTextFromElement(autoSyncTitleText, commonUtils.Explicit_Wait_Time);
	}

	public void verifyTooglebar() {

		if (eu.displayStatusofElement(togglebarTrue, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(togglebarButton, commonUtils.Explicit_Wait_Time);
			eu.clickOnElement(togglebarButton, commonUtils.Explicit_Wait_Time);
			eu.visibilityOfElement(togglebarFalse, commonUtils.Explicit_Wait_Time);
			eu.clickOnElement(togglebarButton, commonUtils.Explicit_Wait_Time);
		} else {
			eu.assertFailScenario("Toggle bar button scenario failure");
		}

	}

	public void verifyIconSync() {

		if (eu.displayStatusofElement(iconSyncDisable, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(togglebarButton, commonUtils.Explicit_Wait_Time);
			eu.clickOnElement(togglebarButton, commonUtils.Explicit_Wait_Time);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			eu.clickOnElement(iconSync, commonUtils.Explicit_Wait_Time);
		} else {
			eu.assertFailScenario("Toggle bar button scenario failure");
		}
	}

	public void verifyHeaderOfHostManagemnetScreen() {

		if (eu.displayStatusofElement(headerTable, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(headerTable, commonUtils.Explicit_Wait_Time);
		} else {
			eu.assertFailScenario("Header of the Host Management Screen is missing");
		}

	}

	public ArrayList<String> headerListOfTheHostManagementScreen() {

		return eu.printListOfWebelements(headerTanleElements, commonUtils.Explicit_Wait_Time);

	}

	public void verifyDataPresentInTheTable() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (dataAvailableinTable.size() != 0) {
			eu.printSizeOFWebElements(dataAvailableinTable, commonUtils.Explicit_Wait_Time);
		} else {

			eu.visibilityOfElement(emptyDataAvailableinTable, commonUtils.Explicit_Wait_Time);
			System.out.println("There are so table rows rpesent : " + emptyDataAvailableinTable.getText());
			Assert.assertTrue(eu.getTextFromElement(emptyDataAvailableinTable, commonUtils.Explicit_Wait_Time)
					.contains("No data available"));
		}

	}

	public void verifyDeleteIConISDisabled() {

		if (eu.displayStatusofElement(disabledDeleteIcon, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(disabledDeleteIcon, commonUtils.Explicit_Wait_Time);
		} else {
			eu.assertFailScenario("Delete ICON is not disabled at this point");
		}
	}

	public void verifyDeleteIconIsEnabled() {
		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		eu.waitTime();

		if (eu.displayStatusofElement(firstCheckBoxOFRow, commonUtils.Explicit_Wait_Time)) {

			eu.clickOnElement(firstCheckBoxOFRow, commonUtils.Explicit_Wait_Time);
			eu.visibilityOfElement(enabledDeleteIcon, commonUtils.Explicit_Wait_Time);

		} else {

			eu.assertFailScenario("Delete ICON is not enabled at this point");
		}

	}

	public void navigateToDiffrentPageAndVerifyDeleteICon() {

		eu.refreshThePage();
		eu.waitTime();
		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		eu.waitTime();

		if (eu.displayStatusofElement(firstCheckBoxOFRow, commonUtils.Explicit_Wait_Time)) {

			eu.clickOnElement(firstCheckBoxOFRow, commonUtils.Explicit_Wait_Time);
			eu.visibilityOfElement(enabledDeleteIcon, commonUtils.Explicit_Wait_Time);

		} else {

			eu.assertFailScenario("Delete ICON is not enabled at this point");
		}

		eu.clickOnElement(hostmanagemnetTab, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(companyCardtab, commonUtils.Explicit_Wait_Time);

		eu.waitTime();

		if (eu.displayStatusofElement(disabledDeleteIcon, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(disabledDeleteIcon, commonUtils.Explicit_Wait_Time);
		} else {
			eu.assertFailScenario("Delete ICON is not disabled at this point");
		}
	}

	public void clickOnCompanyCardCSVIcon() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		eu.waitTime();
		eu.visibilityOfElement(hostmangementCSVFileICon, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(hostmangementCSVFileICon, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyCOMpanycRdCSVFileDownloaded(String strArg1, String strArg2, String strArg3) {

		return eu.isFileDownload(strArg1, strArg2, strArg3);
	}

	public String verifyWhenCSVdoesnotHaveanyData() {

		String dataPresent = null;
		if (eu.displayStatusofElement(noDataWarningMessage, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(noDataWarningMessage, commonUtils.Explicit_Wait_Time);
			System.out.println("Verified there is no file to be download");
			dataPresent = eu.getTextFromElement(noDataWarningMessage, commonUtils.Explicit_Wait_Time);
		} else {
			System.out.println("File is present");
		}
		return dataPresent;
	}

	public boolean verifyCOMpanycRdPDFFileDownloaded(String strArg1, String strArg2, String strArg3) {

		return eu.isFileDownload(strArg1, strArg2, strArg3);
	}

	public void clickOnCompanyCardPDFIcon() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		eu.waitTime();
		eu.visibilityOfElement(pdfFileICOnCompanycard, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(pdfFileICOnCompanycard, commonUtils.Explicit_Wait_Time);
	}

	public String verifyHostComputerTitle() {

		return eu.getTextFromElement(HastComputerTitle, commonUtils.Implicit_Wait_Time);
	}

	public String verifyHostNumber(String strq1) {

		WebElement element = driver.findElement(By.xpath("//mat-table//mat-row//child::*[text()=' " + strq1 + " ']"));
		return eu.getTextFromElement(element, commonUtils.Implicit_Wait_Time);
	}

	public void getSiteCount(String str1) {

		WebElement ele1 = driver.findElement(By.xpath(
				"(//mat-table//mat-row//child::*[text()=' " + str1 + " ']//following::*[@class='siteVehData'])[1]"));
		eu.displayStatusofElement(ele1, commonUtils.Implicit_Wait_Time);
		String siteValue = eu.getTextFromElement(ele1, commonUtils.Implicit_Wait_Time);
		System.out.println("The number of site present at present is : " + siteValue);

	}

	public void getVehicleCount(String str2) {

		WebElement ele2 = driver.findElement(By.xpath(
				"(//mat-table//mat-row//child::*[text()=' " + str2 + " ']//following::*[@class='siteVehData'])[2]"));
		eu.displayStatusofElement(ele2, commonUtils.Implicit_Wait_Time);
		String vehicleCountNumber = eu.getTextFromElement(ele2, commonUtils.Implicit_Wait_Time);
		System.out.println("The number of Vehicles present at present is : " + vehicleCountNumber);

	}

	public void clickOnSiteOrVehicleButton(String str1) {

		WebElement ele = driver.findElement(By.xpath("//mat-table//mat-row//child::*[text()=' " + str1
				+ " ']//following::mat-cell[contains(@class,'linkTo-data cdk-column-linkTo mat-column-linkTo')]"));
		eu.clickOnElement(ele, commonUtils.Implicit_Wait_Time);
	}

	public void verifyRadioButtonINCompanyCardPage() {

		eu.elementIsDisplayed(AllVehicleRadioButton, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(AllVehicleRadioButton, commonUtils.Implicit_Wait_Time);

	}

	public void verifySearchButtonIcon(String str) {

		eu.elementIsDisplayed(searchIcon, commonUtils.Implicit_Wait_Time);
		eu.clickOnElement(searchIcon, commonUtils.Implicit_Wait_Time);
		eu.typeTextIntoElement(searchBarPlaceHolder, str, commonUtils.Implicit_Wait_Time);

	}

	public void verifyVehiclePresent(String str) {

		WebElement ele = driver.findElement(By.xpath("//div[text()='" + str + "']"));
		eu.displayStatusofElement(ele, commonUtils.Implicit_Wait_Time);
		eu.clickOnElement(ele, commonUtils.Implicit_Wait_Time);
	}

	public String verifyCompanyCardNumber(String str) {

		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'" + str + "')]"));
		return eu.getTextFromElement(ele, commonUtils.Implicit_Wait_Time);
	}

	public void verifyPlaceholderOfAllvehicles() {

		eu.displayStatusofElement(allVehiclePlaceHodler, commonUtils.Implicit_Wait_Time);
	}

	public void verifyDropDownArraw() {

		eu.displayStatusofElement(downArrow, commonUtils.Implicit_Wait_Time);

	}

	public void verifyAlignmentArraw() {

		eu.displayStatusofElement(sortingOrder, commonUtils.Implicit_Wait_Time);
		eu.clickOnElement(sortingOrder, commonUtils.Implicit_Wait_Time);
	}

	public void verifyCancelButton() {

		eu.displayStatusofElement(cancelButton, commonUtils.Implicit_Wait_Time);
		System.out.println("Cancel buttom is verified");
	}

	public String verifyHeaderOfAssociatedSitesOrVehicle() {
		System.out.println("We are verifing Associate placeholder");

		return eu.getTextFromElement(associateSitePlaceholder, commonUtils.Implicit_Wait_Time);

	}

	public void verifyRightArrawButton() throws InterruptedException {

		// you are here finding the right Arrow xpath
		System.out.println("Failing here ___________________________________");
		eu.clickOnElement(rightArrow, commonUtils.Explicit_Wait_Time);
	}

	public void verifySaveButton() {

		eu.clickOnElement(saveButton, commonUtils.Explicit_Wait_Time);

	}

	public void verifyLeftArrawButton() {

		eu.displayStatusofElement(leftArrow, commonUtils.Implicit_Wait_Time);
		eu.clickOnElement(leftArrow, commonUtils.Implicit_Wait_Time);
	}

	public void verifyAllSitesPalceHolder() {

		eu.displayStatusofElement(allSites, commonUtils.Implicit_Wait_Time);
	}

	public String verifySuccessMessage() {

		return eu.getTextFromElement(successMessage, commonUtils.Implicit_Wait_Time);
	}

	public int verifyVehicleCountIncrease(String str3) {

		eu.refreshThePage();
		WebElement ele3 = driver.findElement(By.xpath(
				"(//mat-table//mat-row//child::*[text()=' " + str3 + " ']//following::*[@class='siteVehData'])[2]"));
		eu.displayStatusofElement(ele3, commonUtils.Implicit_Wait_Time);
		String vehicleCountNumber = eu.getTextFromElement(ele3, commonUtils.Implicit_Wait_Time);
		System.out.println("The number of Vehicles present at present is : " + vehicleCountNumber);
		int count = Integer.parseInt(vehicleCountNumber);
		return count;

	}

	public void verifyClickOnYesButton() {

		eu.clickOnElement(yesButton, commonUtils.Implicit_Wait_Time);

	}

	public void verifyDeleteIcon() {

		eu.displayStatusofElement(deleteIcon, commonUtils.Implicit_Wait_Time);

		if (deleteIcon.isDisplayed()) {
			System.out.println("Delete Icon is present");
		} else {
			Assert.fail("Delete Icon is not present");

		}

	}

	public void verifySyncIcon() {

		eu.displayStatusofElement(syncIcon, commonUtils.Implicit_Wait_Time);
		if (syncIcon.isDisplayed()) {
			System.out.println("Delete Icon is present");
		} else {
			Assert.fail("Delete Icon is not present");
		}
	}

	public String verifypaginationTitle() {

		return eu.getTextFromElement(pagenationTitle, commonUtils.Implicit_Wait_Time);
	}

	public String verifyPaginationDropdownButton() {

		return eu.getTextFromElement(defaultPaginationValue, commonUtils.Implicit_Wait_Time);
	}

	public void verifyPaginationDropdownButtonArrow() {

		if (eu.displayStatusofElement(paginationDropdownArrow, commonUtils.Implicit_Wait_Time)) {
			System.out.println("Dropdown Arrow is present ");
			eu.clickOnElement(paginationDropdownArrow, commonUtils.Implicit_Wait_Time);
		} else {
			Assert.fail("Pagination dropdown Arrow is not present");
		}
	}

	public ArrayList<String> verifyElementsInPagination() {

		return eu.printListOfWebelements(paginationList, commonUtils.Implicit_Wait_Time);

	}

	public String verifyStatusTitle() {

		return eu.getTextFromElement(statusTitle, commonUtils.Implicit_Wait_Time);
	}

	public ArrayList<String> verifyCompanyPageStatusDropdownButton() {

		eu.displayStatusofElement(companyCardStatusDropdown, commonUtils.Implicit_Wait_Time);
		eu.clickOnElement(companyCardStatusDropdown, commonUtils.Implicit_Wait_Time);
		return eu.printListOfWebelements(statusFilterElements, commonUtils.Implicit_Wait_Time);
	}

	public void verifySortingFilter() {

		int count = 6;

		if (!sortFilterInCC.isEmpty()) {

			int filtersPresent = sortFilterInCC.size();
			if (filtersPresent >= count) {
				System.out.println("Sorting filter is present");
			}
		} else {
			Assert.fail("Filter is Not present");
		}
	}

	public void verifySearchFieldIsPresent() {

		if (eu.displayStatusofElement(placeholderSearch, commonUtils.Implicit_Wait_Time)) {

			eu.displayStatusofElement(searchIconPresent, commonUtils.Implicit_Wait_Time);
			System.out.println("Search filed is present");
		} else {
			Assert.fail("Search filed is not worling as expected");
		}
	}

	public void verifyTextEnteredInSearchField(String str) {

		eu.typeTextIntoElement(placeholderSearch, str, commonUtils.Implicit_Wait_Time);

		WebElement companyCard = driver.findElement(By.xpath("//mat-cell[text()=' " + str + " ']"));

		if (companyCard.isDisplayed()) {

			System.out.println("Search filed is working");
		} else {
			Assert.fail("Search filed is not showing results");
		}
	}
	
	public String verifyAccountOrCompanyPlaceholderName() {
		
		return eu.getTextFromElement(companyAccountNamePlaceholder, commonUtils.Implicit_Wait_Time);
	}

	public void veridyDropdownFilterOfAccountCompanyName() {
		
		if(eu.displayStatusofElement(accountNameDropdownButton, commonUtils.Implicit_Wait_Time)) {
			
			eu.clickOnElement(accountNameDropdownButton, commonUtils.Implicit_Wait_Time);
			System.out.println("Drop down is working fine");
		}else {
			
			Assert.fail("Dropdown is not working as expected");
		}
	}
	
	public String getStatusFieldText() {
		
		return eu.getTextFromElement(statusField, commonUtils.Implicit_Wait_Time);
	}
	
	
}
