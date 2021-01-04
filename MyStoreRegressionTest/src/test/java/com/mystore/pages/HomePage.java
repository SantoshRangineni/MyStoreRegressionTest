package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.utils.BasePage;

public class HomePage extends BasePage{

WebDriver driver;
	
	@FindBy(name="search_query")
	WebElement search;
	
	@FindBy(name="submit_search")
	WebElement searchIcon;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement cart;
	
	@FindBy(xpath="//a[@title='Contact Us']")
	WebElement contactUs;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement signIn;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement women;
	
	@FindBy(xpath="//a[@class='blockbestsellers']")
	WebElement bestSellers;
	
	@FindBy(xpath="//*[@id=\"blockbestsellers\"]/li[1]/div/div[2]/div[2]/a[1]")
	WebElement addToCart;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setSearch(String Search) {
		wait(search, 10);
		search.sendKeys(Search);
		log("search word is entered");
	}
	
	public void clickOnSearchButton() {
		searchIcon.click();
		log("search icon is clicked");
	}
	
	public void clickOnContactUs(){
		contactUs.click();
		log("Clicked on contactUs");
	}
	
	public void clickOnSignIn(){
		signIn.click();
		log("Clicked on signIn");
	}
	
	public void clickOnWomen(){
		women.click();
		log("Clicked on women");
	}
	
	public void clickOnBestSellers() {
		bestSellers.click();
		log("Clicked on bestSellers");
	}
	
	public void clickOnAddToCart() {
		addToCart.click();
		log("Clicked on addToCart");
	}
	
	public void verifyHome(String Search) {
		this.setSearch(Search);
		this.clickOnSearchButton();
		this.clickOnContactUs();
		this.clickOnSignIn();
		this.clickOnWomen();
		this.clickOnBestSellers();
		this.clickOnAddToCart();
		
	}
}
