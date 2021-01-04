package com.mystore.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.pages.LoginPage;
import com.mystore.utils.BasePage;


public class LoginTest extends BasePage{
WebDriver driver;

   /* @BeforeMethod
    public void setup() {
    	driver = BasePage.setBrowser("http://automationpractice.com/index.php?controller=authenticati
    }
    */
    
    @Test
	public void successfulLogin()
	{
    	
		driver = BasePage.setBrowser("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		LoginPage Login = new LoginPage(driver);
		//Login1.verifylog("Santhu2024@gmail.com", "Santosh");
		Login.setEmail("Santhu2024@gmail.com");
		Login.setPassword("Santosh");
		Login.clickOnSubmitLogin();
    }
		
	
	@Test
	public void unsuccessfulLogin()
	{
		driver = BasePage.setBrowser("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		LoginPage Login = new LoginPage(driver);
		Login.setEmail("Santhu2024@gmail.com");
		//Login2.setPassword("Santosh1");
		Login.clickOnForgotPassword();
	}

	@AfterMethod
	public void teardown() {
    	driver.quit();
		
}
	
}
