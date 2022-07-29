package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpage {
	public static WebDriver driver;
	
	@FindBy(name = "username")
 private WebElement username;
	@FindBy(name = "password")
private WebElement passsword;
	@FindBy(name = "login")
private WebElement login;
	

	

	public SignInpage(WebDriver driver2) {
		this.driver = driver2;
		
	PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPasssword() {
		return passsword;
	}
	
	public WebElement getLogin() {
		return login;
	}
	
	

	



	







	
	

}
