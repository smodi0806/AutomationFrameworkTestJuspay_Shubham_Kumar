package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//*[text()='All Categories']")
	WebElement dd_type;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement txt_search;
	
	@FindBy(id="nav-search-submit-button")
	WebElement btn_search;
	
	@FindBy(xpath="//*[text()='Hello, sign in']")
	WebElement sign_Link;
	
	@FindBy(xpath="//span[text()='Sign in']")
	WebElement sign_Btn;
	
	@FindBy(id="ap_email_login")
	WebElement txt_MobileNumber;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement btn_Continue;
	
	@FindBy(name="password")
	WebElement txt_Passward;
	
	@FindBy(id="signInSubmit")
	WebElement btn_SignIn;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void HomePageSetup() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(sign_Link).click();
		sign_Btn.click();
		txt_MobileNumber.sendKeys("8804954964");
		btn_Continue.click();
		txt_Passward.sendKeys("Frndsrlife@0806");
		btn_SignIn.click();
		cm.selectDropdownOption(dd_type, "Electronics"); 
		Thread.sleep(1000);
		txt_search.sendKeys("ipad 11gen");
		Thread.sleep(1000);
		btn_search.click();
		
	}
	
	
}
