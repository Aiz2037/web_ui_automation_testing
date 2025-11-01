package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
		
	public LoginPage(WebDriver driver){
		
		super(driver);
	
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement usrNme;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pssWrd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement bttn;
	
	@FindBy(xpath="//div[@class='orangehrm-login-branding']")
	WebElement logo;
	
	public void insrtUsrNme(String UsrNme) {
		
		usrNme.sendKeys(UsrNme);	
	}
	
	public void insrtpssWrd(String UsrNme) {
		pssWrd.sendKeys(UsrNme);	
	}
	
	public void clckLoginButton() {
		
		bttn.click();
	}
	
	public boolean isLogoExist() {
		boolean logosttus = logo.isDisplayed();
		return logosttus;
	}
	
}
