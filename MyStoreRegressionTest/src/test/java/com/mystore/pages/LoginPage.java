package com.mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.utils.BasePage;

public class LoginPage extends BasePage {
	
	//WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//a[@title='Recover your forgotten password']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	WebElement submit;
	
	//@FindBy(name="SubmitLogin")
	//WebElement submit;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String Email) {
		//wait common method code
		wait(email, 10);//, "email");
		//driver.findElement(By.name("email")).click();
		email.sendKeys(Email);
		log("Email is entered");
	
	}
	
	public void setPassword(String Password) {
		
		password.sendKeys(Password);
		log("Password is entered");
	}
	
	public void clickOnForgotPassword(){
		forgotPassword.click();
		log("Clicked on Forgot Password");
	}
	
	public void clickOnSubmitLogin() {
		submit.click();
		log("Clicked on SignIn");
	}
	
	public void verifylog(String Email, String Password) {
		this.setEmail(Email);
		this.setPassword(Password);
		//this.clickOnForgotPassword();
		this.clickOnSubmitLogin();
		
	}
	

}
