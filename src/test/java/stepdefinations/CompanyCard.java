package stepdefinations;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CompanycardPage;
import pages.HostManagementPage;

public class CompanyCard {

	public WebDriver driver;
	public CompanycardPage cc;
//	public HostManagementPage hm;
//	public Login lp;

	@Given("/^User navigates to the (.*) screen page by clicking on it$/")
	public void user_navigates_to_the_screen_page_by_clicking_on_it(String strArg1) throws Throwable {

		driver = DriverFactory.getDriver();
		Thread.sleep(3000);
		cc = new CompanycardPage(driver);

		cc.clickOnCompanycardTab();
		Assert.assertTrue(cc.verifyCompanycardTitle().contains(strArg1));

	}

	@When("/^User verify Host number (.*) under Host Computer coloum$/")
	public void user_verify_host_name_under_host_computer_coloum(String hostNumber) {

		Assert.assertTrue(cc.verifyHostComputerTitle().contains("Host Computer"));
		Assert.assertTrue(cc.verifyHostNumber(hostNumber).contains("OZD3423W"));
	}

	@When("User verify dropdown of Company or Account field in companycard")
	public void user_verify_dropdown_of_company_or_account_field_in_companycard() throws Throwable {

		Assert.assertTrue(cc.verifyCompanyAccountText().contains("Company/Account"));
		cc.verifyDropdownisClickable();
		cc.verifyAccountName();

	}

	@And("User verify search option is having {string} account in company card page")
	public void user_verify_search_option_is_having_something_account_in_company_card_page(String strArg1) {

		cc.sendTextINSearchField(strArg1);
		cc.selectAllAccounts();
	}

	@And("User verify client status in Host Management screen in company card page")
	public void user_verify_client_status_in_host_management_screen_in_company_card_page() {

		Assert.assertTrue(cc.verifyClientStatusText().contains("Status"));
		ArrayList<String> values = cc.selectClientSatusDropdown();
		Assert.assertTrue(values.contains("All"));
		Assert.assertTrue(values.contains("Online"));
		Assert.assertTrue(values.contains("Offline"));
		cc.clikOperation();
	}

	@When("User verify the name of the auto sync in Company card page")
	public void user_verify_the_name_of_the_auto_sync_in_company_card_page() throws Throwable {

		Assert.assertTrue(cc.verifyAutoSyncTitle().contains("auto sync"));
	}

	@Then("User needs to check the toggle bar status in Company card page")
	public void user_needs_to_check_the_toggle_bar_status_in_company_card_page() throws Throwable {

		cc.verifyTooglebar();
	}

	@And("User needs to check the icon sync status in Company card page")
	public void user_needs_to_check_the_icon_sync_status_in_company_card_page() throws Throwable {

		cc.verifyIconSync();
	}

	@When("User verify the Header of the page in Company card page")
	public void user_verify_the_header_of_the_page_in_company_card_page() throws Throwable {

		cc.verifyHeaderOfHostManagemnetScreen();
	}

	@Then("User verify the Header items are present in Company card page")
	public void user_verify_the_header_items_are_present_in_company_card_page() throws Throwable {

		ArrayList<String> values = cc.headerListOfTheHostManagementScreen();
		Assert.assertTrue(values.contains("Company/Account"));
		Assert.assertTrue(values.contains("Card Location"));
		Assert.assertTrue(values.contains("Card Number"));
		Assert.assertTrue(values.contains("Serial Number"));
		Assert.assertTrue(values.contains("Member State"));
		Assert.assertTrue(values.contains("Expiry Date"));
		Assert.assertTrue(values.contains("Host Computer"));
		Assert.assertTrue(values.contains("Status"));
		Assert.assertTrue(values.contains("Link To"));
	}

	@And("User verify the data present in the table of Company card page")
	public void user_verify_the_data_present_in_the_table_of_company_card_page() throws Throwable {

		cc.verifyDataPresentInTheTable();
	}

	@When("User verify the delete icon is disbaled at initial point")
	public void user_verify_the_delete_icon_is_disbaled_at_initial_point() throws Throwable {

		cc.verifyDeleteIConISDisabled();
	}

	@Then("User clicks on account name and delete icon gets enabled")
	public void user_clicks_on_account_name_and_delete_icon_gets_enabled() throws Throwable {

		cc.verifyDeleteIconIsEnabled();
	}

	@And("User needs to verify when user navigates from one page to another page delete icon should be disabled")
	public void user_needs_to_verify_when_user_navigates_from_one_page_to_another_page_delete_icon_should_be_disabled()
			throws Throwable {

		cc.navigateToDiffrentPageAndVerifyDeleteICon();
	}

	@When("User verify the CSVfile icon is present in the company card page")
	public void user_verify_the_csvfile_icon_is_present_in_the_company_card_page() throws Throwable {

		cc.clickOnCompanyCardCSVIcon();
	}

	@Then("User verify file is getting downloaded with {string} and {string} timeout with {string} should present in company card page")
	public void user_verify_file_is_getting_downloaded_with_something_and_something_timeout_with_something_should_present_in_company_card_page(
			String strArg1, String strArg2, String strArg3) throws Throwable {

		Assert.assertTrue(cc.verifyCOMpanycRdCSVFileDownloaded(strArg1, strArg2, strArg3));
	}

	@And("User verify when there is an empty record then file should not get downlaod in the company card page")
	public void user_verify_when_there_is_an_empty_record_then_file_should_not_get_downlaod_in_the_company_card_page()
			throws Throwable {

		cc.verifyWhenCSVdoesnotHaveanyData();

	}

