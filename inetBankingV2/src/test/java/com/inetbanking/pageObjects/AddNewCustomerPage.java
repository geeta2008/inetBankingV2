package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {

	WebDriver ldriver;

	public AddNewCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement addNewCustomer;

	@FindBy(xpath = "//input[@name='name']")
	WebElement name;

	@FindBy(xpath = "//input[@name='rad1']")
	WebElement gender;

	@FindBy(xpath = "//input[@type='date']")
	WebElement dob;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement address;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='state']")
	WebElement state;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement telephone;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailid;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='sub']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;

	public void clickAddNewCustomer() {
		addNewCustomer.click();
	}

	public void customerName(String cname) {
		name.sendKeys(cname);

	}

	public void customerGenderR(String cgender) {
		gender.click();

	}

	public void customerDateOfBirth(String mm, String dd, String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}

	public void customerAddress(String cadd) {
		address.sendKeys(cadd);

	}

	public void customerCity(String ccity) {
		city.sendKeys(ccity);

	}

	public void cutomerState(String cstate) {
		state.sendKeys(cstate);

	}

	public void customerPIN(String cpin) {
		pin.sendKeys(cpin);

	}

	public void customerMobileNumber(String cmobile) {
		telephone.sendKeys(cmobile);

	}

	public void customerEmailId(String cemail) {
		emailid.sendKeys(cemail);

	}

	public void customerPassword(String pwd) {
		password.sendKeys(pwd);

	}

	public void customerSubmit() {
		submit.click();

	}

}
