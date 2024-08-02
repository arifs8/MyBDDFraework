package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class RemoteDownloadSettingPage {

	WebDriver driver;
	private ElementsUtils eu;

	public RemoteDownloadSettingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//*[text()='Remote Download Settings']")
	private WebElement remoteDownlaodSettingPage;

	@FindBy(xpath = "//*[text()='Delegate File Download']")
	private WebElement DelegateFileDownlaodTitle;

	@FindBy(xpath = "//*[@data-mat-icon-name='authorize']")
	private WebElement AuthorizeIcon;

	@FindBy(xpath = "//*[@data-placeholder='Please enter the Account Name']")
	private WebElement searchField;

	@FindBy(xpath = "//*[contains(@class,'disabled-button')]")
	private WebElement disbaledAuthorizeButton;

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement enableAuthorizeButton;

	@FindBy(xpath = "//h2[text()=' Authorize! ']")
	private WebElement popupAuthorize;

	@FindBy(xpath = "//span[text()=' No ']")
	private WebElement AuthorizePopupNO;

	@FindBy(xpath = "//span[text()=' Yes ']")
	private WebElement AuthorizePopupYes;

	@FindBy(xpath = "//span[text()='Authorization Delegation Success']")
	private WebElement AuthorizationSuccess;

	@FindBy(xpath = "//span[text()='Revoke']")
	private WebElement revokeButton;

	@FindBy(xpath = "//*[@data-mat-icon-name='correct']")
	private WebElement correctIcon;
	
	@FindBy(xpath = "//*[text()=' Revoke! ']")
	private WebElement revokeTitlePopup;
	
	@FindBy(xpath = "//span[text()='Revoke Authorization Success']")
	private WebElement revokeSuccesMessage;
	
	@FindBy(xpath = "//span[text()='Self Authorization is Not Allowed']")
	private WebElement selfDelegationMessage;
	
	@FindBy(xpath = "//*[@data-mat-icon-name='wrong']")
	private WebElement crossAccountdelegation;

	public void clickremoteDownloadSettingPage() {

		System.out.println("The present tab which we are in is : "
				+ eu.getTextFromElement(remoteDownlaodSettingPage, commonUtils.Explicit_Wait_Time));
		eu.clickOnElement(remoteDownlaodSettingPage, commonUtils.Explicit_Wait_Time);
	}

	public String verifyRemoteDownlaodSettingTitle() {

		eu.visibilityOfElement(remoteDownlaodSettingPage, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this tab is: "
				+ eu.getTextFromElement(remoteDownlaodSettingPage, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(remoteDownlaodSettingPage, commonUtils.Explicit_Wait_Time);
	}

	public String verifydelegateTitle() {

		eu.visibilityOfElement(DelegateFileDownlaodTitle, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this tab is: "
				+ eu.getTextFromElement(DelegateFileDownlaodTitle, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(DelegateFileDownlaodTitle, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyAuthorizeIcon() {

		return eu.displayStatusofElement(AuthorizeIcon, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifySearchField() {

		return eu.displayStatusofElement(searchField, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyDisbaledAuthorizeButton() {

		return eu.displayStatusofElement(disbaledAuthorizeButton, commonUtils.Explicit_Wait_Time);
	}

	public void passTheAccountName(String string) {

		eu.typeTextIntoElement(searchField, string, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyEnabledAuthorizeIcon() {

		eu.waitTime();
		return eu.displayStatusofElement(enableAuthorizeButton, commonUtils.Explicit_Wait_Time);
	}

	public void clickAuthorizeButton() {

		eu.waitTime();
		eu.clickOnElement(enableAuthorizeButton, commonUtils.Explicit_Wait_Time);
	}

	public String verifyAuthorizePopupTitle() {

		eu.visibilityOfElement(popupAuthorize, commonUtils.Explicit_Wait_Time);
		System.out.println(
				"The title of this tab is: " + eu.getTextFromElement(popupAuthorize, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(popupAuthorize, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyAuthorizePopupNoButton() {

		return eu.displayStatusofElement(AuthorizePopupNO, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyAuthorizePopupYesButton() {

		return eu.displayStatusofElement(AuthorizePopupYes, commonUtils.Explicit_Wait_Time);
	}

	public void clickAuthorizeButtonNO() {

		eu.clickOnElement(AuthorizePopupNO, commonUtils.Explicit_Wait_Time);
	}

	public void clickAuthorizeButtonYES() {

		eu.waitTime();
		eu.clickOnElement(AuthorizePopupYes, commonUtils.Explicit_Wait_Time);
	}

	public String verifyAuthorizationSuccessMessage() {

		return eu.getTextFromElement(AuthorizationSuccess, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyRevokeButton() {

		return eu.displayStatusofElement(revokeButton, commonUtils.Explicit_Wait_Time);
	}

	public boolean verifyCorrectIconButton() {

		return eu.displayStatusofElement(correctIcon, commonUtils.Explicit_Wait_Time);
	}
	
	public void clickOnRevokeButtone() {
		
		eu.clickOnElement(revokeButton, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifyRevokeTitle() {
		
		return eu.getTextFromElement(revokeTitlePopup, commonUtils.Explicit_Wait_Time);
	}
	
	public boolean clickRevokeButtonNO() {

		return eu.displayStatusofElement(AuthorizePopupNO, commonUtils.Explicit_Wait_Time);
	}

	public boolean clickRevokeButtonYES() {

		eu.waitTime();
		return eu.displayStatusofElement(AuthorizePopupYes, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifyRevokeSuccessMessage() {
		
		eu.visibilityOfElement(revokeSuccesMessage, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this tab is: "
				+ eu.getTextFromElement(revokeSuccesMessage, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(revokeSuccesMessage, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifySelfDelegationTitle() {

		eu.visibilityOfElement(selfDelegationMessage, commonUtils.Explicit_Wait_Time);
		System.out.println("The title of this tab is: "
				+ eu.getTextFromElement(selfDelegationMessage, commonUtils.Explicit_Wait_Time));
		return eu.getTextFromElement(selfDelegationMessage, commonUtils.Explicit_Wait_Time);
	}
	
	public boolean verifyCrossMArkForWrongAccount() {

		eu.waitTime();
		return eu.displayStatusofElement(crossAccountdelegation, commonUtils.Explicit_Wait_Time);
	}

}
