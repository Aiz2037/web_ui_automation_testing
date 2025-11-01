package MyInfoTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBases.BaseClass;

public class TC0003_MyInfoTest extends BaseClass {

	@BeforeMethod(groups="MyInfo")
	public void login() throws InterruptedException {
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		
		myp.nvgtetoMyInfoPage();
		myp.gotopersonalTab();
		
		mpp.clickLicense();
		
	}
	@Test(priority=1,groups="MyInfo")
	public void verifycalendarmonthlicense() throws InterruptedException {
		
		try {
		
		logger.info("...Starting TC0003_MyInfoTEST_verifycalendarmonthlicense..");
		
		boolean status = mpp.comparelicensemonths();
		if(status==true) {
			mp.logout();
			Assert.assertTrue(true);
		}else {
			mp.logout();
			Assert.fail();
		}
		}catch(Exception e) {
			mp.logout();
			Assert.assertTrue(false);
		}
		logger.info("..Finished TC0003_MyInfoTEST_verifycalendarmonthlicense..");
	}
	
	@Test(priority=2,groups="MyInfo")
	public void verifyyearlicense() {
		
		try {
			
			logger.info("...Starting TC0003_MyInfoTEST_verifycalendaryearlicense..");
			
			boolean status = mpp.comparelicenseyear();
			System.out.print(status);
			if(status==true) {
				mp.logout();
				Assert.assertTrue(true);
			}else {
				mp.logout();
				Assert.fail();
			}
			}catch(Exception e) {
				mp.logout();
				Assert.assertTrue(false);
			}
			logger.info("..Finished TC0003_MyInfoTEST_verifycalendaryearlicense..");
	}
}
