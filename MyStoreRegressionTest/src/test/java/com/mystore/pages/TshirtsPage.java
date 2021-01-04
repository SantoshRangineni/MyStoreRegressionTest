package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.mystore.utils.BasePage;

public class TshirtsPage extends BasePage{
	WebDriver Driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
	WebElement cart; 



public TshirtsPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void clickAddtoCart() {
	wait(cart, 10);
	cart.click();
	log("Clicked on AddtoCart");
	
}


}