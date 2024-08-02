package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractTestClass {

	 WebDriver driver;

	public AbstractTestClass(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public abstract void click(By locator);
    public abstract void typeText(By locator, String text);
    public abstract boolean isElementPresent(By locator);

}
