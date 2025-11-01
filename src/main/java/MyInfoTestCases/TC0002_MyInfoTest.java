package MyInfoTestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBases.BaseClass;

public class TC0002_MyInfoTest extends BaseClass{
	
	@BeforeMethod (groups="MyInfo")
	public void MyInfoTestlogin() {
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		myp.gotopersonalTab();
	}
	
	@Test(priority=1,groups="MyInfo")
	public void changeadminname() throws InterruptedException {
		logger.info("...Starting TC0002_MyInfoTEST_changename...");
		try {
		
		mpp.setName("Ahmad", "Albab", "Azman");
		mpp.svePrsonal();
		Thread.sleep(Duration.ofMillis(1000));
		mpp.takeScreenshot("changeadminname");
		mp.logout();
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		
		logger.info("..Finished TC0002_MyInfoTEST_changename..");
		}
	
	@Test(priority=2,groups="MyInfo")
	public void changeLicenseDate() throws InterruptedException {
		logger.info("...Starting TC0002_MyInfoTEST_changelicensedate...");
	
		try {
		
		//Change licensedata
		mpp.clickLicense();
		mpp.setLicenseDate("11","September","2011");
		Thread.sleep(Duration.ofMillis(1000));
		mpp.svePrsonal();
		mpp.takeScreenshot("changeLicenseDate");
		mp.logout();
		Assert.assertTrue(true);
		
		}catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		logger.info("...Finished TC0002_MyInfoTEST_changelicensedate...");
	}
	
	@Test(priority=3,groups="MyInfo")
	public void changenationality() throws InterruptedException {
		logger.info("...Starting TC0002_MyInfoTEST_changeNationality...");	
		try {
			
		//Change nationality
		mpp.changeNationality("Japanese");
		mpp.svePrsonal();
		Thread.sleep(Duration.ofMillis(2000));
		mpp.takeScreenshot("changenationality");
		mp.logout();
		Assert.assertTrue(true);
		
		}
		catch(Exception e) {
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		logger.info("...Finished TC0002_MyInfoTEST_changeNationality...");
	}
	
	@Test(priority=4,groups="MyInfo")
	public void setGender() throws InterruptedException {
		logger.info("...Starting TC0002_MyInfoTEST_changeGender..");
		
		try {
			
		mpp.setGnder("male");
		mpp.svePrsonal();
		mpp.takeScreenshot("setGender");
		Thread.sleep(Duration.ofMillis(1000));
		mp.logout();
		Assert.assertTrue(true);
		
		}
		catch(Exception e) 
		{
			logger.error("Test failed..");
			logger.debug("Debug logs..");
			Assert.assertTrue(false);
		}
		
		logger.info("...Finished TC0002_MyInfoTEST_changeGender..");
	}
	

}
