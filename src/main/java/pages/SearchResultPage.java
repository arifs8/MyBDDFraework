package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.tr.Fakat;
import utils.AbstractTestClass;
import utils.ElementsUtils;
import utils.commonUtils;

public class SearchResultPage extends AbstractTestClass{

	public SearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void click(By locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void typeText(By locator, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isElementPresent(By locator) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
//	WebDriver driver;
//	private ElementsUtils eu;
//	
//	public SearchResultPage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		eu = new ElementsUtils(driver);
//	}
	
//	@FindBy(xpath = "//a[text()='HP LP3065']")
//	private WebElement productDisplay;
//	
//	@FindBy(xpath = "//input[@id='button-search']//following-sibling::p")
//	private WebElement messageText;
//	
//	
//	public boolean verifyProductDisplayed() {
//		return eu.displayStatusofElement(productDisplay, commonUtils.Explicit_Wait_Time);
//		//return productDisplay.isDisplayed();
//	}
//	
//	public String getMessageText() {
//		return eu.getTextFromElement(messageText, commonUtils.Explicit_Wait_Time);
//		//return messageText.getText();
//	}

}
