package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementsUtils;
import utils.commonUtils;

public class AccountSuccessPage {

	WebDriver driver;
	private ElementsUtils eu;

	public AccountSuccessPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		eu = new ElementsUtils(driver);
	}

	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement pageHeading;
	
	@FindBy(xpath = "//*[contains(text(),'Company cards')]")
	private WebElement companyCardtab;

	public String verifyPageHeading() {
		return eu.getTextFromElement(pageHeading, commonUtils.Explicit_Wait_Time);
		// return pageHeading.getText();
	}

	
}
