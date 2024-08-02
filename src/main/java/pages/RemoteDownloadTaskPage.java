package pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class RemoteDownloadTaskPage {

	WebDriver driver;
	private ElementsUtils eu;

	public RemoteDownloadTaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//p[text()='Remote Download Tasks']")
	private WebElement RemoteDownloadTab;

	@FindBy(xpath = "//span[text()='Company/Account']")
	private WebElement companyAccountdropdownText;

	@FindBy(xpath = "(//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')])[1]")
	private WebElement companyDropdown;

	@FindBy(xpath = "//span[@class='mat-checkbox-label']//span[text()='All']")
	private WebElement aall;

	@FindBy(xpath = "//div[@role='listbox']//child::*[contains(@id,'mat')]")
	private List<WebElement> companyDropdownElements;

	@FindBy(xpath = "//div[@aria-multiselectable='true']")
	private WebElement scrollBar;

	@FindBy(xpath = "//span[text()='Status']")
	private WebElement clientStatusText;

	@FindBy(xpath = "(//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')])[2]")
	private WebElement statusDropdown;

	@FindBy(xpath = "//div[@role='listbox']//child::mat-option")
	private List<WebElement> statusElements;

	@FindBy(xpath = "(//mat-option[@role='option']//*[text()=' Planned '])[2]")
	private WebElement plannedelementSelection;

	@FindBy(xpath = "//*[text()='File type']")
	private WebElement fileTypeTitle;

	@FindBy(xpath = "(//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')])[3]")
	private WebElement fileTypeDropdown;

	@FindBy(xpath = "//div[@role='listbox']//mat-option")
	private List<WebElement> fielTypeList;

	@FindBy(xpath = "//*[text()='Device']")
	private WebElement deviceTypeTitle;

	@FindBy(xpath = "(//following-sibling::div[contains(@class,'mat-select-arrow-wrapper')])[4]")
	private WebElement deviceTypeDropdown;

	@FindBy(xpath = "//div[@role='listbox']//mat-option")
	private List<WebElement> DeviceTypeList;

	@FindBy(xpath = "//div[text()='auto sync']")
	private WebElement autoSyncTitleText;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-2-input' and @aria-checked='true']")
	private WebElement togglebarTrue;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-2-input' and @aria-checked='false']")
	private WebElement togglebarFalse;

	@FindBy(xpath = "//input[@id='mat-slide-toggle-2-input']//following-sibling::*")
	private WebElement togglebarButton;

	@FindBy(xpath = "//*[contains(@class,'icon-sync syncing disabled')]")
	private WebElement iconSyncDisable;

	@FindBy(xpath = "//*[contains(@class,'icon-sync')]")
	private WebElement iconSync;

	@FindBy(xpath = "//*[@role='columnheader']")
	private WebElement headerTable1;

	@FindBy(xpath = "//*[@role='columnheader']")
	private List<WebElement> headerElements;

	@FindBy(xpath = "//tbody//tr")
	private List<WebElement> dataAvailableinTable;

	@FindBy(xpath = "//*[@class='table-assets ng-star-inserted']")
	private WebElement emptyDataAvailableinTable;

	public void clickRemoteDownloadTaskTab() {

		System.out.println("The present tab which we are in is : "
				+ eu.getTextFromElement(RemoteDownloadTab, commonUtils.Explicit_Wait_Time));
		eu.clickOnElement(RemoteDownloadTab, commonUtils.Explicit_Wait_Time);
	}

	public String getRemoteDownloadTaskTitle() {

		eu.visibilityOfElement(RemoteDownloadTab, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this tab is: "
				+ eu.getTextFromElement(RemoteDownloadTab, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(RemoteDownloadTab, commonUtils.Explicit_Wait_Time);
	}

	public String verifyCompanyAccountText() {

		return eu.getTextFromElement(companyAccountdropdownText, commonUtils.Explicit_Wait_Time);

	}

	public void verifyDropdownisClickable() {

		eu.visibilityOfElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);

	}

	public void verifyAccountName() {

		eu.visibilityOfElement(aall, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(aall, commonUtils.Explicit_Wait_Time);
	}

	public ArrayList<String> selectClientSatusDropdown() {
		// eu.clickOnElement(companyDropdownElements, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(companyDropdownElements, commonUtils.Explicit_Wait_Time);

	}

	public void clikOperation() {
		eu.clickEscapeINBetween();
	}

	public boolean verifyScrollbar() {

		return eu.displayStatusofElement(scrollBar, commonUtils.Explicit_Wait_Time);
	}

	public String getRemoteDownloadSattusDropdownTitle() {

		eu.visibilityOfElement(clientStatusText, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(clientStatusText, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(clientStatusText, commonUtils.Explicit_Wait_Time);
	}

	public void verifyStatusDropdownisClickable() {

		eu.visibilityOfElement(statusDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(statusDropdown, commonUtils.Explicit_Wait_Time);

	}

	public ArrayList<String> selectStatusDropdown() {
		// eu.clickOnElement(companyDropdownElements, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(statusElements, commonUtils.Explicit_Wait_Time);

	}

	public void selectPlannedElement() {

		eu.visibilityOfElement(plannedelementSelection, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(plannedelementSelection, commonUtils.Explicit_Wait_Time);

	}

	public String getRemoteDownloadFileTypeDropdownTitle() {

		eu.visibilityOfElement(fileTypeTitle, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(fileTypeTitle, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(fileTypeTitle, commonUtils.Explicit_Wait_Time);
	}

	public void verifyFileTypeDropdownisClickable() {

		eu.visibilityOfElement(fileTypeDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(fileTypeDropdown, commonUtils.Explicit_Wait_Time);

	}

	public ArrayList<String> selectFileTypeDropdown() {
		// eu.clickOnElement(companyDropdownElements, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(fielTypeList, commonUtils.Explicit_Wait_Time);

	}

	public String getRemoteDownloadDeviceDropdownTitle() {

		eu.visibilityOfElement(deviceTypeTitle, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(deviceTypeTitle, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(deviceTypeTitle, commonUtils.Explicit_Wait_Time);
	}

	public void verifyDeviceTypeDropdownisClickable() {

		eu.visibilityOfElement(deviceTypeDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(deviceTypeDropdown, commonUtils.Explicit_Wait_Time);

	}

	public ArrayList<String> selectDeviceTypeDropdown() {
		// eu.clickOnElement(companyDropdownElements, commonUtils.Explicit_Wait_Time);
		return eu.printListOfWebelements(DeviceTypeList, commonUtils.Explicit_Wait_Time);

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

	public void verifyHeaderOfremoteDownlaodTaskScreen() {

		if (eu.displayStatusofElement(headerTable1, commonUtils.Explicit_Wait_Time)) {

			eu.visibilityOfElement(headerTable1, commonUtils.Explicit_Wait_Time);
		} else {
			eu.assertFailScenario("Header of the Remote Download Task Screen is missing");
		}

	}

	public ArrayList<String> headerListOfTheRemoteDownloadTaskScreen() {

		return eu.printListOfWebelements(headerElements, commonUtils.Explicit_Wait_Time);

	}

	public void verifyDataPresentInTheRDTaskTable() {

		eu.clickOnElement(companyDropdown, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(aall, commonUtils.Explicit_Wait_Time);
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

			eu.waitTime();
			eu.visibilityOfElement(emptyDataAvailableinTable, commonUtils.Explicit_Wait_Time);
			System.out.println("There are so table rows rpesent : " + emptyDataAvailableinTable.getText());
			Assert.assertTrue(eu.getTextFromElement(emptyDataAvailableinTable, commonUtils.Explicit_Wait_Time)
					.contains("No data available"));
		}

	}

}
