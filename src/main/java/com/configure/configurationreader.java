package com.configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationreader {
	public Properties p;
	
	public configurationreader() throws IOException {
		
		
		File f = new File ("C:\\Users\\HI\\eclipse-workspace\\cucumberproject\\src\\main\\java\\com\\configure\\configure.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getfirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String getlastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getaddress() {
		String address = p.getProperty("address");
		return address;
	}
	
	public String getccno() {
		String ccno = p.getProperty("ccno");
		return ccno;
	}
	
	public String getcvvno() {
		String cvvno = p.getProperty("cvvno");
		return cvvno;
	}
	
	

}
