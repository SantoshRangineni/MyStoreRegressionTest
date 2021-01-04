package com.mystore.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mystore.pages.RegisterPage;
import com.mystore.utils.BasePage;

public class RegisterTest extends BasePage{
	WebDriver driver;
	
	@Test
	public void Register()
	{
		driver = BasePage.setBrowser("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		RegisterPage Register = new RegisterPage(driver);
		
		Register.setCreateEmail("3@gmail.com");
		Register.ClickOnSubmitCreate();
		Register.ClickOnMr();
		Register.setFirstName1("Santosh");
		Register.setLastName1("Santosh");
		Register.setPassword("Santosh");
		Register.setDays("4");
		Register.setMonths("March");
		Register.setYears("2020");
		Register.ClickOnNewsLetter();
		Register.ClickOnSpecialOffer();
		Register.setFirstName("Santosh");
		Register.setLastName("Santosh");
		Register.setCompany("NA");
		Register.setAddressLine1("Hyderabad");
		Register.setAddressLine2("Hyderabad");
		Register.setCity("Hyderabad");
		Register.setState("Iowa");
		Register.setPostalCode("00000");
		Register.setCountry("United States");
		Register.setAdditionalInfo("NA");
		Register.setPhone("9999999999");
		Register.setMobile("9999999999");
		Register.setAlias("Hyderabad");
		Register.clickOnSubmitAccount();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
