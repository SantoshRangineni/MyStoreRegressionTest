package com.mystore.utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage extends Support {
	public static WebDriver driver;
	 
	
	public static WebDriver setBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;

}
	public void log(String print) {
		System.out.println(print);
	}
	
	
	//create the common method for explicit wait 

	public void wait(WebElement element, int timeout)//, String value) 
	{
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		//element.sendKeys(value);
		
	}
	
	public void mouseHover(WebElement element) {
		
		Actions Builder = new Actions(driver);
		Action MH = (Action)Builder.moveToElement(element).build();
		MH.perform();
		
		
	}
	
	
	
	
	 /*@Parameters({"browser"})
		@Test(priority=1)
		public void launchURLTest(String browser)
		{
	    	
	    	System.out.println("Running browser is:"+browser);
	    	
	    	if(browser.equals("chrome")) {
	    		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver.exe");
	    		driver = new ChromeDriver();
	    	}
	    	
	    	else if(browser.equals("firefox")) {
	    		driver = new FirefoxDriver();
	    	}
	    	
	    	else if(browser.equals("ie")) {
	    		driver = new InternetExplorerDriver();
	    	}
	    	
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    	
		}
	    
	    
	    @Parameters({"email", "password"})
	    @Test(priority=2)
	    public void loginTest(String email, String password)
	    {
	    	System.out.println("email: "+ email +"and password: "+ password);
	    	driver.findElement(By.name("email")).sendKeys(email);
	    	driver.findElement(By.name("passwd")).sendKeys(password);
	    }*/
	
	
}
