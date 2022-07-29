package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookigConfirnmation {
	public static WebDriver driver;
	
	@FindBy(name = "my_itinerary")
	private WebElement itinerary;
	@FindBy(name = "logout")
	private WebElement logout;
	
	
	
	
	
	
	public BookigConfirnmation(WebDriver driver2) {
		this.driver = driver2;
		
	PageFactory.initElements(driver,this);
		
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getLogout() {
		return logout;
	}

}
