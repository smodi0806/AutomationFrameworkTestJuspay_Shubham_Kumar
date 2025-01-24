package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SaveCardPage extends TestBase {
	@FindBy(id="pp-Nz8MU6-16")
	WebElement cardNumber;
	
	@FindBy(id = "pp-Nz8MU6-18")
	WebElement addCard_link;
	
	/*
	 * @FindBy(id = "")
	 * 
	 * @FindBy()
	 * 
	 * @FindBy()
	 * 
	 * @FindBy()
	 */
	
	
	public SaveCardPage() {
		PageFactory.initElements(driver, this);
	}
}
