package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class LoginPage {

	WebDriver driver;
	private ElementsUtils eu;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginFiled;

	@FindBy(xpath = "//div[contains(@class,'alert alert-danger')]")
	private WebElement warningMessage;
	
//	@FindBy(id="username")
//	private WebElement emailAddress;
//	
//	@FindBy(xpath="//button[@name='action']")
//	private WebElement submit;
//	
//	@FindBy(id="password")
//	private WebElement password;
//	
//	@FindBy(css="button[class*='_button-login-password']")
//	private WebElement clickOncontinue;
	
	

	public void enterEmailAddress(String emailtext) {

		eu.typeTextIntoElement(emailField, emailtext, commonUtils.Explicit_Wait_Time);
	}

	public void enterPasswordField(String password) {

		eu.typeTextIntoElement(passwordField, password, commonUtils.Explicit_Wait_Time);
	}

	public void clickOnLoginButton() {

		eu.clickOnElement(loginFiled, commonUtils.Explicit_Wait_Time);
		//return new AccountPage(driver);
		
	}

	public String verifyWarningMessage() {

		return eu.getTextFromElement(warningMessage, commonUtils.Explicit_Wait_Time);
	}

}
