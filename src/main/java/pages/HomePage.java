package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementsUtils eu;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	    eu = new ElementsUtils(driver);
	}
	
	@FindBy(xpath ="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	@FindBy(xpath = "(//a[contains(text(),'Register')])[1]")
	private WebElement registerButton;
	
	@FindBy(xpath = "//input[contains(@name,'search')]")
	private WebElement searchBoxField;
	
	@FindBy(xpath = "//span[contains(@class,'input-group-btn')]")
	private WebElement searchIcon;
	
	
	public void clickOnMyAccount() {
		
		eu.clickOnElement(myAccountDropMenu, commonUtils.Explicit_Wait_Time);
	
	}
	
	public LoginPage clickOnMyLoginOption() {
		
		eu.clickOnElement(loginOption, commonUtils.Explicit_Wait_Time);
		return new LoginPage(driver);
	}

	public RegisterPage clicksOnMyRegistrationPage() {
		
		eu.clickOnElement(registerButton, commonUtils.Explicit_Wait_Time);
		//registerButton.click();
		return new RegisterPage(driver);
	}
	
	public void enterSearchField(String validProductText) {
		//searchBoxField.sendKeys(validProductText);
		eu.typeTextIntoElement(searchBoxField, validProductText, commonUtils.Explicit_Wait_Time);
	}
	
	public SearchResultPage clicksOnSearchIcon() {
		//searchIcon.click();
		eu.clickOnElement(searchIcon, commonUtils.Explicit_Wait_Time);
		return new SearchResultPage(driver);
	}
}
