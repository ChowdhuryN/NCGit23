package com.TestRunner.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.qa.DellBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resource/Features"},
plugin= {"json:target/cucumber.json"},
glue= "com.StepDef.qa")//,tags= {"@Dell"})

public class TestRunnerClass extends AbstractTestNGCucumberTests{
	

@BeforeTest
public void startURL() {
DellBaseClass test = new DellBaseClass(); 	
test.intbrowser();	
}

@AfterTest 
public void closeURL() {	
DellBaseClass test = new DellBaseClass(); 	
test.driver.close();	
}
	
	
}
