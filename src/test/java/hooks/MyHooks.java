package hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.commonUtils;

public class MyHooks {

	public static WebDriver driver;

	@Before
	public void setup() throws IOException, InterruptedException {

		Properties prop = ConfigReader.initializePrperties();
		// driver = df.initializeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(commonUtils.Pageload_Wait_Time));
		

	}

	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		//driver.quit();
	}

	@AfterStep
	public void Addscreenshot(Scenario scenario) throws InterruptedException {

		String scenarioName = scenario.getName().replace(" ", "_");

		if (scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);

		}

		// driver.quit();
	}
}
