package com.hngproject.automation.base;

import org.openqa.selenium.WebDriver;

import com.hngproject.automation.config.ConfigurationReader;
import com.hngproject.automation.config.PropertyFileReader;
import com.hngproject.automation.util.PathHelper;
import com.hngproject.framework.Browser;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Base {
	
	public static Logger log=Logger.getLogger(Base.class);
	
	public static WebDriver driver;
	public static ConfigurationReader reader;
	}


