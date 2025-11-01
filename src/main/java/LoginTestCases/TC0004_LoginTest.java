package LoginTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBases.BaseClass;
import Utilities.DataProviders;

public class TC0004_LoginTest extends BaseClass{
	
	@BeforeMethod (groups = "Login")
	public void login() {
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		
	}
	
	@Test(dataProvider="mismatchconfirmpassword", groups="Login", dataProviderClass = DataProviders.class, priority = 1)
	public void verifyConfirmErrorMessage(String crntpswrd, String nwpswrd, String cnfrmpswrd) {
		
		try {
			
		logger.info("...Starting TC0004_LoginTEST...");
		logger.info("...Starting verifyConfirmErrorMessage...");
		
		mp.chngePsword();
		
		cp.insrtCrntPsword(crntpswrd);
		cp.insrtnewPsword(nwpswrd);
		cp.insrtcnfirmPsword(cnfrmpswrd);

		if(cp.CnfrmErrorMessage().toString().equalsIgnoreCase("Passwords do not match"))
		{
			mp.logout();
			Assert.assertTrue(true);
		}else {
			mp.logout();
			Assert.assertTrue(false);
		}
		
		}catch (Exception e) {
			mp.logout();
			Assert.fail();
		}
		
		logger.info("...Finished verifyConfirmErrorMessage...");
		
	}
	
	@Test(dataProvider="mismatchcurrentpassword", groups="Login", dataProviderClass = DataProviders.class, priority = 2)
	public void verifyCurrentErrorMessage(String crntpswrd, String nwpswrd, String cnfrmpswrd) {
		
		try {
			
		logger.info("...Starting verifyCnfmrmErrorMessage...");
		mp.chngePsword();
		
		cp.insrtCrntPsword(crntpswrd);
		cp.insrtnewPsword(nwpswrd);
		cp.insrtcnfirmPsword(cnfrmpswrd);
		//System.out.print("before save");
		cp.svePsword();
		//System.out.print("after save");
		if(cp.CrrntErrorMessage().toString().equalsIgnoreCase("Current Password is Incorrect"))
		{
			mp.logout();
			Assert.assertTrue(true);
		}else {
			mp.logout();
			Assert.assertTrue(false);
		}
		
		}catch (Exception e) {
			mp.logout();
			Assert.fail();
		}
		
		logger.info("...Finished verifyCrrntErrorMessage...");
		
	}
}
