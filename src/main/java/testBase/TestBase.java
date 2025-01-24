package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import PageObjects.CheckOutPage;
import PageObjects.HomePage;
import PageObjects.ResultDetailPage;
import PageObjects.SaveCardPage;
import PageObjects.SearchedResultPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponents.PropertyOperations;

public class TestBase extends ObjectsRepo {

	@BeforeMethod
	public static void setUp() throws Exception {

		String browser = PropertyOperations.getPropertyByKeys("browser");
		String url = PropertyOperations.getPropertyByKeys("url");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get(url);
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} 
	else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}

	public void setupMethod() throws Exception {
		setUp();

		homepage = new HomePage();
		searchResultPage = new SearchedResultPage();
		resultDetailPage = new ResultDetailPage();
		checkOutPage = new CheckOutPage();
		saveCardPage = new SaveCardPage();
	}

	

}
