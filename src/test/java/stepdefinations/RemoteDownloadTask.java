package stepdefinations;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RemoteDownloadSettingPage;
import pages.RemoteDownloadTaskPage;

public class RemoteDownloadTask {

	WebDriver driver;
	private RemoteDownloadTaskPage rtp;

	@Given("User navigates to {string} page by clicking on it")
	public void user_navigates_to_something_page_by_clicking_on_it(String strArg1) throws Throwable {

		driver = DriverFactory.getDriver();
		rtp = new RemoteDownloadTaskPage(driver);
		rtp.clickRemoteDownloadTaskTab();
		Assert.assertTrue(rtp.getRemoteDownloadTaskTitle().contains(strArg1));
	}

	@When("User verify dropdown of {string} field")
	public void user_verify_dropdown_of_something_field(String strArg1) throws Throwable {

		Assert.assertTrue(rtp.verifyCompanyAccountText().contains("Company/Account"));
		rtp.verifyDropdownisClickable();

	}

	@Then("User verify search option is having {string} account")
	public void user_verify_search_option_is_having_something_account(String strArg1) throws Throwable {

		rtp.verifyAccountName();
	}

	@And("User verify search field under company or account")
	public void user_verify_search_field_under_company_or_account() throws Throwable {

		rtp.clikOperation();
		rtp.verifyDropdownisClickable();
		ArrayList<String> values = rtp.selectClientSatusDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("d-gl"));
		Assert.assertTrue(values.contains("rtmdemo"));
		Assert.assertTrue(values.contains("dmmdemo"));
		Assert.assertTrue(values.contains("DK1ThistedEntreprenoerforretniDK0036"));
		Assert.assertTrue(values.contains("TestRD"));
	}

	@And("User verify there is a scroll bar")
	public void user_verify_there_is_a_scroll_bar() throws Throwable {

		rtp.clikOperation();
		rtp.verifyDropdownisClickable();
		Assert.assertTrue(rtp.verifyScrollbar());
		rtp.clikOperation();
	}

	@When("User verify dropdown of {string} field in the page")
	public void user_verify_dropdown_of_something_field_in_the_page(String strArg1) throws Throwable {

		Assert.assertTrue(rtp.getRemoteDownloadSattusDropdownTitle().contains(strArg1));
	}

	@Then("User verify select {string} by default")
	public void user_verify_select_something_by_default(String strArg1) throws Throwable {

		rtp.clikOperation();
		rtp.verifyStatusDropdownisClickable();
		ArrayList<String> values = rtp.selectStatusDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("Planned"));
		Assert.assertTrue(values.contains("In Progress"));
		Assert.assertTrue(values.contains("Success"));
		Assert.assertTrue(values.contains("Failed"));
		Assert.assertTrue(values.contains("canceled"));
		Assert.assertTrue(values.contains("Overdue"));
	}

	@And("User verify by chnaging to Planned")
	public void user_verify_by_chnaging_to_planned() throws Throwable {

		rtp.clikOperation();
		rtp.verifyStatusDropdownisClickable();
		rtp.selectPlannedElement();
		rtp.clikOperation();
	}

	@When("User verify dropdown of {string} field the page")
	public void user_verify_dropdown_of_something_field_the_page(String strArg1) throws Throwable {

		Assert.assertTrue(rtp.getRemoteDownloadFileTypeDropdownTitle().contains(strArg1));
	}

	@Then("User verify select {string} by default in page")
	public void user_verify_select_something_by_default_in_page(String strArg1) throws Throwable {

		rtp.clikOperation();
		rtp.verifyFileTypeDropdownisClickable();
		ArrayList<String> values = rtp.selectFileTypeDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("VU"));
		Assert.assertTrue(values.contains("DC"));
		Assert.assertTrue(values.contains("VDO"));
		
	}
	
	@When("User verify dropdown of {string} in the page field")
    public void user_verify_dropdown_of_something_in_the_page_field(String strArg1) throws Throwable {
        
		Assert.assertTrue(rtp.getRemoteDownloadDeviceDropdownTitle().contains(strArg1));
    }

    @Then("User verify select {string} by default in the page field")
    public void user_verify_select_something_by_default_in_the_page_field(String strArg1) throws Throwable {
        
    	rtp.clikOperation();
    	rtp.verifyDeviceTypeDropdownisClickable();
    	ArrayList<String> values = rtp.selectDeviceTypeDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("VDO-LINK"));
		Assert.assertTrue(values.contains("Remote DL 4G"));
		
    }

    @When("User verify the name of the auto sync in Remote Download Task")
    public void user_verify_the_name_of_the_auto_sync_in_remote_download_task() throws Throwable {
       
    	Assert.assertTrue(rtp.verifyAutoSyncTitle().contains("auto sync"));
    }

    @Then("User needs to check the toggle bar status in Remote Download Task")
    public void user_needs_to_check_the_toggle_bar_status_in_remote_download_task() throws Throwable {
        
    	rtp.verifyTooglebar();
    }

    @And("User needs to check the icon sync status in Remote Download Task")
    public void user_needs_to_check_the_icon_sync_status_in_remote_download_task() throws Throwable {
        
    	rtp.verifyIconSync();
    }
    
    @When("User verify the Header of the page in Remote Download Task")
    public void user_verify_the_header_of_the_page_in_remote_download_task() throws Throwable {
        
    	rtp.verifyHeaderOfremoteDownlaodTaskScreen();
    }

    @Then("User verify the Header items are present in Remote Download Task")
    public void user_verify_the_header_items_are_present_in_remote_download_task() throws Throwable {
        
    	ArrayList<String> values = rtp.headerListOfTheRemoteDownloadTaskScreen();
		Assert.assertTrue(values.contains("VRN / Driver"));
		Assert.assertTrue(values.contains("Company / Account"));
		Assert.assertTrue(values.contains("Company card Number"));
		Assert.assertTrue(values.contains("Host Name"));
		Assert.assertTrue(values.contains("Auth Type"));
		Assert.assertTrue(values.contains("Device"));
		Assert.assertTrue(values.contains("Download Due"));
		Assert.assertTrue(values.contains("Last updated"));
		Assert.assertTrue(values.contains("Authentication"));
		Assert.assertTrue(values.contains("File Download"));
		Assert.assertTrue(values.contains("Details"));
    }

    @And("User verify the data present in the table in Remote Download Task")
    public void user_verify_the_data_present_in_the_table_in_remote_download_task() throws Throwable {
        
    	rtp.verifyDataPresentInTheRDTaskTable();
    }
}
