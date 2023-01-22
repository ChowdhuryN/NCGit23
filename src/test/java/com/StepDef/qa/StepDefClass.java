package com.StepDef.qa;

import com.Utility.qa.DellBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefClass extends DellBaseClass {

	@Given("^Launch Application <\"([^\"]*)\">$")
	public void launch_Application(String URL) throws Throwable {
		LaunchURL(URL);  
	}

	@Then("^Enter Laptop in Search Field$")
	public void enter_Laptop_in_Search_Field() throws Throwable {
	   
	}

	@Then("^Click Search button$")
	public void click_Search_button() throws Throwable {
	    
	}

	@Then("^Verify search result is displayed$")
	public void verify_search_result_is_displayed() throws Throwable {
	    
	}
}	

	
	

