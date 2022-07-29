package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {
	public static WebDriver driver;
	
	
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(name = "continue")
	private WebElement cntu;
	@FindBy(name = "first_name" )
	private WebElement firstname;
	@FindBy(name = "last_name")
	private WebElement lastname;
	@FindBy(name = "address" )
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement ccnum;
	@FindBy(name = "cc_type")
	private WebElement cctype;
	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;
	@FindBy(name = "cc_exp_year" )
	private WebElement expyear;
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	@FindBy(name = "book_now" )
	private WebElement booknow;
	
	
	
	
	
	public BookingHotel(WebDriver driver2) {
		this.driver = driver2;
		
	PageFactory.initElements(driver,this);
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getCntu() {
		return cntu;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	

}
