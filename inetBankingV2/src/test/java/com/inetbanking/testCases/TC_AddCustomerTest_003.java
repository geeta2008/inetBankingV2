package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Password provided");
		lp.clickSubmit();

		Thread.sleep(5000);
		

		AddNewCustomerPage addnewc = new AddNewCustomerPage(driver);
		addnewc.clickAddNewCustomer();
		logger.info("Providing Customer Details");
		addnewc.customerName("tom");
		addnewc.customerGenderR("male");
		addnewc.customerDateOfBirth("01", "01", "2020");
		addnewc.customerAddress("India");
		addnewc.customerCity("Pune");
		addnewc.cutomerState("MH");
		addnewc.customerPIN("555578");
		addnewc.customerMobileNumber("123");
		String email=randomestring()+"@gmail.com";
		addnewc.customerEmailId(email);
		addnewc.customerPassword("abc");
		addnewc.customerSubmit();
		
		Thread.sleep(3000);
		logger.info("Get Titile");
		System.out.println(driver.getTitle());
		logger.info("Validation Started");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else 
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
		}

	}

	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return generatedstring;

	}

}
