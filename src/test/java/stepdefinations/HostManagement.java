package stepdefinations;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CompanycardPage;
import pages.HostManagementPage;
import pages.VDOLoginPage;

public class HostManagement {

	WebDriver driver;
	private HostManagementPage hm;
	// private VDOLoginPage vd;

	@Given("User navigates to the Host Managemnet screen page")
	public void user_navigates_to_the_Host_Managemnet_screen_page() {

		driver = DriverFactory.getDriver();

		hm = new HostManagementPage(driver);

		System.out.println(hm.verifyHostTitle());

	}

	@When("User verify dropdown of Company or Account field")
	public void user_verify_dropdown_of_Company_or_Account_field() {
		//hm = new HostManagementPage(driver);
		Assert.assertTrue(hm.verifyCompanyAccountText().contains("Company/Account"));
		hm.verifyDropdownisClickable();
		hm.verifyAccountName();

	}

	@And("User verify search option is havin {string} account")
	public void user_verify_search_option_is_havin_account(String accountname) {

		hm.sendTextINSearchField(accountname);
		hm.selectAllAccounts();
		Assert.fail();

	}

	@And("User verify client status in Host Management screen")
	public void user_verify_client_status_in_Host_Management_screen() {

		Assert.assertTrue(hm.verifyClientStatusText().contains("Client status"));
		ArrayList<String> values = hm.selectClientSatusDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("Online"));
		Assert.assertTrue(values.contains("Offline"));
	}

	@And("User verify Version title in Hast Management screen")
	public void user_verify_Version_title_in_Hast_Management_screen() {

		hm.clikOperation();
		Assert.assertTrue(hm.verifyVersionTitle().contains("Version"));
		ArrayList<String> values = hm.selectVersionDropdown();
		Assert.assertTrue(values.contains("1.19.1.SNAPSHOT"));
		Assert.assertTrue(values.contains("2.0.14"));

	}

	@And("User verify service title in Host Management screen")
	public void user_verify_service_title_in_Host_Management_screen() {

		hm.clikOperation();
		Assert.assertTrue(hm.verifyServiceTitle().contains("Service"));
		ArrayList<String> values = hm.selectServiceDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("AC client"));
		Assert.assertTrue(values.contains("DC client"));
		hm.clikOperation();
	}

	@When("User verify the name of the auto sync")
	public void user_verify_the_name_of_the_auto_sync() {

		Assert.assertTrue(hm.verifyAutoSyncTitle().contains("auto sync"));
	}

	@Then("User needs to check the toggle bar status")
	public void user_needs_to_check_the_toggle_bar_status() {

		hm.verifyTooglebar();
	}

	@And("User needs to check the icon sync status")
	public void user_needs_to_check_the_icon_sync_status() {

		hm.verifyIconSync();
	}

	@When("User verify the AC Client installer present")
	public void user_verify_the_AC_Client_installer_present() {

		Assert.assertTrue(hm.verifyAcClientinstallerTitle().contains("AC INSTALLER"));
	}

	@Then("User verify the AC Client version {string} is present")
	public void user_verify_the_ac_client_version_something_is_present(String strArg1) throws Throwable {

		Assert.assertTrue(hm.verifyVersionOfAcClient().contains(strArg1));
	}

	@And("User verify the DC Client installer present")
	public void user_verify_the_DC_Client_installer_present() {

		Assert.assertTrue(hm.verifyDcClientinstallerTitle().contains("DC INSTALLER"));
	}

	@And("User verify DC Client version {string} is present")
	public void user_verify_dc_client_version_something_is_present(String strArg1) throws Throwable {

		Assert.assertTrue(hm.verifyVersionOfDcClient().contains(strArg1));
	}

	@When("^User verify the Header of the page$")
	public void user_verify_the_header_of_the_page() throws Throwable {

		hm.verifyHeaderOfHostManagemnetScreen();
	}

	@Then("^User verify the Header items are present$")
	public void user_verify_the_header_items_are_present() throws Throwable {

		ArrayList<String> values = hm.headerListOfTheHostManagementScreen();
		Assert.assertTrue(values.contains("Company/Account"));
		Assert.assertTrue(values.contains("Service"));
		Assert.assertTrue(values.contains("Host computer"));
		Assert.assertTrue(values.contains("Version"));
		Assert.assertTrue(values.contains("Last connection"));
		Assert.assertTrue(values.contains("Client status"));
	}

	@And("^User verify the data present in the table$")
	public void user_verify_the_data_present_in_the_table() throws Throwable {
		hm.verifyDataPresentInTheTable();
	}

	@When("^User verify the CSVfile icon is present in the page$")
	public void user_verify_the_csvfile_icon_is_present_in_the_page() throws Throwable {

		hm.clickHostMangementCSVIcon();
	}

	@Then("User verify file is getting downloaded with {string} and {string} timeout with {string} should present")
	public void user_verify_file_is_getting_downloaded_with_something_and_something_timeout_with_something_should_present(
			String strArg1, String strArg2, String strArg3) throws Throwable {

		Assert.assertTrue(hm.verifyFileDownloaded(strArg1, strArg2, strArg3));
	}

	@And("^User verify when there is an empty record then file should not get downlaod$")
	public void user_verify_when_there_is_an_empty_record_then_file_should_not_get_downlaod() throws Throwable {

		hm.clickHostMangementCSVIcon();
		Assert.assertTrue(hm.verifyEmptyFileToDownload().contains("This file contains no data"));
	}

	@When("^User verify search functionality is working properly$")
	public void user_verify_search_functionality_is_working_properly() throws Throwable {

		hm.verifySearchInconInHostmangementScreen();
	}

	@Then("User verify by passing the value {string} into the search field")
	public void user_verify_by_passing_the_value_into_the_search_field(String strArg1) throws Throwable {

		hm.verifyPassinTextInSearchFields(strArg1);
		hm.verifyDataPresentInTheTable();
	}
	
	@When("^User verify the PDFfile icon is present in the page$")
	public void user_verify_the_pdffile_icon_is_present_in_the_page() throws Throwable {

		hm.clickHostMangementCSVIcon();
	}
}
