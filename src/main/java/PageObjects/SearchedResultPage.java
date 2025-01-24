package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SearchedResultPage extends TestBase{
	
	@FindBy(xpath="//span[text()='Apple iPad (10th Generation): with A14 Bionic chip, 27.69 cm (10.9″) Liquid Retina Display, 64GB, Wi-Fi 6, 12MP front/12MP Back Camera, Touch ID, All-Day Battery Life – Blue']")
	WebElement firstResult_img;
	

	
	public SearchedResultPage() {
		PageFactory.initElements(driver, this);
	}
	public void SearchedResultSetup()
	{
		firstResult_img.click();
	}
}
