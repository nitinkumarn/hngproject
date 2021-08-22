package com.hngproject.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features={"classpath:FeatureFiles/Login.feature"},
	glue={"classpath:com.hngproject.automation.stepdef"},
	plugin={"html:target/cucumber_html_report"},
	tags= {"@Login","@One"})
	
	public class TestRunner {
}
