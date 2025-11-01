package PageObjects;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChangePasswordPage extends BasePage {
	
	public ChangePasswordPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']" )
	WebElement crntPsword;
	
	@FindBy(xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement newPsword;
	
	@FindBy(xpath = "//div[@class='oxd-form-row user-password-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement cnfirmPsword;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savePsword;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cncel;
	
	@FindBy(xpath = "//span[normalize-space()='Should have at least 7 characters']")
	WebElement newPswrdError;
	
	/*@FindBy(xpath = "//span[normalize-space()='Passwords do not match']")
	WebElement cnfrmPswrdError;*/
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	WebElement cnfrmPswrdError;
	
	@FindBy(xpath = "//p[normalize-space()='Current Password is Incorrect']")
	WebElement crrntPswrdError;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
	WebElement sveerroralert;
	
	public void insrtCrntPsword(String pwd1) { //kene declare public else wont detect when create object at test page
		crntPsword.sendKeys(pwd1);
	}
	
	public void insrtnewPsword(String pwd2) {
		newPsword.sendKeys(pwd2);
	}
	
	public void insrtcnfirmPsword(String pwd3) {
		cnfirmPsword.sendKeys(pwd3);
	}
	
	public void clrcrntpssword() {
		crntPsword.clear();
	}
	
	public void clrnewPsword() {
		newPsword.clear();
	}
	
	public void clrcnfrmPsword() {
		cnfirmPsword.clear();
	}
	
	public String CnfrmErrorMessage(){	
	//String script = "function chkstts(){try{Stts=window.getComputedStyle(document.getElementsByClassName('oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message')[1]).visibility;return Stts;} catch (error) {Stts='invisible';return Stts;} }return chkstts(); ";
	//String script = "function chkstts(){try{Stts=window.getComputedStyle(document.getElementsByClassName('oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message')[1]).visibility;return Stts;} catch (error) {Stts='invisible';return Stts;} } function writeconsole(){return console.log(chkstts());} writeconsole();";
	/*String script1= "function chkstts(){try{Stts=window.getComputedStyle(document.getElementsByClassName('oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message')[1]).visibility;return Stts;} catch (error) {Stts='invisible';return Stts;}}"
			+ "document.body.innerHTML += '<div style=\"display:none;\" id=\"stts\">' + chkstts() + '</div>';"
			+ "function rslt(){return document.getElementById('stts').innerHTML;} rslt();"; */
	//String script = "return document.getElementsByClassName(\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\").item(1).getText();";
	//String err = (String) js.executeScript(script);
	//System.out.print(err);
	String error = cnfrmPswrdError.getText();
	System.out.print(error);
	return error;
	
	}
	
	public String CrrntErrorMessage(){	
		
		String error = crrntPswrdError.getText();
		System.out.print(error);
		return error;
		
		}
	
	public String NewPswrdErrorMessage() {
		//newPswr
		return "OK";
	}
	
	public String svePsword() {
		savePsword.click();
		WebElement errmsg = wait.until(ExpectedConditions.visibilityOf(sveerroralert));
		String msg = errmsg.getText();
		System.out.print(msg);
		return msg.toString();	
	}
	
	public void clickCncel() {
		cncel.click();
	}
	
}

