package com.mystore.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mystore.pages.HomePage;
import com.mystore.pages.TshirtsPage;
import com.mystore.utils.BasePage;

public class AddItemCartTest extends BasePage{
WebDriver driver;

/*	@Test
	public void addToCartItemBySearch()
{
 driver = BasePage.setBrowser("http://automationpractice.com/index.php");
 
 HomePage Home = new HomePage(driver);
 
 Home.setSearch("t shirts");
 Home.clickOnSearchButton();
 
 TshirtsPage shirts = new TshirtsPage(driver);
 shirts.clickAddtoCart();
	
}*/
	
    @Test
    public void addToCartItemByCategory()
{
 driver = BasePage.setBrowser("http://automationpractice.com/index.php");
 
 HomePage Home = new HomePage(driver);
 
 Home.clickOnBestSellers();
 
 Home.clickOnAddToCart();
	
}
	
  /*  @AfterMethod
    public void tearDown() {
    	driver.quit();
    }*/
    
}
