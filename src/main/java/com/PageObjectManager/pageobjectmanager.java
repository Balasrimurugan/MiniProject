package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pom.BookigConfirnmation;
import com.pom.BookingHotel;
import com.pom.SearchHotel;
import com.pom.SignInpage;

public class pageobjectmanager {
public static WebDriver driver;
	
	
	public pageobjectmanager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public SignInpage getSignInpage() {
		SignInpage sp = new SignInpage(driver);
		return sp;
	
	}
	
     public SearchHotel getSearchHotel() {
    	 SearchHotel sh = new SearchHotel(driver);
    	 return sh;

	}

	public BookingHotel getBookingHotel() {
		BookingHotel bh = new BookingHotel(driver);
		return bh;
		
	}
	
	public BookigConfirnmation getBookigconfirnmation() {
		BookigConfirnmation bc = new BookigConfirnmation(driver);
		return bc;
	}
	

}
