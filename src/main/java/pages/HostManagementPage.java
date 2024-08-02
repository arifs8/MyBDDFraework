package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class HostManagementPage {

	WebDriver driver;
	private ElementsUtils eu;

	public HostManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//p[text()='Host management']")
	private WebElement hostManagemnetTitle;

	@FindBy(xpath = "//span[text()='Company/Account']")
	private WebElement companyAccountdropdownText;

	@FindBy(xpath = "//div[@id='mat-select-value-1']//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]")
	private WebElement companyDropdown;

	@FindBy(xpath = "//span[text()=' rtmdemo ']")
	private WebElement accountName;

	@FindBy(xpath = "//div[@role='listbox']//child::input[@placeholder='Search...']")
	private WebElement searchField;

	@FindBy(xpath = "//label[@class='mat-checkbox-layout']//child::*[text()='All']")
	private WebElement allOPtion;

	@FindBy(xpath = "//span[text()='Client status']")
	private WebElement clientStatusText;

	@FindBy(xpath = "//mat-select[@id='mat-select-2']//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]")
	private WebElement clientStatusDropdown;

	@FindBy(xpath = "//div[@id='mat-select-2-panel']//child::span")
	private List<WebElement> dropDownElementsClientStatus;

	@FindBy(xpath = "//span[text()='Version']")
	private WebElement versionTitle;

	@FindBy(xpath = "//mat-select[@id='mat-select-4']//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]")
	private WebElement versionDropdown;

	@FindBy(xpath = "//div[@id='mat-select-4-panel']//child::mat-option")
	private List<WebElement> dropdownVersionElemenst;

	@FindBy(xpath = "//span[text()='Service']")
	private WebElement serviceTitle;

	@FindBy(xpath = "//mat-select[@id='mat-select-6']//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')]")
	private WebElement serviceDropdown;

	@FindBy(xpath = "//div[@id='mat-select-6-panel']//child::mat-option")
	private List<WebElement> statusDropDown;

	@FindBy(xpath = "//div[text()='auto sync']")
	private WebElement autoSyncTitleText;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-1-input' and @aria-checked='true']")
	private WebElement togglebarTrue;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-1-input' and @aria-checked='false']")
	private WebElement togglebarFalse;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-1-input']//following-sibling::*")
	private WebElement togglebarButton;

	@FindBy(xpath = "//*[contains(@class,'icon-sync disabled')]")
	private WebElement iconSyncDisable;

	@FindBy(xpath = "//*[contains(@class,'icon-sync')]")
	private WebElement iconSync;

	@FindBy(xpath = "//span[text()='AC INSTALLER']")
	private WebElement acClientInstaller;

	@FindBy(xpath = "//span[text()='AC INSTALLER']//following-sibling::span")
	private WebElement versionACClient;

	@FindBy(xpath = "//span[text()='DC INSTALLER']")
	private WebElement dcClientInstaller;

	@FindBy(xpath = "//span[text()='DC INSTALLER']//following-sibling::span")
	private WebElement versionDCClient;

	@FindBy(xpath = "//thead[@role='rowgroup']//tr")
	private WebElement headerTable;

	@FindBy(xpath = "//thead[@role='rowgroup']//tr/th")
	private List<WebElement> headerTanleElements;

	@FindBy(xpath = "//div[text()=' No data available ']")
	private WebElement emptyDataAvailableinTable;

	@FindBy(xpath = "//tbody//tr")
	private List<WebElement> dataAvailableinTable;

	@FindBy(xpath = "//tbody//tr[1]")
	private WebElement firstDataOfTableRow;

	@FindBy(xpath = "//span[@class='mat-checkbox-label']//child::*[text()='All']")
	private WebElement selectAllItam;

	@FindBy(xpath = "//thead[@role='rowgroup']")
	private WebElement tableHeader;

	@FindBy(xpath = "//span[text()='8']")
	private WebElement hostmangementCSVFileICon;

	@FindBy(xpath = "//span[text()='This file contains no data']")
	private WebElement noDataWarningMessage;

	@FindBy(xpath = "//*[contains(@class,'search-icon')]")
	private WebElement searchIconInHostManagementScreen;

	@FindBy(xpath = "//input[contains(@data-placeholder,'Search...')]")
	private WebElement searchFieldHostMangement;

	public String verifyHostTitle() {

		return eu.getTextFromElement(hostManagemnetTitle, commonUtils.Explicit_Wait_Time);
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

	public String verifyVersionTitle() {

		System.out.println(versionTitle.getText());
		return eu.getTextFromElement(versionTitle, commonUtils.Explicit_Wait_Time);
	}

	public ArrayList<String> selectVersionDropdown() {
		eu.clickOnElement(versionDropdown, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(dropdownVersionElemenst, commonUtils.Explicit_Wait_Time);

	}

	public String verifyServiceTitle() {
		return eu.getTextFromElement(serviceTitle, commonUtils.Explicit_Wait_Time);
	}

	public ArrayList<String> selectServiceDropdown() {
		eu.clickOnElement(serviceDropdown, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(statusDropDown, commonUtils.Explicit_Wait_Time);

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

	public String verifyAcClientinstallerTitle() {

		System.out.println("The Installer name is : " + acClientInstaller);
		return eu.getTextFromElement(acClientInstaller, commonUtils.Explicit_Wait_Time);
	}

	public String verifyVersionOfAcClient() {

		System.out.println("The AC Client Installer version is : " + versionACClient);
		return eu.getTextFromElement(versionACClient, commonUtils.Explicit_Wait_Time);
	}

	public String verifyDcClientinstallerTitle() {

		System.out.println("The Installer name is : " + dcClientInstaller);
		return eu.getTextFromElement(dcClientInstaller, commonUtils.Explicit_Wait_Time);
	}

	public String verifyVersionOfDcClient() {

		System.out.println("The AC Client Installer version is : " + versionDCClient);
		return eu.getTextFromElement(versionDCClient, commonUtils.Explicit_Wait_Time);
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
		eu.waitTime();
		if (dataAvailableinTable.size() != 0) {
			eu.printSizeOFWebElements(dataAvailableinTable, commonUtils.Explicit_Wait_Time);
		} else {

			eu.visibilityOfElement(emptyDataAvailableinTable, commonUtils.Explicit_Wait_Time);
			System.out.println("There are so table rows rpesent : " + emptyDataAvailableinTable.getText());
			Assert.assertTrue(eu.getTextFromElement(emptyDataAvailableinTable, commonUtils.Explicit_Wait_Time)
					.contains("No data available"));
		}

	}

	public void clickHostMangementCSVIcon() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		eu.waitTime();
		eu.visibilityOfElement(hostmangementCSVFileICon, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(hostmangementCSVFileICon, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyFileDownloaded(String strArg1, String strArg2, String strArg3) {

		return eu.isFileDownload(strArg1, strArg2, strArg3);
	}

	public String verifyEmptyFileToDownload() {

		eu.visibilityOfElement(noDataWarningMessage, commonUtils.Explicit_Wait_Time);
		System.out.println("Verified there is no file to be download");
		return eu.getTextFromElement(noDataWarningMessage, commonUtils.Explicit_Wait_Time);
	}

	public void verifySearchInconInHostmangementScreen() {

		eu.visibilityOfElement(searchIconInHostManagementScreen, commonUtils.Explicit_Wait_Time);

	}

	public void verifyPassinTextInSearchFields(String string) {

		eu.typeTextIntoElement(searchFieldHostMangement, string, commonUtils.Explicit_Wait_Time);
	}

	public void clickHostMangementPDFIcon() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAllItam, commonUtils.Explicit_Wait_Time);
		eu.clickEscapeINBetween();
		eu.waitTime();
		eu.visibilityOfElement(hostmangementCSVFileICon, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(hostmangementCSVFileICon, commonUtils.Explicit_Wait_Time);
	}
}
