package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.PageObjectManager.pageobjectmanager;
import com.baseclass.baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = "com\\stepdefinition",dryRun = false
,plugin = {"pretty","html:target/HtmlReport/report.html","json:target/jsonreport/reprt.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner {
public static WebDriver driver;
    
	
	@BeforeClass
	public static void setUp() {
		driver = baseclass.getBrowser();
		
		
	}

	@AfterClass
	public static void tearDown() {
	
      baseclass.close();
	}

}
