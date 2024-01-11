package com.inetbanking.testCases;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.baseTest.BaseClass;
import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException 
	{
			
		logger.info("URL is opened");
		
		/**We need to create the object for LoginPage class to call those methods 
		like below and log messages added for each step of action
		*/
		LoginPage lp=new LoginPage(driver);
		
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		logger.info("Clicked login button");
		
		//Title verify once logged 
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
