package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	
WebDriver driver;
	
	@FindBy(name="email_create")
	WebElement emailCreate;
	
	@FindBy(name="SubmitCreate")
	WebElement submitCreate;
	
	@FindBy(id="id_gender1")
	WebElement idGender1;
	
	@FindBy(id="id_gender2")
	WebElement idGender2;
	
	@FindBy(name="customer_firstname")
	WebElement firstName1;
	
	@FindBy(name="customer_lastname")
	WebElement lastName1;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="days")
	WebElement day;
	
	@FindBy(name="months")
	WebElement month;
	
	@FindBy(name="years")
	WebElement year;
	
	@FindBy(name="newsletter")
	WebElement newsLetter;
	
	@FindBy(name="optin")
	WebElement specialOffer;
	
	@FindBy(name="firstname")
	WebElement firstName2;
	
	@FindBy(name="lastname")
	WebElement lastName2;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(name="address1")
	WebElement addressLine1;
	
	@FindBy(name="address2")
	WebElement addressLine2;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="id_state")
	WebElement state;
	
	@FindBy(name="postcode")
	WebElement postalCode;
	
	@FindBy(name="id_country")
	WebElement country;
	
	@FindBy(name="other")
	WebElement additionalInfo;
	
	@FindBy(name="phone")
	WebElement homePhone;
	
	@FindBy(name="phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(name="alias")
	WebElement alias;
	
	@FindBy(name="submitAccount")
	WebElement Register;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setCreateEmail(String createEmail) {
		emailCreate.sendKeys(createEmail);
	}
	
	public void ClickOnSubmitCreate() {
		submitCreate.click();
	}
	
	public void ClickOnMr() {
		idGender1.click();
	}
	
	public void ClickOnMrs() {
		idGender2.click();
	}
	
	public void setFirstName1(String FirstName1) {
		firstName1.sendKeys(FirstName1);
	}
	
	public void setLastName1(String LastName1) {
		lastName1.sendKeys(LastName1);
	}
	
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void setPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void setDays(String Day){
		day.sendKeys(Day);
	}
	
	public void setMonths(String Month){
		month.sendKeys(Month);
	}
	
	public void setYears(String Year){
		year.sendKeys(Year);
	}
	
	public void ClickOnNewsLetter(){
		newsLetter.click();
	}
	
	public void ClickOnSpecialOffer(){
		specialOffer.click();
	}
	
	public void setFirstName(String FirstName){
		firstName2.sendKeys(FirstName);
	}
	
	public void setLastName(String LastName){
		lastName2.sendKeys(LastName);
	}
	
	public void setCompany(String Company){
		company.sendKeys(Company);
	}
	
	public void setAddressLine1(String AddressLine1){
		addressLine1.sendKeys(AddressLine1);
	}
	
	public void setAddressLine2(String AddressLine2){
		addressLine2.sendKeys(AddressLine2);
	}
	
	public void setCity(String City){
		city.sendKeys(City);
	}
	
	public void setState(String State){
		state.sendKeys(State);
	}
	
	public void setPostalCode(String ZipCode){
		postalCode.sendKeys(ZipCode);
	}
	
	public void setCountry(String Country){
		country.sendKeys(Country);
	}
	
	public void setAdditionalInfo(String AdditionalInfo){
		additionalInfo.sendKeys(AdditionalInfo);
	}
	
	public void setPhone(String Phone){
		homePhone.sendKeys(Phone);
	}
	
	public void setMobile(String Mobile){
		mobilePhone.sendKeys(Mobile);
	}
	
	public void setAlias(String Alias){
		
		alias.clear();
		alias.sendKeys(Alias);
		
	}
	
	public void clickOnSubmitAccount() {
		Register.click();
	}
	
	
	public void Registerlog(String createEmail, String FirstName1, String LastName1,  String Email,  String Day,  String Month,  String Year,  String FirstName,  String LastName,  String Company,  String AddressLine1,  String AddressLine2,  String City,  String State,  String ZipCode,  String Country,  String AdditionalInfo,  String Phone,  String Mobile,  String Alias) {
		this.setCreateEmail(createEmail);
		this.ClickOnSubmitCreate();
		this.ClickOnMr();
		this.ClickOnMrs();
		this.setFirstName1(FirstName1);
		this.setLastName1(LastName1);
		this.setEmail(Email);
		this.setDays(Day);
		this.setMonths(Month);
		this.setYears(Year);
		this.ClickOnNewsLetter();
		this.ClickOnSpecialOffer();
		this.setFirstName(FirstName);
		this.setLastName(LastName);
		this.setCompany(Company);
		this.setCity(City);
		this.setState(State);
		this.setPostalCode(ZipCode);
		this.setCountry(Country);
		this.setAdditionalInfo(AdditionalInfo);
		this.setPhone(Phone);
		this.setMobile(Mobile);
		this.setAlias(Alias);
		this.clickOnSubmitAccount();
		
	}

}
