package endToEndTest;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.TestBase;


public class PaymentSetup extends TestBase{
	@Test
	public void paymentSetUp() throws InterruptedException {
		homepage.HomePageSetup();
		searchResultPage.SearchedResultSetup();
		resultDetailPage.ResultDetailSetup();
		checkOutPage.SetUpCheckOut();
	}
	
}
