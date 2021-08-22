package com.hngproject.automation.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hngproject.automation.base.Base;

import cucumber.api.java.en.*;

public class Login {
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application(){
		Base.driver.get("https://www.healthandglow.com/");
	}

	@Given("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page(){
	   
	}

	@When("^I login to application using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_to_application_using_username_and_password(String arg1, String arg2){
	    
	}

	@Then("^I should see that user is able to login successfully$")
	public void i_should_see_that_user_is_able_to_login_successfully(){
	    
	}

}
