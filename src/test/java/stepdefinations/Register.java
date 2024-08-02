package stepdefinations;

import java.util.Date;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountSuccessPage;
import pages.HomePage;
import pages.RegisterPage;
import utils.commonUtils;

public class Register {

	WebDriver driver;
	private RegisterPage rp;
	private AccountSuccessPage as;
	

	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		
		driver = DriverFactory.getDriver();
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		rp = hp.clicksOnMyRegistrationPage();
		
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		rp.verifyFirstNameField(dataMap.get("firstName"));
		rp.verifyLastNameField(dataMap.get("lastName"));
		rp.verifyEmailField(commonUtils.getEmailWithTimeStamp());
		rp.verifyTelephoneField(dataMap.get("telephone"));
		rp.verifypasswordField(dataMap.get("password"));
		rp.verifyConfirmPasswordField(dataMap.get("password"));
	
	}
	
	@When("User enters the details into below fields with duplicate email")
	public void user_enters_the_details_into_below_fields_with_duplicate_email(DataTable dataTable) {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		rp.verifyFirstNameField(dataMap.get("firstName"));
		rp.verifyLastNameField(dataMap.get("lastName"));
		rp.verifyEmailField(dataMap.get("email"));
		rp.verifyTelephoneField(dataMap.get("telephone"));
		rp.verifypasswordField(dataMap.get("password"));
		rp.verifyConfirmPasswordField(dataMap.get("password"));
	}

	@And("User selects Privacy Policy")
	public void user_selects_privacy_policy() {

		rp.clickPrivacyPolicyCheckbox();
	}

	@And("User clicks n Continue button")
	public void user_clicks_n_continue_button() throws InterruptedException {

		
		as= rp.clickContinueButton();
		
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {

		Assert.assertEquals("Your Account Has Been Created!",as.verifyPageHeading());
	}

	@And("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
	    rp.selectYesButton();
		
	}

	@When("User dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() throws InterruptedException {

		rp.verifyFirstNameField("");
		rp.verifyLastNameField("");
		rp.verifyEmailField("");
		rp.verifyTelephoneField("");
		rp.verifypasswordField("");
		rp.verifyConfirmPasswordField("");
		
		
	}

	@Then("User should get proper warning messages for every mandatory field")
	public void user_should_get_proper_warning_messages_for_every_mandatory_field() throws InterruptedException {

		Assert.assertTrue(rp.getFirstNameWarning().contains("First Name must be between 1 and 32 characters!"));
		Assert.assertTrue(rp.getLastNameWarning().contains("Last Name must be between 1 and 32 characters!"));
		Assert.assertTrue(rp.getEmailWarning().contains("E-Mail Address does not appear to be valid!"));
		Assert.assertTrue(rp.getTelephoneWarning().contains("Telephone must be between 3 and 32 characters!"));
		Assert.assertTrue(rp.getPasswordWarning().contains("Password must be between 4 and 20 characters!"));
		Assert.assertTrue(rp.getWarningMessageText().contains("Warning: You must agree to the Privacy Policy!"));
		
	}

	@Then("User account should get a proper warning about duplicate email")
	public void user_account_should_get_a_proper_warning_about_duplicate_email() throws InterruptedException {
		

		Assert.assertEquals("Warning: E-Mail Address is already registered!",
				rp.getWarningMessageText());

	}

	

}
