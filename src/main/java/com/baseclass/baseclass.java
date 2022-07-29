package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseclass {

		public static  WebDriver driver ;
		
		public static WebDriver getBrowser() {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HI\\eclipse-workspace\\Selenium16\\driver2\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        return driver;

		}

		public static void getUrl(String Url) {
			
			driver.get(Url);

		}

		public static void getTitlte() {
			
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		
		public static void GetcurrentUrl() {
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);

		}

		public static void windowhandle() {
			
			String windowhandle = driver.getWindowHandle();
			System.out.println(windowhandle);

		}

		public static void windowhandles() {
			
	        Set<String> windows = driver.getWindowHandles();
			System.out.println(windows);

		}
		
		
		public static void close() {
			
			driver.close();

		}

		public static void quit() {
			
			driver.quit();

		}
		
		//navigate
		public static void navigateTo(String Url) {
			
			driver.navigate().to(Url);
			
		}

		public static void back() {
			
			driver.navigate().back();
			
		}
		
		public static void forward() {
			
			driver.navigate().forward();
		}

		public static void refresh() {
			
			driver.navigate().refresh();
			
		}
		
		//webelement 
		public static void SendKeys(WebElement element,String value) {
			
			element.sendKeys(value);
		}

		public static void click(WebElement element) {
			
			element.click();	

		}

		public static void clear(WebElement element) {
			
			element.clear();
			
		}

		public static void isDisplayed(WebElement element) {
			
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		}

		public static void isEnabled(WebElement element ) {
			
			System.out.println(element.isEnabled());

		}

		public static void isSelected(WebElement element) {

			System.out.println(element.isSelected());

		}

		public static void getText(WebElement element) {
			
			String text = element.getText();
			System.out.println(text);

		}

		public static void getAttribute (WebElement element) {

			String attribute = element.getAttribute("value");
	        System.out.println(attribute);
		}

		public static void getAttributeName(WebElement element) {
			
			String attribute = element.getAttribute("name");
			System.out.println(attribute);

		}

		//alert
		public static void alertHandle(String options) {
			Alert alert = driver.switchTo().alert();
			
			if(options.equalsIgnoreCase("ok")) {
				
				alert.accept();
			}
			
			else if(options.equalsIgnoreCase("cancel")) {
				
				alert.dismiss();
			
			}
			
			else if (options.equalsIgnoreCase("getText")) {
				
				System.out.println(alert.getText());
				
			}
			
		}
	//dropdown
		public static void dropdown(WebElement element,String options,String input) {
			Select s = new Select(element);
			
			if(options.equalsIgnoreCase("value")) {
			  
				System.out.println("selectByValue");
				s.selectByValue(input);
			}
			
			else if(options.equalsIgnoreCase("text")) {
				
				System.out.println("selectByVisible");
				s.selectByVisibleText(input);
			
			}
			
			else if (options.equalsIgnoreCase("index")) {
				
				System.out.println("selectByIndex");
				int parseInt = Integer.parseInt(input);
				s.selectByIndex(parseInt);
				
			}
		}
			
		public static void multipledropdown(WebElement element,String options,String input) {
			Select s = new Select(element);
			
			 if(options.equalsIgnoreCase("deselectvalue")) {
				
				System.out.println("deselectbyvalue");
				s.deselectByValue(input);
			
			}

			else if(options.equalsIgnoreCase("deselecttext")) {
				
				System.out.println("deselectByVisibletext");
				s.deselectByVisibleText(input);
			
			}

			else if(options.equalsIgnoreCase("ddeselectall")) {
				
				System.out.println("deselectall");
				s.deselectAll();
			
			}

			else if(options.equalsIgnoreCase("deselectindex")) {
				
				System.out.println("deselectByVisibleindex");
				int parseInt = Integer.parseInt(input);
				s.deselectByIndex(parseInt);
			
			}
		
			
		}
		//actions
		public static void Action(WebElement element,String options) {
			Actions a = new Actions(driver);
			
			if(options.equalsIgnoreCase("click")) {
			 
				a.click(element).build().perform();
			}
			
			else if(options.equalsIgnoreCase("doubleclick")) {
				
				a.doubleClick(element).build().perform();
				
			}
			
			else if (options.equalsIgnoreCase("contextclick")) {
				
				a.contextClick(element).build().perform();
				
			}
		}
		public static void moveto(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		
				
		}
		
		

		public static void DragAndDrop(WebElement src,WebElement target) {
			
			Actions act = new Actions(driver);
			act.dragAndDrop(src,target).build().perform();

		}
		
		public static void clickandhold(WebElement element) {
			
			Actions act = new Actions(driver);
			act.clickAndHold(element).build().perform();
			
		}
		
	    ///robot
		public static void robot(String options) throws AWTException{
			
			Robot rob = new Robot ();
			
			if(options.equalsIgnoreCase("down")) {
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.keyRelease(KeyEvent.VK_DOWN);
				
			}
			
			else if(options.equalsIgnoreCase("up")) {
				rob.keyPress(KeyEvent.VK_UP);
				rob.keyRelease(KeyEvent.VK_UP);
				
			}
			
			else if(options.equalsIgnoreCase("enter")) {
				rob.keyPress(KeyEvent.VK_ENTER);
				rob.keyRelease(KeyEvent.VK_ENTER);
				
			}
			
		}
		
		//scroll
		public static void scrollpage(WebElement element) {
			
			JavascriptExecutor js = ( JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			
		}
		
		//wait
		public static void implicitWait(int w) {
		
			driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);	
			
		}
		
		//screenshot
		public static void screenshot(String url) throws IOException {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		    File des=new File(url);
		    FileUtils.copyFile(src, des);
			
			
		}
		
		public static void getoptions(WebElement element) {
			Select s = new Select(element);
			
				
				System.out.println("selectByVisible");
				s.getOptions();
		}
			
		public static void getfirstselectedoptions(WebElement element) {
			Select s = new Select(element);
					
				System.out.println("Firstselectedoptions");
				s.getFirstSelectedOption();
				
		}
			
		public static void getallselectedoptions(WebElement element) {
			Select s = new Select(element);
					
				
				System.out.println("getallselectedoptions");
				s.getAllSelectedOptions();
				
		}
	   public static void frame() {
		
		   driver.switchTo().defaultContent();
	   
		   
	}
	   public static void frame1(int i){
			
		   driver.switchTo().frame(i);
	   
		   
	}

	}	
