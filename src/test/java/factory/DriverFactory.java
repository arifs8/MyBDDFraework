package factory;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;
import utils.commonUtils;

public class DriverFactory {

	public static  WebDriver driver;

	public static  WebDriver initializeBrowser(String browser) throws IOException {


		
		// properties class
				Properties prop = new Properties();
				FileInputStream fis = new FileInputStream(
						
						System.getProperty("user.dir") + "//src//test//resources//config//config.properties");
				prop.load(fis);
				if(driver == null) {

				String browserName = System.getProperty("browser") != null ? System.getProperty("browser")
						: prop.getProperty("browser");

				if (browserName.equalsIgnoreCase("chrome")) {
					
					
//					//ChromeOptions options = new ChromeOptions();
//					HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//				//	chromePrefs.put("profile.default_content_settings.popups", 0);
//				//	chromePrefs.put("download.default_directory", System.getProperty("user.dir")+File.separator + "downloads");
//					ChromeOptions options = new ChromeOptions();
//					options.setExperimentalOption("prefs", chromePrefs);
//					options.setExperimentalOption("prefs", chromePrefs);
//					options.addArguments("--remote-allow-origins=*");
//					WebDriverManager.chromedriver().setup();

//					if (browserName.contains("headless")) {
//						options.addArguments("headless");
//					}
					driver = new ChromeDriver();
					driver.get(prop.getProperty("stg"));
					
					

					driver.manage().deleteAllCookies();
					driver.manage().window().maximize();
					driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(commonUtils.Pageload_Wait_Time));
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(commonUtils.Implicit_Wait_Time));
					// driver.manage().window().setSize(new Dimension(1400,900));

				} else if (browserName.equalsIgnoreCase("firefox")) {
					//WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				} else if (browserName.equalsIgnoreCase("edge")) {
					//WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();

				}
			}


		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
