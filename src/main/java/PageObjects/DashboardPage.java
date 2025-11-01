package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//p[normalize-space()='Time at Work']")
	WebElement time;
	
	@FindBy(xpath="//p[normalize-space()='My Actions']")
	WebElement actions;
	
	@FindBy(xpath="//p[normalize-space()='Quick Launch']")
	WebElement launch;
	
	@FindBy(xpath="//p[normalize-space()='Buzz Latest Posts']")
	WebElement buzz;
	
	@FindBy(xpath="//p[normalize-space()='Employees on Leave Today']")
	WebElement onleave;
	
	@FindBy(xpath="//p[normalize-space()='Employee Distribution by Sub Unit']")
	WebElement subUnit;
	
	@FindBy(xpath="//p[normalize-space()='Employee Distribution by Location']")
	WebElement location;
	
	public String extractTimetitle() {
		
	String title = time.getText();
	System.out.print(title);
	return title;
		
	}
	
	public String extractactiontitle() {
		
		String title = actions.getText();
		System.out.print(title);
		return title;
		
	}
	
	public String extractlaunchtitle() {
		
		String title = launch.getText();
		System.out.print(title);
		return title;
		
	}
	
	public String extractbuzztitle() {
		
		String title = buzz.getText();
		System.out.print(title);
		return title;
		
	}
	
	public String extractonleave() {
		
		String title = onleave.getText();
		System.out.print(title);
		return title;
		
	}
	
	public String extractsubunit() {
		
		String title = subUnit.getText();
		System.out.print(title);
		return title;
		
	}
	
	public String extractlocation() {
		
		String title = location.getText();
		System.out.print(title);
		return title;
		
	}
	
}
