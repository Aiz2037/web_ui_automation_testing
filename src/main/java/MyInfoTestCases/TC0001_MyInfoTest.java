package MyInfoTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBases.BaseClass;


public class TC0001_MyInfoTest extends BaseClass{
	
	@Test(priority =1,groups="MyInfo")
	public void navigatePrsnlPage() {
		
		logger.info("...Starting TC0001_MyInfoTEST...");
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		logger.info("...Starting navigate to person page...");
		if(myp.validateprsnltitle().toString().equalsIgnoreCase("Personal Details")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to person page...");
	}
	
	@Test(priority =2,groups="MyInfo")
	public void navigateCntctPge() {
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate contact page...");
		if(myp.validatecntctitle().toString().equalsIgnoreCase("Contact Details")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to contact page...");
	}
	
	@Test(priority =3,groups="MyInfo")
	public void navigateEmrgncyPge() {
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate emergency page...");
		if(myp.validateemrgncytitle().toString().equalsIgnoreCase("Assigned Emergency Contacts")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to emergency page...");
	}
	
	@Test(priority =4,groups="MyInfo")
	public void navigateDependantPge() 
	{
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate dependant page...");
		if(myp.validatedpndnttitle().toString().equalsIgnoreCase("Assigned Dependents")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to dependant page...");
	}
	
	
	@Test(priority =5,groups="MyInfo")
	public void navigateImigrationPge() 
	{
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate immigration page...");
		if(myp.validateimgrtiontitle().toString().equalsIgnoreCase("Assigned Immigration Records")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to immigration page...");
	}
	
	@Test(priority =6,groups="MyInfo")
	public void navigateJobPge() 
	{
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate Job page...");
		if(myp.validateJobtitle().toString().equalsIgnoreCase("Job Details")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to Job page...");
	}
	
	@Test(priority=7,groups="MyInfo")
	public void navigateSalaryPge() 
	{
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate Salary page...");
		if(myp.validateSalarytitle().toString().equalsIgnoreCase("Assigned Salary Components")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to Salary page...");
	}
	
	@Test(priority=10,groups="MyInfo")
	public void navigateReportPge() 
	{
	
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		System.out.print("luar report");
		logger.info("...Starting navigate Report page...");
		if(myp.validateReporttitle().toString().equalsIgnoreCase("Report to")) 
		{
			
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to Report page...");
	}
	
	
	@Test(priority=9,groups="MyInfo")
	public void navigateQualificationPge() throws InterruptedException 
	{
	
		Thread.sleep(2000);
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate qualification page...");
		if(myp.validateQualfctiontitle().toString().equalsIgnoreCase("Qualifications")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to qualification page...");
		
	}
	
	@Test(priority=8,groups="MyInfo")
	public void navigateMmbershipPge() throws InterruptedException 
	{
		Thread.sleep(2000);
		lp.insrtUsrNme(p.getProperty("username"));	
		lp.insrtpssWrd(p.getProperty("password"));
		lp.clckLoginButton();
		myp.nvgtetoMyInfoPage();
		logger.info("...Successfully navigate to MyInfoPage...");
		
		logger.info("...Starting navigate Mmbership page...");
		if(myp.validateMmbershiptitle().toString().equalsIgnoreCase("Assigned Memberships")) 
		{
			mp.logout();
			Assert.assertTrue(true);
		}
		else 
		{
			mp.logout();
			Assert.assertTrue(false);
		}
		
		logger.info("...Finsihed navigate to Mmbership page...");
	}
	
}
