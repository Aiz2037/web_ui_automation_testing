package PageObjects;


import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MIP_PersonalPage extends BasePage{
	
	Actions act = new Actions(driver);
	
	public MIP_PersonalPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath = "//ul[@class='oxd-calendar-selector']/li[@class='oxd-calendar-selector-month']/div[@class='oxd-calendar-selector-month-selected']/p")
	WebElement drpdwnlicensemonth;
	
	@FindBy(xpath = "//ul[@class='oxd-calendar-selector']/li[@class='oxd-calendar-selector-year']/div[@class='oxd-calendar-selector-year-selected']/p")
	WebElement drpdwnlicenseyear;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/i[1]")
	WebElement licenseDate;
	
	/*@FindBy(xpath="(//input[@placeholder='dd-mm-yyyy'])[1]")
	WebElement licenseDate;*/
	
	@FindBy(xpath="//ul[@role='menu']/li[@class='oxd-calendar-dropdown--option' or @class='oxd-calendar-dropdown--option --selected']")
	List<WebElement> monthyearlist;
	
	@FindBy(xpath="//div[@class='oxd-calendar-dates-grid']/div/div[@class='oxd-calendar-date']")
	List<WebElement> daylist;
	
	@FindBy(xpath="(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement bttnsveprsonal;
	
	@FindBy(xpath="//label[normalize-space()='Employee Full Name']")
	WebElement fullname;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	WebElement middlename;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement nationality;
	
	@FindBy(xpath="//div[@role='listbox']/div[@class='oxd-select-option']")
	List<WebElement> listNations;
	
	@FindBy(xpath="//label[normalize-space()='Male']")
	WebElement genderMale;
	
	@FindBy(xpath="//label[normalize-space()='Female']")
	WebElement genderFemale;
	
	public void clickLicense() throws InterruptedException 
	{
		act.moveToElement(licenseDate).click().build().perform();
		Thread.sleep(Duration.ofMillis(1500));	
	}
	
	
	public boolean comparelicensemonths() throws InterruptedException {
		
		act.scrollToElement(drpdwnlicensemonth).moveToElement(drpdwnlicensemonth).click().build().perform();
		Thread.sleep(Duration.ofMillis(1000));
		
		String listmonths[] = new String[monthyearlist.size()];
		
		for(int i=0; i<monthyearlist.size(); i++)
		{
			listmonths[i]= monthyearlist.get(i).getText();
			System.out.print(listmonths[i]);
		}
		
		String comparemonths[] = {"January","February","March","April","May","June", "July", "August","September","October","November","December"};
		
		if(Arrays.equals(listmonths, comparemonths)) {
			return true;
		}else 
		{
			return false;
		}
			
	}
	
	public boolean comparelicenseyear() throws InterruptedException {
		
		act.scrollToElement(drpdwnlicenseyear).moveToElement(drpdwnlicenseyear).click().build().perform();
		Thread.sleep(Duration.ofMillis(1000));
		
		String listyears[] = new String[monthyearlist.size()];
		System.out.print(monthyearlist.size());
		
		for(int i=0; i<monthyearlist.size(); i++)
		{
			listyears[i]= monthyearlist.get(i).getText().toString();
		}
		
		String compareyears[] = listyears.clone();
		
		if(Arrays.equals(listyears, compareyears)) {
			return true;
		}else 
		{
			return false;
		}
			
	}
	
	public void svePrsonal() throws InterruptedException {
		
		act.scrollToElement(bttnsveprsonal).perform();
		Thread.sleep(Duration.ofMillis(2000));
		wait.until(ExpectedConditions.elementToBeClickable(bttnsveprsonal)).click();
		Thread.sleep(Duration.ofMillis(2000));
	}

	
	public void setName(String first, String middle, String last) throws InterruptedException {
		
		Thread.sleep(Duration.ofMillis(2500));
		act.moveToElement(firstname).doubleClick().click().perform();
		Thread.sleep(Duration.ofMillis(2000));
		act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		firstname.sendKeys(first);
		
		Thread.sleep(Duration.ofMillis(2500));
		act.moveToElement(middlename).doubleClick().click().perform();
		Thread.sleep(Duration.ofMillis(2000));
		act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		middlename.sendKeys(middle);
		
		Thread.sleep(Duration.ofMillis(2500));
		act.moveToElement(lastname).doubleClick().click().perform();
		Thread.sleep(Duration.ofMillis(2000));
		act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		lastname.sendKeys(last);
		
	}

	
	public void setMonth(String month) throws InterruptedException 
	{
		
		act.scrollToElement(drpdwnlicensemonth).moveToElement(drpdwnlicensemonth).click().build().perform();
		Thread.sleep(Duration.ofMillis(1000));
		
		//String listmonths[] = new String[licensemonth.size()];
		
		for(int i=0; i<monthyearlist.size(); i++)
		{
			if(	monthyearlist.get(i).getText().equals(month)) 
			{
				monthyearlist.get(i).click();
				break;
			}
		}
		
	}
	
	public void setYear(String year) throws InterruptedException 
	{
		act.scrollToElement(drpdwnlicenseyear).moveToElement(drpdwnlicenseyear).click().build().perform();
		Thread.sleep(Duration.ofMillis(1000));
		
		for(int i=0; i<monthyearlist.size(); i++)
		{
			if(monthyearlist.get(i).getText().equals(year)) 
			{
				monthyearlist.get(i).click();
				break;
			}
		}
		
	}

	public void setDay(String day) throws InterruptedException {
		//act.moveToElement(daylist);
		Thread.sleep(Duration.ofMillis(1000));
		//System.out.print(daylist.size()+'\n');
		
		for(int i=0;i<daylist.size();i++) {
			//System.out.print(daylist.get(i).getText());
			if(daylist.get(i).getText().equals(day)) {
				
				act.moveToElement(daylist.get(i)).click().build().perform();
				Thread.sleep(Duration.ofMillis(2000));
				break;
			}
		}
	}

	public void changeNationality(String country) throws InterruptedException {

		Thread.sleep(Duration.ofMillis(1000));
		act.scrollToElement(nationality).moveToElement(nationality).click().build().perform();
		//System.out.print(listNations.size());
		for(int i=0;i<listNations.size();i++) {
			
			if(listNations.get(i).getText().toString().equals(country)) {
				//System.out.print(listNations.get(i));
				act.scrollToElement(listNations.get(i)).moveToElement(listNations.get(i)).click(listNations.get(i)).build().perform();
				//listNations.get(i).click();
				Thread.sleep(Duration.ofMillis(2000));
				break;
				
			}
		}
		
	}

	public void setLicenseDate(String day, String month, String year) throws InterruptedException {
		
		setMonth(month);
		setYear(year);
		setDay(day);

	}
	
	public void setGnder(String gender) throws InterruptedException {
		
		switch(gender) {
		case "male":
			Thread.sleep(Duration.ofMillis(1000));
			wait.until(ExpectedConditions.elementToBeClickable(genderMale)).click();
			break;
		
		case "female":
			Thread.sleep(Duration.ofMillis(1000));
			wait.until(ExpectedConditions.elementToBeClickable(genderFemale)).click();
			break;
		}
		
		
	}
	
	public void takeScreenshot(String scrnshot) throws InterruptedException 
	{
		WebElement scrnshotlocation = null;
		
		switch(scrnshot) 
		{
		case "changeadminname": scrnshotlocation = fullname; break;
		case "changeLicenseDate": scrnshotlocation= licenseDate; break;
		case "changenationality": scrnshotlocation= nationality; break;
		case "setGender": scrnshotlocation = genderMale; break;
		}
		
		act.scrollToElement(scrnshotlocation).moveToElement(scrnshotlocation).build().perform();
		
		Thread.sleep(Duration.ofMillis(2000));
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		//File sourcefile =  filename.getScreenshotAs(OutputType.FILE);
		File sourcefile =  ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Users\\ahmad\\eclipse-workspace\\OrangeHRM\\screenshotresult\\"+scrnshot+"_"+timestamp+".png");
		sourcefile.renameTo(targetfile); 
		
	}
}



