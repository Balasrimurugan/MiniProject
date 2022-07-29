package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	
	public ConfigurationReader() throws IOException {
		
		File f = new File ("C:\\Users\\HI\\eclipse-workspace\\Selenium16\\src\\com\\configure\\property\\configure.properties");
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
	
}
