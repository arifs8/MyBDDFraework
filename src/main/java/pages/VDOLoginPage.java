package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utils.ElementsUtils;
import utils.commonUtils;

public class VDOLoginPage {

	WebDriver driver;
	private ElementsUtils eu;
	
	public VDOLoginPage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
		 eu = new ElementsUtils(driver);
		
	}
	
	@FindBy(xpath = "//h1[text()='Admin tool mock']")
	private WebElement adminToolPage;
	
	@FindBy(xpath = "//div[@id='custom-prompt-logo']")
	private WebElement adminToolPageTitle;
	
	@FindBy(xpath = "//h1[text()='Welcome']")
	private WebElement welcomeTextStg;
	
	@FindBy(xpath = "//input[contains(@placeholder,'User name')]")
	private WebElement userNameField;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Account name')]")
	private WebElement accountNmaeField;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h1[text()='remote download']")
	private WebElement remoteDownloadText;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//span[@class='profile-accountname']")
	private WebElement accountName;
	
	@FindBy(xpath = "//*[text()='arrow_drop_down']")
	private WebElement dropdownElement;
	
	@FindBy(xpath = "//*[@id='mat-input-0']")
	private WebElement searchBarOfAccountNames;
	
	@FindBy(xpath = "//h1[text()='remote download']")
	private WebElement rdTitle;
	
	@FindBy(xpath = "//span[text()='Remote Download']")
	private WebElement remoteDownloadTab;
	
	public String verifyAdminTolPage() {
		
		
		return eu.getTextFromElement(adminToolPageTitle, commonUtils.Explicit_Wait_Time);	
	}
	
	public String verifyWelcomtext() {
		
		return eu.getTextFromElement(welcomeTextStg, commonUtils.Explicit_Wait_Time);
	}
	
	public void accountNameField(String string) {
		
	
		eu.typeTextIntoElement(accountNmaeField, string, commonUtils.Explicit_Wait_Time);
	}
	
	public void emailIdField(String str) {
		
		eu.typeTextIntoElement(emailAddress, str, commonUtils.Explicit_Wait_Time);
	}
	
	public void userNameField(String string) {
		
		eu.typeTextIntoElement(userNameField, string, commonUtils.Explicit_Wait_Time);
	}
	
	public void passwordField(String string) {
		
		eu.typeTextIntoElement(passwordField, string, commonUtils.Explicit_Wait_Time);
	}
	
	public void  clickOnLoginButton() {
		
		eu.clickOnElement(loginButton, commonUtils.Explicit_Wait_Time);
		
		
	}
	
	public void clickOnContinueButton() {
		
		eu.clickOnElement(continueButton, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifyTitlePage() {
		
		return eu.getTextFromElement(remoteDownloadText, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifyAccountName() {
		
		
		return eu.getTextFromElement(accountName, commonUtils.Explicit_Wait_Time);
	}
	
	public void clickAccountId(String str) {
		
		if(!verifyAccountName().equals(str)) {
			
			dropdownElement.click();
		}
	}
	
	public void clickOnSearchBar() {
		
		eu.clickOnElement(searchBarOfAccountNames, commonUtils.Explicit_Wait_Time);
	}
	
	public void sendAccountNameinSearachBar(String str) {
		
		eu.typeTextIntoElement(searchBarOfAccountNames, str, commonUtils.Explicit_Wait_Time);
	}
	
	public void selectDesiredAccountName(String str1) {
		
		WebElement desiredAccountName =  driver.findElement(By.xpath("//button[@title='"+str1+"']"));
		eu.clickOnElement(desiredAccountName, commonUtils.Explicit_Wait_Time);
	}
	
	public String verifyRDTitleOfPage() {
		
		return eu.getTextFromElement(rdTitle, commonUtils.Explicit_Wait_Time);
	}
	
	public void clickOnRemoteDownloadPage() {
		
		eu.clickOnElement(remoteDownloadTab, commonUtils.Implicit_Wait_Time);
	}

	
	
}
