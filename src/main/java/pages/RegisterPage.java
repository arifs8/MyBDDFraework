package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class RegisterPage {

	WebDriver driver;
	private ElementsUtils eu;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton; 
	
	@FindBy(xpath = "(//label[@class='radio-inline']//input)[1]")
	private WebElement radioYesButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert-danger')]")
	private WebElement warningMessage;
	
	@FindBy(xpath = "//input[@id='input-firstname']//following-sibling::div")
	private WebElement firstNameWarning;
	
	@FindBy(xpath = "//input[@id='input-lastname']//following-sibling::div")
	private WebElement lastNameWarning;
	
	@FindBy(xpath = "//input[@id='input-email']//following-sibling::div")
	private WebElement emailNameWarning;
	
	@FindBy(xpath = "//input[@id='input-telephone']//following-sibling::div")
	private WebElement telephoneWarning;
	
	@FindBy(xpath = "//input[@id='input-password']//following-sibling::div")
	private WebElement passwordWarning;
	
	
	public void verifyFirstNameField(String nameField) {
		eu.typeTextIntoElement(firstNameField, nameField, commonUtils.Explicit_Wait_Time);
		//firstNameField.sendKeys(nameField);
	}
	
	public void verifyLastNameField(String lastNameText) {
		eu.typeTextIntoElement(lastNameField, lastNameText, commonUtils.Explicit_Wait_Time);
		//lastNameField.sendKeys(lastNameText);
	}
	
	public void verifyEmailField(String emailText) {
		eu.typeTextIntoElement(emailField, emailText, commonUtils.Explicit_Wait_Time);
		//emailField.sendKeys(emailText);
	}
	
	public void verifyTelephoneField(String telephoneText) {
		eu.typeTextIntoElement(telephoneField, telephoneText, commonUtils.Explicit_Wait_Time);
		//telephoneField.sendKeys(telephoneText);
	}
	
	public void verifypasswordField(String passwordText) {
		eu.typeTextIntoElement(passwordField, passwordText, commonUtils.Explicit_Wait_Time);
		//passwordField.sendKeys(passwordText);
	}
	
	public void verifyConfirmPasswordField(String confirmText) {
		eu.typeTextIntoElement(confirmPasswordField, confirmText, commonUtils.Explicit_Wait_Time);
		//confirmPasswordField.sendKeys(confirmText);
	}
	
	public void clickPrivacyPolicyCheckbox() {
		eu.clickOnElement(privacyPolicyCheckBox, commonUtils.Explicit_Wait_Time);
		//privacyPolicyCheckBox.click();
	}
	
	public AccountSuccessPage clickContinueButton() {
		eu.clickOnElement(continueButton, 15);
		//continueButton.click();
		return new AccountSuccessPage(driver);
	}
	
	public void selectYesButton() {
		eu.clickOnElement(radioYesButton, 15);
		radioYesButton.click();
	}
	
	public String getWarningMessageText() {
		return eu.getTextFromElement(warningMessage, 15);
		//return  warningMessage.getText();
	}
	
	public String getFirstNameWarning() {
		return eu.getTextFromElement(firstNameWarning, 15);
		//return firstNameWarning.getText();
	}
	
	public String getLastNameWarning() {
		return eu.getTextFromElement(lastNameWarning, 15);
		//return lastNameWarning.getText();
	}
	
	public String getTelephoneWarning() {
		return eu.getTextFromElement(telephoneWarning, 15);
		//return telephoneWarning.getText();
	}
	
	public String getEmailWarning() {
		return eu.getTextFromElement(emailNameWarning, 15);
		//return emailNameWarning.getText();
	}
	
	public String getPasswordWarning() {
		return eu.getTextFromElement(passwordWarning, 15);
		//return passwordWarning.getText();
		
	}
}







