package DashboardTestCase;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestBases.BaseClass;

@Listeners(Utilities.ExtentReportManager.class)

public class TC0001_DashboardTest extends BaseClass{
	
	@BeforeMethod (groups="Dashboard")
	public void login()
	{	
		lp.insrtUsrNme(p.getProperty("username"));
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		mp.nvigatedshboard();
	} 
	
	
	@Test (priority =1, groups="Dashboard")
	public void verifytimeTitle() throws InterruptedException  {
		logger.info("..StartingTC0001_dshboardTest_veriftimetitle..");
		try {

		if (dp.extractTimetitle().toString().equalsIgnoreCase("Time at Work"))
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		}
		catch(Exception e) {
			mp.logout();
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
		logger.info("..Finished TC0001_dshboardTest_veriftimetitle..");
	} 
	
	@Test(priority =2, groups="Dashboard")
	public void verifyactionTitle() {
	
		try {
			
		if (dp.extractactiontitle().contentEquals("My Actions")) 
		{
			mp.logout();
			Assert.assertTrue(true);
			
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
			
		}
		}catch(Exception e) {
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
	}
	
	@Test (priority =3, groups="Dashboard")
	public void verifylaunchTitle() {
		
		try {

		if (dp.extractlaunchtitle().contentEquals("Quick Launch")) 
		{
			mp.logout();
			Assert.assertTrue(true);
			
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
			
		}
		}catch(Exception e) {
			mp.logout();
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
		
		logger.info("....verifyLaunchTitle finished......");
		
	}
	
	@Test(priority =4, groups="Dashboard")
	public void verifyBuzzTitle() {
		try {
	
		if (dp.extractbuzztitle().contentEquals("Buzz Latest Posts")) 
		{
			mp.logout();
			Assert.assertTrue(true);
			
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
			
		}
		}catch(Exception e) {
			mp.logout();
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
		
	}
	
	@Test(priority =5, groups="Dashboard")
	public void verifyOnleaveTitle() {
		try {

		if (dp.extractonleave().contentEquals("Employees on Leave Today")) 
		{
			mp.logout();
			Assert.assertTrue(true);
			
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
			
		}
		}catch(Exception e) {
			mp.logout();
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
		
		logger.info("....verifyonleaveTitle finished......");
		
	}
	
	@Test (priority = 6, groups="Dashboard")
	public void verifysubunitTitle() {
		try {

		if (dp.extractsubunit().contentEquals("Employee Distribution by Sub Unit")) 
		{
			mp.logout();
			Assert.assertTrue(true);	
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
			
		}
		}catch(Exception e) {
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
		
		logger.info("....verifysubunitTitle finished......");
		
	}
	
	@Test(priority =7, groups="Dashboard")
	public void verifylocationTitle() {
		try {

		if (dp.extractlocation().contentEquals("Employee Distribution by Location")) 
		{
			mp.logout();
			Assert.assertTrue(true);
			
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
			
		}
		}catch(Exception e) {
			mp.logout();
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
			
		}
	}
}
