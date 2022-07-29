package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static  WebDriver driver;
	
	@FindBy(name = "location")
	private WebElement location;
	@FindBy (name = "hotels")
	private WebElement hotel;
	@FindBy (name = "room_type")
	private WebElement roomtype;
	@FindBy (name = "room_nos")
	private WebElement roomnos;
	@FindBy (name = "datepick-in")
	private WebElement datein;
	@FindBy (name = "datepick_out")
	private WebElement dateout;
	@FindBy (name = "adult_room")
	private WebElement adult;
	@FindBy (name = "child_room")
	private WebElement child;
	@FindBy (name = "submit")
	private WebElement submit;
	
	
	public SearchHotel(WebDriver driver2) {
		this.driver = driver2;
				
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}

}
