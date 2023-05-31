package mytests;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Factory.DriverFactory;
import configReader.ConfigPropReader;
import pages.HomePage;

public class HomePageTest {

	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;
	WebDriver driver;
	HomePage homePage;

	@BeforeTest
	public void setup() throws FileNotFoundException {
		cp = new ConfigPropReader();
		prop = cp.initLangProp("french");
		df = new DriverFactory();
		driver = df.intiDriver("chrome", prop);
		homePage = new HomePage(driver);
	}

	@Test
	public void headerTest() {
		try {
		Assert.assertTrue(homePage.isHeaderExists(prop.getProperty("header")));
		}
		catch(Exception e ) {
			System.out.print(e);
		}
	}

	@Test
	public void contactFooterTest() { 
		try {
		Assert.assertTrue(homePage.isContatExists(prop.getProperty("contact")));
		}catch(Exception e) {
			System.out.println(e) ;
		}
		}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
