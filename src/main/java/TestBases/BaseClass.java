package TestBases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObjects.ChangePasswordPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import PageObjects.MIP_PersonalPage;
import PageObjects.MenuPage;
import PageObjects.MyInfoPage;


public class BaseClass 
{

	public Properties p;
	public WebDriver driver;
	public LoginPage lp;   //declare mcm ni supaya child boleh access
	public MenuPage mp;	   //declare mcm ni supaya child boleh access
	public Logger logger;
	public ChangePasswordPage cp;
	public DashboardPage dp;
	public MyInfoPage myp;
	public MIP_PersonalPage mpp;
	
	@BeforeClass (groups = {"Dashboard", "Login", "MyInfo"})
	public void setup() throws IOException, InterruptedException {
		
		logger = LogManager.getLogger(this.getClass());
		FileReader file = new FileReader("./src//test//resources//configuration.properties");
		p=new Properties();
		p.load(file);
		
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.get(p.getProperty("hrmlink"));
		
		lp = new LoginPage(driver);
		mp = new MenuPage(driver);
		cp = new ChangePasswordPage(driver);
		dp = new DashboardPage(driver);
		myp = new MyInfoPage(driver);
		mpp= new MIP_PersonalPage(driver);

		Thread.sleep(Duration.ofMillis(3000));
	}
	
	@AfterClass(groups = {"Dashboard", "Login", "MyInfo"})
	public void teardown(){

		driver.quit();
	}
	
	
}

