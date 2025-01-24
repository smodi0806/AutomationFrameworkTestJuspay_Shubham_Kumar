package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class CheckOutPage extends TestBase {
	@FindBy(id="pp-qSgFpo-213")
	WebElement radioBtn_CreditDebitCard;
	
	@FindBy(xpath = "(//img[@class='apx-add-pm-trigger-common-image'])[1]")
	WebElement addCard_link;
	
	@FindBy(id="orderSummaryPrimaryActionBtn-announce")
	WebElement useThisPaymentMethod;
	
	@FindBy(name = "placeYourOrder1")
	WebElement btn_PlaceYourOrder;
	
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SetUpCheckOut()
	{
		radioBtn_CreditDebitCard.click();
		useThisPaymentMethod.click();
	}
}
