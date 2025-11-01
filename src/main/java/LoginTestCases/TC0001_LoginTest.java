package LoginTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.BaseClass;
import Utilities.DataProviders;


public class TC0001_LoginTest extends BaseClass {
	
	@Test(dataProvider="login", groups="Login", dataProviderClass = DataProviders.class)
	public void loginTest(String usrnme, String psword)
	{
		logger.info("Starting TC0001_LoginTest....");
		
		try {
			
		//Loginpage
		lp.insrtUsrNme(usrnme);
		lp.insrtpssWrd(psword);
		lp.clckLoginButton();
		
		//Menupage
		if(mp.verifyMenuPage()==true) {
			Assert.assertTrue(true);
			mp.logout();
		}else {
			Assert.fail();
		}
		
		}catch(Exception e) {
			
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		
		logger.info("Finished TC0001_LoginTest....");
	}
	
}