	@When("User verify the PDFfile icon is present in the company card page")
	public void user_verify_the_pdffile_icon_is_present_in_the_company_card_page() throws Throwable {

		cc.clickOnCompanyCardPDFIcon();
	}

	@Then("User verify file is getting downloaded with {string} and {string} timeout with {string} should present in company card pages")
	public void user_verify_file_is_getting_downloaded_with_something_and_something_timeout_with_something_should_present_in_company_card_pages(
			String strArg1, String strArg2, String strArg3) throws Throwable {

		Assert.assertTrue(cc.verifyCOMpanycRdPDFFileDownloaded(strArg1, strArg2, strArg3));
	}

	@And("/^User needs to verify the count of sites and vehicle present under (.*)$/")
	public void user_needs_to_very_count_of_sites_and_vehicle_present_under(String str) {

		cc.getSiteCount(str);
		cc.getVehicleCount(str);
	}

	@When("/^User needs to click on the (.*) button to add site or vehicle$/")
	public void user_needs_to_click_on_the_button_to_add_site_or_vehicle(String str) {

		cc.clickOnSiteOrVehicleButton(str);

	}

	@Then("/^User needs to assign new vehicle (.*) and site$/")
	public void user_needs_to_assign_new_vehicle_and_site(String str) {

		cc.verifyRadioButtonINCompanyCardPage();
		cc.verifySearchButtonIcon(str);
		cc.verifyVehiclePresent(str);
	}

	@And("/^User needs to verify sites and Vehicles are under (.*)$/")
	public void user_needs_to_verify_sites_and_vehicles_are_under(String str) throws InterruptedException {

		Assert.assertTrue(cc.verifyCompanyCardNumber(str).contains("" + str + ""));
		cc.verifyPlaceholderOfAllvehicles();
		cc.verifyDropDownArraw();
		cc.verifyAlignmentArraw();
		cc.verifyCancelButton();
		cc.verifyAllSitesPalceHolder();
		Assert.assertTrue(cc.verifyHeaderOfAssociatedSitesOrVehicle().contains("Associated Sites / Vehicles"));
		cc.verifyRightArrawButton();
		cc.verifySaveButton();
		Assert.assertTrue(
				cc.verifySuccessMessage().contains("Association/un-association of the company card is successful"));

	}

	@Then("/^User needs to navigate back and verify added vehcile or site reflects for the perticular (.*)$/")
	public void user_needs_to_navigate_back_and_verify_added_vehcile_or_site_reflects_for_the_perticular(String str) {

		Assert.assertTrue(cc.verifyVehicleCountIncrease(str) > 0);

	}

	@And("User needs to assign back sites and Vehicles are under")
	public void user_needs_to_assign_back_sites_and_vehicles_are_under() {

		cc.verifyLeftArrawButton();
		cc.verifySaveButton();
		cc.verifyClickOnYesButton();
		Assert.assertTrue(
				cc.verifySuccessMessage().contains("Association/un-association of the company card is successful"));

	}

	@And("User needs to verify the delete icon")
	public void user_needs_to_verify_the_delete_icon() {

		cc.verifyDeleteIcon();
	}
	
	@And("User needs to verify the refresh icon")
	public void user_needs_to_verify_the_refresh_icon() {

		cc.verifySyncIcon();
	}
	
	@And("/^User needs to verify the pagenation (.*)$/")
	public void user_needs_to_verify_the_pagenation(String str) {
		
		Assert.assertTrue(cc.verifypaginationTitle().contains("Items per page"));
		Assert.assertTrue(cc.verifyPaginationDropdownButton().contains(str));
		cc.verifyPaginationDropdownButtonArrow();
		ArrayList<String> values1 =cc.verifyElementsInPagination();
		Assert.assertTrue(values1.contains("5"));
		Assert.assertTrue(values1.contains("10"));
		Assert.assertTrue(values1.contains("15"));
		Assert.assertTrue(values1.contains("30"));
		Assert.assertTrue(values1.contains("50"));
		Assert.assertTrue(values1.contains("100"));
		
	}
	
	@And("User needs to verify the CompanyCard Status")
	public void user_needs_to_verify_the_companyCard_status() {
		
		Assert.assertTrue(cc.verifyStatusTitle().contains("Status"));
		
	}
	
	
	
	@And("User needs to verify the filter dropdown")
	public void user_needs_to_verify_the_filter_dropdown() {
		ArrayList<String> val =  cc.verifyCompanyPageStatusDropdownButton();
		Assert.assertTrue(val.contains("All"));
		Assert.assertTrue(val.contains("Online"));
		Assert.assertTrue(val.contains("Offline"));
		
	}
	
	@And("User needs to verify thew filter present in all colums")
	public void user_needs_to_verify_thew_filter_present_in_all_colums() {
		
		cc.verifySortingFilter();
	}
	
	@And("/^User needs to verify the search field by passing the (.*)$/")
	public void user_needs_to_verify_the_search_field_by_passing_the(String str) {
		
		cc.verifySearchFieldIsPresent();
		cc.verifyTextEnteredInSearchField(str);
	}
	
	@And("User needs to verify the Company or Account namedropdown fields")
	public void user_needs_to_verify_the_company_or_account_namedropdown_fields() {
		
		Assert.assertTrue(cc.verifyAccountOrCompanyPlaceholderName().contains("Company/Account"));
		cc.veridyDropdownFilterOfAccountCompanyName();
	}
	
	@And("User needs to verify the status of the company card")
	public void user_needs_to_verify_the_status_of_the_company_card(){
		
		Assert.assertTrue(cc.getStatusFieldText().contains("Status"));
		
	}

}
