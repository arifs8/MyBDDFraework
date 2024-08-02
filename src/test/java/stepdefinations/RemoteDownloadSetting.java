package stepdefinations;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AssignCompanyCardPage;
import pages.RemoteDownloadSettingPage;

public class RemoteDownloadSetting {

	WebDriver driver;
	private RemoteDownloadSettingPage rdp;

	@Given("User navigates to {string} screen page by clicking")
	public void user_navigates_to_something_screen_page_by_clicking(String strArg1) throws Throwable {

		driver = DriverFactory.getDriver();
		rdp = new RemoteDownloadSettingPage(driver);
		rdp.clickremoteDownloadSettingPage();
		Assert.assertTrue(rdp.verifyRemoteDownlaodSettingTitle().contains(strArg1));
	}

	@When("User verify {string} title in the page")
	public void user_verify_something_title_in_the_page(String strArg1) throws Throwable {

		Assert.assertTrue(rdp.verifydelegateTitle().contains(strArg1));
	}

	@Then("User verify the Authorize icon")
	public void user_verify_the_authorize_icon() throws Throwable {

		Assert.assertTrue(rdp.verifyAuthorizeIcon());
	}
	
	@And("user veify there is a text field to pass")
    public void user_veify_there_is_a_text_field_to_pass() throws Throwable {
        
		Assert.assertTrue(rdp.verifySearchField());
    }

    @And("Authorize button is disabled")
    public void authorize_button_is_disabled() throws Throwable {
        
    	Assert.assertTrue(rdp.verifyDisbaledAuthorizeButton());
    }
    
    @And("User verify Account name {string} to be pass in the text field")
    public void user_verify_account_name_something_to_be_pass_in_the_text_field(String strArg1) throws Throwable {
        
    	rdp.passTheAccountName(strArg1);
    }

    @And("User verify Authorize button is enabled and click on it")
    public void user_verify_authorize_button_is_enabled_and_click_on_it() throws Throwable {
      
    	Assert.assertTrue(rdp.verifyEnabledAuthorizeIcon());
    	rdp.clickAuthorizeButton();
    }

    @And("User verify a popup message with {string} as title")
    public void user_verify_a_popup_message_with_something_as_title(String strArg1) throws Throwable {
        
    	Assert.assertTrue(rdp.verifyAuthorizePopupTitle().contains(strArg1));
    }

    @And("User verify two options with Yes and No")
    public void user_verify_two_options_with_yes_and_no() throws Throwable {
        
    	Assert.assertTrue(rdp.verifyAuthorizePopupNoButton());
    	Assert.assertTrue(rdp.verifyAuthorizePopupYesButton());
    }

    @And("User verify when clicks on No there will be no Revoke button")
    public void user_verify_when_clicks_on_no_there_will_be_no_revoke_button() throws Throwable {
        
    	rdp.clickAuthorizeButtonNO();
    	Assert.assertTrue(rdp.verifyEnabledAuthorizeIcon());
    }

    @And("User when clicks on Yes there will be Revoke button")
    public void user_when_clicks_on_yes_there_will_be_revoke_button() throws Throwable {
    	
    	Assert.assertTrue(rdp.verifyRevokeButton());
    }

    @And("User verify there is a success message {string} displayed")
    public void user_verify_there_is_a_success_message_something_displayed(String strArg1) throws Throwable {
    	
    	rdp.clickAuthorizeButton();
    	rdp.clickAuthorizeButtonYES();
    	Assert.assertTrue(rdp.verifyAuthorizationSuccessMessage().contains(strArg1));
    }

    @And("User verify correct symbol after success delegation")
    public void user_verify_correct_symbol_after_success_delegation() throws Throwable {
        
    	Assert.assertTrue(rdp.verifyCorrectIconButton());
    }
    
    @And("User verify Revoke button is enabled")
    public void user_verify_revoke_button_is_enabled() throws Throwable {
        
    	Assert.assertTrue(rdp.verifyRevokeButton());
    }

    @And("User click on Revoke button veify the title {string}")
    public void user_click_on_revoke_button_veify_the_title_something(String strArg1) throws Throwable {
        
    	rdp.clickOnRevokeButtone();
    	Assert.assertTrue(rdp.verifyRevokeTitle().contains(strArg1));
    	
    }

    @And("User verify there are two options with yes and no")
    public void user_verify_there_are_two_options_with_yes_and_no() throws Throwable {
       
    	Assert.assertTrue(rdp.clickRevokeButtonNO());
    	Assert.assertTrue(rdp.clickRevokeButtonYES());
    }

    @And("User clicks on No then Revoke button will be in enabled state")
    public void user_clicks_on_no_then_revoke_button_will_be_in_enabled_state() throws Throwable {
        
    	rdp.clickAuthorizeButtonNO();
    	Assert.assertTrue(rdp.verifyRevokeButton());
    }

    @And("User clicks on Yes button there will be authorize button")
    public void user_clicks_on_yes_button_there_will_be_authorize_button() throws Throwable {
    	
    	rdp.clickOnRevokeButtone();
    	rdp.clickAuthorizeButtonYES();
    	
    }

    @And("User verify the {string} message of revoke button")
    public void user_verify_the_something_message_of_revoke_button(String strArg1) throws Throwable {
       
    	Assert.assertTrue(rdp.verifyRevokeSuccessMessage().contains(strArg1));
    }
    
    @And("User verify {string} message is displayed")
    public void user_verify_something_message_is_displayed(String strArg1) throws Throwable {
       
    	Assert.assertTrue(rdp.verifySelfDelegationTitle().contains(strArg1));
    }
    
    @And("User verify cross mark")
    public void user_verify_cross_mark() throws Throwable {
        
    	Assert.assertTrue(rdp.verifyCrossMArkForWrongAccount());
    }

    
    
}
