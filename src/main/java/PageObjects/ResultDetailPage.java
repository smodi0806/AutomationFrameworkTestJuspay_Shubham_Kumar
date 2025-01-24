package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ResultDetailPage extends TestBase{
	@FindBy(id="buy-now-button")
	WebElement btn_BuyNow;
	
	public ResultDetailPage() {
		PageFactory.initElements(driver, this);
	}
	public void ResultDetailSetup()
	{
		btn_BuyNow.click();
	}
}
