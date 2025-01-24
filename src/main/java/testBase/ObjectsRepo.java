package testBase;

import org.openqa.selenium.WebDriver;



import PageObjects.CheckOutPage;
import PageObjects.HomePage;
import PageObjects.ResultDetailPage;
import PageObjects.SaveCardPage;
import PageObjects.SearchedResultPage;


import reusableComponents.CommonMethod;

public class ObjectsRepo {
	
	public static WebDriver driver;
	public CommonMethod cm=new CommonMethod();
	
	public static HomePage homepage;
	public static SearchedResultPage searchResultPage;
	public static ResultDetailPage resultDetailPage;
	public static CheckOutPage checkOutPage;
	public static SaveCardPage saveCardPage;
	
}
