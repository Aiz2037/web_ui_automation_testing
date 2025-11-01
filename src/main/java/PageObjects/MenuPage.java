package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MenuPage extends BasePage{
	
	public MenuPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
	WebElement dshBoard;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement drpdwn;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement lgout;
	
	@FindBy(xpath="//a[normalize-space()='Change Password']")
	WebElement chngePsword;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
	WebElement dshboardBtn;
	
	public boolean verifyMenuPage() {
		boolean dshBoardExist = dshBoard.isDisplayed();
		return dshBoardExist;
		
	}
	public void chngePsword() {
		drpdwn.click();
		chngePsword.click();
		
	}
	public void logout() {
		drpdwn.click();
		lgout.click();
	}
	
	public void nvigatedshboard() {
		dshboardBtn.click();
	}
	
	
}
