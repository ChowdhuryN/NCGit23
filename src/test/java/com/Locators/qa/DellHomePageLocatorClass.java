package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.DellBaseClass;

public class DellHomePageLocatorClass extends DellBaseClass {

public 	DellHomePageLocatorClass() {

PageFactory.initElements(driver,this);
	
}
	
@FindBy(id="mh-search-input")	
public WebElement SearchField;  	
	
	
	
}
