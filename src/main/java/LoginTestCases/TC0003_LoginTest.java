package LoginTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.BaseClass;

public class TC0003_LoginTest extends BaseClass {

@Test(groups="Login")
public void LogoutTest() throws InterruptedException {
		
		logger.info("Starting TC0003_LogoutTest...");
		try {
			
		lp.insrtUsrNme(p.getProperty("username"));
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
	
		mp.logout();
		Assert.assertEquals(lp.isLogoExist(), true);
		
		}catch (Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);	
		}
		
		logger.info("Finsihed TC0002_LogoutTest...");
	}
}
