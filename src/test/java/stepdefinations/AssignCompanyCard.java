package stepdefinations;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AssignCompanyCardPage;

public class AssignCompanyCard {

	WebDriver driver;
	private AssignCompanyCardPage acp;

	@Given("User navigates to the {string} screen page by clicking")
	public void user_navigates_to_the_screen_page_by_clicking(String strArg1) throws Throwable {

		driver = DriverFactory.getDriver();
		acp = new AssignCompanyCardPage(driver);
		acp.clickOnCompanyCardPage();
		// acp.clickOnCompanycardTabOn();
		Assert.assertTrue(acp.verifyCompanycardTitleOn().contains(strArg1));

	}

	@When("User navigates to the {string} screen page by clicking on it in Hostmanagemnet Screen")
	public void user_navigates_to_the_screen_page_by_clicking_on_it_in_Hostmanagemnet_Screen(String strArg1)
			throws Throwable {

		//driver = DriverFactory.getDriver();
		acp = new AssignCompanyCardPage(driver);
		Assert.assertTrue(acp.verifyAssignCompanyCardTitle().contains(strArg1));
		

	}

	@Then("User navigate to CompanyCard page by clicking on Assign Company Card button")
	public void user_navigate_to_companycard_page_by_clicking_on_assign_company_card_button() throws Throwable {

		acp.clickOnCompanycardTabOn();
	}

	@And("User needs to verify the title {string} in the page")
	public void user_needs_to_verify_the_title_something_in_the_page(String strArg1) throws Throwable {

		Assert.assertTrue(acp.verifyCompanyCardAssignmentPage().contains(strArg1));
	}

	@And("User verify company list title {string} in the page")
	public void user_verify_company_list_title_in_the_page(String strArg1) throws Throwable {

		Assert.assertTrue(acp.verifyCompanyListTile().contains(strArg1));
	}

	@And("User verify there is a search field")
	public void user_verify_there_is_a_search_field() throws Throwable {

		Assert.assertTrue(acp.verifySearchIcon());
	}

	@And("User verify sorting option to be present")
	public void user_verify_sorting_option_to_be_present() throws Throwable {

		Assert.assertTrue(acp.verifySortingIcon());
	}

	@And("User verify list of the Account names")
	public void user_verify_list_of_the_account_names() throws Throwable {

		ArrayList<String> values = acp.verifyListOfTheCompanies();
	}

	@And("User send {string} in the search field")
	public void user_send_something_in_the_search_field(String strArg1) throws Throwable {

		acp.sendCompanyNameintoSearchField(strArg1);
	}

	@And("User verify the company name {string} is listed")
	public void user_verify_the_company_name_something_is_listed(String strArg1) throws Throwable {

		Assert.assertTrue(acp.verifylistedCompanieName().contains(strArg1));
	}

	@And("User verify title as {string} and checkbox present in the available card")
	public void user_verify_title_as_something_and_checkbox_present_in_the_available_card(String strArg1)
			throws Throwable {

		Assert.assertTrue(acp.verifyAvilableCardsTitle().contains(strArg1));
	}

	@And("User verify checkbox present on assigned cards")
	public void user_verify_checkbox_present_on_assigned_cards() throws Throwable {

		Assert.assertTrue(acp.verifyCheckboxOfAvailableCards());
	}

	@And("User verify by clicking on any account {string} show cards assigned")
	public void user_verify_by_clicking_on_any_account_something_show_cards_assigned(String strArg1) throws Throwable {

		Assert.assertTrue(acp.verifyCardsAssignedTitle().contains(strArg1));
		acp.verifyCardsAvailableUnderTheCompanies();
	}

	@And("User select an account by clicking on checkbox")
	public void user_select_an_account_by_clicking_on_checkbox() throws Throwable {

		acp.selectAssignedCardFromAccount();
	}

	@And("User verify arrrow is enable")
	public void user_verify_arrrow_is_enable() throws Throwable {

		acp.selectLeftArrow();
	}

	@And("User select a companie card from available cards")
	public void user_select_a_companie_card_from_available_cards() throws Throwable {

		acp.selectAssignedCardFromAccount();
	}

	@And("User verify right arrow is enable")
	public void user_verify_right_arrow_is_enable() throws Throwable {

		acp.selectRightArrow();
	}

	@And("User verify SAVE button is disbaled")
	public void user_verify_save_button_is_disbaled() throws Throwable {

		Assert.assertTrue(acp.verifySaveButtonisDisbaled());
	}

	@And("User verify SAVE button is enabled")
	public void user_verify_save_button_is_enabled() throws Throwable {

		Assert.assertTrue(acp.verifySaveButtonisEnabled());
	}

	@And("User verify CANCEL button is clickable")
	public void user_verify_cancel_button_is_clickable() throws Throwable {

		acp.verifyCancelButton();
		acp.clickCancelBUtton();
	}

	@And("User verify after clicking cancel button popup title {string}")
	public void user_verify_after_clicking_cancel_button_popup_title_something(String strArg1) throws Throwable {

		Assert.assertTrue(acp.verifyPopupTitle().contains(strArg1));
	}

	@And("User verify cancel popup has yes and no options")
	public void user_verify_cancel_popup_has_yes_and_no_options() throws Throwable {

		Assert.assertTrue(acp.verifyNoOptionInPopup());
		Assert.assertTrue(acp.verifyYEsOptionInPopup());
	}

	@And("User click on No option stay in current page {string}")
	public void user_click_on_no_option_stay_in_current_page_something(String strArg1) throws Throwable {

		acp.clickOnNoOption();
		Assert.assertTrue(acp.verifyCompanyCardAssignmentPage().contains(strArg1));
	}

	@And("User click on Yes option comes to {string} page")
	public void user_click_on_yes_option_comes_to_something_page(String strArg1) throws Throwable {
		acp.clickOnYesOption();
		Assert.assertTrue(acp.verifyRemoetDownloadTitle().contains(strArg1));
	}

}
