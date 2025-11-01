package LoginTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.BaseClass;

public class TC0002_LoginTest extends BaseClass{
	
	@Test(groups="Login")
	public void checkLoginLogoTest() {
		
		logger.info("Starting TC0002_checkLogoTestatLoginPage....");
		
		if(lp.isLogoExist()==true) 
		{
			
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.fail();
		}
		
		logger.info("Finished TC0002_checkLogoTest....");
	}
}
