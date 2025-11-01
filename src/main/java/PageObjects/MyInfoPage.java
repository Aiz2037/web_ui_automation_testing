package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyInfoPage extends BasePage{
	
	
	public MyInfoPage(WebDriver driver) {
		super(driver);
	}
	
	Actions act = new Actions(driver);
	
	//tab
	@FindBy(xpath = "//a[normalize-space()='Personal Details']")
	WebElement prsnlDetailsTab;
	
	@FindBy(xpath = "//a[normalize-space()='Contact Details']")
	WebElement cntctDetailsTab;
	
	@FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
	WebElement emrgencyTab;
	
	@FindBy(xpath = "//a[normalize-space()='Dependents']")
	WebElement dependantTab;
	
	@FindBy(xpath = "//a[normalize-space()='Immigration']")
	WebElement immigrationTab;
	
	@FindBy(xpath = "//a[normalize-space()='Job']")
	WebElement jobTab;
	
	@FindBy(xpath = "//a[normalize-space()='Salary']")
	WebElement salaryTab;
	
	@FindBy(xpath = "//a[normalize-space()='Report-to']")
	WebElement reportToTab;
	
	@FindBy(xpath = "//a[normalize-space()='Qualifications']")
	WebElement qualificationTab;
	
	@FindBy(xpath = "//a[normalize-space()='Memberships']")
	WebElement mmbershipTab;
	
	//Page title
	@FindBy(xpath = "//h6[normalize-space()='Personal Details']")
	WebElement prsnltitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Contact Details']")
	WebElement cntcttitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Assigned Emergency Contacts']")
	WebElement emrgncytitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Assigned Dependents']")
	WebElement dpndnttitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Assigned Immigration Records']")
	WebElement imgrtiontitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Job Details']")
	WebElement jbdtailstitle;

	@FindBy(xpath = "//h6[normalize-space()='Assigned Salary Components']")
	WebElement slrytitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Report to']")
	WebElement rprttitle;
	
	@FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-top-padding']/h6[normalize-space()='Qualifications']")
	WebElement qualfctiontitle;
	
	@FindBy(xpath = "//h6[normalize-space()='Assigned Memberships']")
	WebElement mmbrshiptitle;
	
	@FindBy(xpath = "//span[normalize-space()='My Info']")
	WebElement svgMyInfoPage;
	
	public void gotopersonalTab() {
		prsnlDetailsTab.click();
	}
	
	public String validateprsnltitle() {
		
		return prsnltitle.getText();
	}
	
	public String validatecntctitle() {
		cntctDetailsTab.click();
		return cntcttitle.getText();
	}
	
	public String validateemrgncytitle() {
		emrgencyTab.click();
		return emrgncytitle.getText();
	}
	
	public String validatedpndnttitle() {
		dependantTab.click();
		return dpndnttitle.getText();
	}
	
	public String validateimgrtiontitle() {
		immigrationTab.click();
		return imgrtiontitle.getText();
	}
	
	public String validateJobtitle() {
		jobTab.click();
		return jbdtailstitle.getText();
	}
	
	public String validateSalarytitle() {
		salaryTab.click();
		return slrytitle.getText();
	}
	
	public String validateReporttitle() {
		act.scrollToElement(reportToTab).moveToElement(reportToTab).click().build().perform();
		//reportToTab.click();
		return rprttitle.getText();
	}
	
	public String validateQualfctiontitle() {
		
		act.scrollToElement(qualificationTab).moveToElement(qualificationTab).click().build().perform();
		//qualfctiontitle.click();
		return qualfctiontitle.getText().toString();
	}
	
	public String validateMmbershiptitle() {
		mmbershipTab.click();
		return mmbrshiptitle.getText();
	}
	
	public void nvgtetoMyInfoPage() {
		wait.until(ExpectedConditions.visibilityOf(svgMyInfoPage)).click();
	}
}
