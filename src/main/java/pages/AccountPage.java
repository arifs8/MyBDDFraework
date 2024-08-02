package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.ElementsUtils;
import utils.commonUtils;

public class AccountPage {

	WebDriver driver;
	private ElementsUtils eu;

	public AccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement accountInformation;

	public boolean verifyAccountVerification() {
		//Alert sim = driver.switchTo().alert();
		return eu.displayStatusofElement(accountInformation, commonUtils.Explicit_Wait_Time);
		// return accountInformation.isDisplayed();
		

	}


}
