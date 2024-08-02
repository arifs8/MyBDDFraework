package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class AssignCompanyCardPage {

	WebDriver driver;
	private ElementsUtils eu;

	public AssignCompanyCardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//h1[text()='remote download']")
	private WebElement remoteDownlaodTitle;
	
	@FindBy(xpath = "//*[contains(text(),'Assign company cards')]")
	private WebElement companyCardtab;

	@FindBy(xpath = "//span[text()='Company/Account']")
	private WebElement companyAccountdropdownText;

	@FindBy(xpath = "//p[text()='Company cards']")
	private WebElement companyCardPage;

	@FindBy(xpath = "//h1[contains(text(),'Company cards assignment')]")
	private WebElement assignmentPage;

	@FindBy(xpath = "//h2[text()='Companies list']")
	private WebElement companyListTitle;

	@FindBy(xpath = "//input[@placeholder='Search by company name']//following-sibling::*[contains(text(),'P')]")
	private WebElement searchIcon;

	@FindBy(xpath = "//input[@placeholder='Search by company name']")
	private WebElement searchIconFieldText;

	@FindBy(xpath = "//span[@class='oi']")
	private WebElement sortingIcon;

	@FindBy(xpath = "//div[@class='list-container']//child::li")
	private List<WebElement> companiesList;

	@FindBy(xpath = "(//div[@class='list-container']//child::li)[1]")
	private WebElement firstCompanieNameList;

	@FindBy(xpath = "//span[text()=' All available cards ']")
	private WebElement avilableCardsTitle;

	@FindBy(xpath = "(//label[contains(@class,'mat-checkbox-layout')]//child::*[@class='mat-ripple mat-checkbox-ripple mat-focus-indicator'])[1]")
	private WebElement avialbleCardsCheckbox;

	@FindBy(xpath = "//span[text()=' Cards assigned to dmmdemo ']")
	private WebElement cardsAssignedtoAccount;

	@FindBy(xpath = "(//div[contains(@class,'company-cards-list-container')])[2]//child::li")
	private List<WebElement> cardAvailableunderAccount;

	@FindBy(xpath = "//span[contains(text(),'420000000')]")
	private WebElement selectAssignedCard;

	@FindBy(xpath = "//div[@class='company-cards-buttons']//child::*[text()='chevron_left']")
	private WebElement leftArrow;

	@FindBy(xpath = "//div[@class='company-cards-buttons']//child::*[text()='chevron_right']")
	private WebElement rightArrow;

	@FindBy(xpath = "//span[text()=' Save ']//parent::*[@disabled='true']")
	private WebElement disbaledSaveButton;

	@FindBy(xpath = "//span[text()=' Save ']")
	private WebElement enableSaveButton;

	@FindBy(xpath = "//*[@class ='cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "//h2[text()=' Unsaved changes ! ']")
	private WebElement cancelPopupTitle;

	@FindBy(xpath = "//span[text()=' no ']")
	private WebElement popupNoOption;

	@FindBy(xpath = "//span[text()=' yes ']")
	private WebElement popupYesOption;

	public String verifyAssignCompanyCardTitle() {

		eu.visibilityOfElement(companyCardtab, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifyRemoetDownloadTitle() {

		eu.visibilityOfElement(remoteDownlaodTitle, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(remoteDownlaodTitle, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(remoteDownlaodTitle, commonUtils.Explicit_Wait_Time);
	}

	public void clickOnCompanycardTabOn() {

		System.out.println("The present tab which we are in is : "
				+ eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time));
		eu.clickOnElement(companyCardtab, commonUtils.Explicit_Wait_Time);
	}

	public String verifyCompanycardTitleOn() {

		eu.waitTime();
		eu.visibilityOfElement(companyCardtab, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(companyCardtab, commonUtils.Explicit_Wait_Time);
	}

	public void clickOnCompanyCardPage() {

		System.out.println("The present tab which we are in is : "
				+ eu.getTextFromElement(companyCardPage, commonUtils.Explicit_Wait_Time));
		eu.clickOnElement(companyCardPage, commonUtils.Explicit_Wait_Time);
	}

	public String verifyCompanyCardAssignmentPage() {

		eu.visibilityOfElement(assignmentPage, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this page is: " + assignmentPage.getText());

		return eu.getTextFromElement(assignmentPage, commonUtils.Explicit_Wait_Time);
	}

	public String verifyCompanyListTile() {

		eu.visibilityOfElement(companyListTitle, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this page is: " + companyListTitle.getText());

		return eu.getTextFromElement(companyListTitle, commonUtils.Explicit_Wait_Time);

	}

	public boolean verifySearchIcon() {

		eu.visibilityOfElement(searchIcon, commonUtils.Explicit_Wait_Time);
		System.out.println("Here we are finding the Search ICon present in Company Card Assigment page");
		return eu.displayStatusofElement(searchIcon, commonUtils.Explicit_Wait_Time);

	}

	public boolean verifySortingIcon() {

		eu.visibilityOfElement(sortingIcon, commonUtils.Explicit_Wait_Time);
		System.out.println("Here we are finding the Sorting ICon present in Company Card Assigment page");
		return eu.displayStatusofElement(sortingIcon, commonUtils.Explicit_Wait_Time);

	}

	public ArrayList<String> verifyListOfTheCompanies() {

		return eu.printListOfWebelements(companiesList, commonUtils.Explicit_Wait_Time);

	}

	public void sendCompanyNameintoSearchField(String str) {

		eu.typeTextIntoElement(searchIconFieldText, str, commonUtils.Explicit_Wait_Time);
	}

	public String verifylistedCompanieName() {

		eu.waitTime();
		eu.visibilityOfElement(firstCompanieNameList, commonUtils.Explicit_Wait_Time);
		System.out.println("The companie name listed here  is: " + firstCompanieNameList.getText());
		eu.clickOnElement(firstCompanieNameList, commonUtils.Explicit_Wait_Time);

		return eu.getTextFromElement(firstCompanieNameList, commonUtils.Explicit_Wait_Time);
	}

	public String verifyAvilableCardsTitle() {

		eu.waitTime();
		eu.visibilityOfElement(avilableCardsTitle, commonUtils.Explicit_Wait_Time);
		System.out.println("The title listed here  is: " + avilableCardsTitle.getText());
		return eu.getTextFromElement(avilableCardsTitle, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyCheckboxOfAvailableCards() {

		eu.visibilityOfElement(avialbleCardsCheckbox, commonUtils.Explicit_Wait_Time);
		System.out.println("Here we can see the checkbox present for the Available cards");
		return eu.displayStatusofElement(avialbleCardsCheckbox, commonUtils.Explicit_Wait_Time);
	}

	public String verifyCardsAssignedTitle() {

		eu.waitTime();
		eu.visibilityOfElement(cardsAssignedtoAccount, commonUtils.Explicit_Wait_Time);
		System.out.println("The title listed here  is: " + cardsAssignedtoAccount.getText());
		return eu.getTextFromElement(cardsAssignedtoAccount, commonUtils.Explicit_Wait_Time);
	}

	public ArrayList<String> verifyCardsAvailableUnderTheCompanies() {

		return eu.printListOfWebelements(cardAvailableunderAccount, commonUtils.Explicit_Wait_Time);

	}

	public void selectAssignedCardFromAccount() {

		eu.visibilityOfElement(selectAssignedCard, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(selectAssignedCard, commonUtils.Explicit_Wait_Time);
	}

	public void selectLeftArrow() {

		eu.waitTime();
		eu.visibilityOfElement(leftArrow, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(leftArrow, commonUtils.Explicit_Wait_Time);
	}

	public void selectRightArrow() {

		eu.waitTime();
		eu.visibilityOfElement(rightArrow, commonUtils.Explicit_Wait_Time);
		eu.clickOnElement(rightArrow, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifySaveButtonisDisbaled() {

		return eu.elementIsDisplayed(disbaledSaveButton, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifySaveButtonisEnabled() {

		return eu.elementIsDisplayed(enableSaveButton, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyCancelButton() {

		return eu.elementIsDisplayed(cancelButton, commonUtils.Explicit_Wait_Time);
	}

	public void clickCancelBUtton() {

		eu.waitTime();
		if (eu.displayStatusofElement(cancelButton, commonUtils.Explicit_Wait_Time)) {

			System.out.println("here we can see the " + cancelButton.getText() + "Button");
		}

		eu.clickOnElement(cancelButton, commonUtils.Explicit_Wait_Time);
	}

	public String verifyPopupTitle() {

		eu.waitTime();
		eu.visibilityOfElement(cancelPopupTitle, commonUtils.Explicit_Wait_Time);
		System.out.println("The title listed here  is: " + cancelPopupTitle.getText());
		return eu.getTextFromElement(cancelPopupTitle, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyNoOptionInPopup() {

		return eu.elementIsDisplayed(popupNoOption, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyYEsOptionInPopup() {

		return eu.elementIsDisplayed(popupYesOption, commonUtils.Explicit_Wait_Time);
	}

	public void clickOnNoOption() {

		eu.waitTime();
		if (eu.displayStatusofElement(popupNoOption, commonUtils.Explicit_Wait_Time)) {

			System.out.println("here we can see the " + popupNoOption.getText() + "Button");
		}

		eu.clickOnElement(popupNoOption, commonUtils.Explicit_Wait_Time);
	}

	public void clickOnYesOption() {

		eu.waitTime();
		if (eu.displayStatusofElement(popupYesOption, commonUtils.Explicit_Wait_Time)) {

			System.out.println("here we can see the " + popupYesOption.getText() + "Button");
		}

		eu.clickOnElement(popupYesOption, commonUtils.Explicit_Wait_Time);
	}
}
