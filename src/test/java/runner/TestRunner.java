package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
				"src/test/resources/features/2CompanyCard.feature"
				},
		
		//Sticklets
		glue = { "stepdefinations", "hooks" },
		publish=true,
		plugin={ "pretty" , 
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/JSONReports/Cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"
				}
			
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel =  false)
	public Object[][] scenarios() {

return super.scenarios();
		
		
	}
}
 