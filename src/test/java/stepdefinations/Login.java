package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.CompanycardPage;
import pages.HomePage;
import pages.LoginPage;

import pages.VDOLoginPage;
import utils.commonUtils;

public class Login {

	public WebDriver driver;
	public LoginPage lp;
	public AccountPage ap;
	public VDOLoginPage vp;
	public HostManagement hms;
	public CompanycardPage cc;

//	@Given("User navigates to login page")
//	public void User_navigates_to_login_page() {
//
//		driver = DriverFactory.getDriver();
//		cc = new CompanycardPage(driver);
//		HomePage hp = new HomePage(driver);
//		hp.clickOnMyAccount();
//		lp = hp.clickOnMyLoginOption();
//
//	}

	@Given("User navigates to the Remore Downlaod login page")
	public void user_navigates_to_the_Remore_Downlaod_login_page() {

		driver = DriverFactory.getDriver();

		vp = new VDOLoginPage(driver);
		Assert.assertTrue(vp.verifyWelcomtext().contains("Welcome"));

	}

	@When("User has entered valid email id {string} into account field")
	public void user_has_entered_valid_email_id_syed_arif_continental_corporation_com_into_account_field(
			String accountname) {

		vp.emailIdField(accountname);

	}

	@Then("User clicks on continue button")
	public void user_clicks_on_continue_button() {

		vp.clickOnContinueButton();
	}

	@And("User has entered valid rdusername (.+) into username field")
	public void user_has_entered_valid_rdusername_into_username_field(String username) {

		vp.userNameField(username);
	}

	@And("User has entered valid password {string} into password field")
	public void user_has_entered_valid_rdpassword_into_password_field(String password) {

		vp.passwordField(password);
	}

	@And("User verify specific account name {string} then click on it")
	public void user_verify_specific_account_name_then_click_on_it(String accountname) {

		vp.verifyAccountName();
		vp.clickAccountId(accountname);
		vp.clickOnSearchBar();
		vp.sendAccountNameinSearachBar(accountname);
		vp.selectDesiredAccountName(accountname);
	}

	@And("User verify landing page is remote download")
	public void user_verify_landing_page_is_remote_download() {

		vp.clickOnRemoteDownloadPage();
		Assert.assertTrue(vp.verifyRDTitleOfPage().contains("REMOTE DOWNLOAD"));
		
	}

//	@And("User clicks on remote download login button")
//	public void user_clicks_on_remote_download_login_button() {
//		
//		vp.clickOnLoginButton();
//		System.out.println("Title of this page is: " + vp.verifyTitlePage());
//		Assert.assertTrue(vp.verifyTitlePage().contains("REMOTE DOWNLOAD"));
//		//CompanyCard cc = new CompanyCard(driver);
//	}

//	 public static WebDriver getDriver() {
//	return driver;
//}

//@When("^User has entered valid emailid (.+) into email field$")
//public void user_has_entered_valid_email_id_into_email_field(String emailText) {
//
//lp.enterEmailAddress(emailText);
//
//}
//
//@And("^User has entered valid passwords (.+) into password field$")
//public void user_has_entered_valid_password_into_password_field(String passwordText) {
//
//lp.enterPasswordField(passwordText);
//}
//
////@And("User clicks on login button")
////public void user_clicks_on_login_button() {
////ap = lp.clickOnLoginButton();
////}
//
//@Then("User should get successfuly logged in")
//public void user_should_get_successfuly_logged_in() {
//
//Assert.assertTrue(ap.verifyAccountVerification());
//
//}
//
//@When("User has entered invalid email address into email field")
//public void user_has_entered_invalid_email_address_into_email_field() {
//
//lp.enterEmailAddress(commonUtils.getEmailWithTimeStamp());
//
//}
//
//@And("User enters invalid password {string} into the password field")
//public void user_enters_invalid_password_into_the_password_field(String invalidPassword) {
//
//lp.enterPasswordField(invalidPassword);
//}
//
//@Then("User should get a proper warning message about credentials missmatch")
//public void user_should_get_a_proper_warning_message_about_credentials_missmatch() {
//
//Assert.assertTrue(lp.verifyWarningMessage().contains("Warning: No match for E-Mail Address and/or Password."));
//}
//
//@When("User dont enter email address into email field")
//public void user_dont_enter_email_address_into_email_field() {
//
//lp.enterEmailAddress("");
//
//}
//
//@And("User dont enter password into password field")
//public void user_dont_enter_password_into_password_field() {
//
//lp.enterPasswordField("");
//}

//	@When("User has entered valid accountname (.+) into account field")
//	public void user_has_entered_valid_accountname_into_account_field(String accountname)  {
//		
//		//vp = new VDOLoginPage(driver);
//		//vp.accountNameField(accountname);
//		vp.emailIdField(accountname);
//	}

}
