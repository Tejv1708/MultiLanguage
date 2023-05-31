package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public WebElement getElement(String locatorName, String locatorValue) {
		return driver.findElement(getBy(locatorName , locatorValue));
	}

	public By getBy(String locatorName, String locatorValue) {
		By locator = null;
		switch (locatorName.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		case "name":
			locator = By.name(locatorValue);
			break;
			
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
			
		case "css":
			locator = By.cssSelector(locatorValue);
			break;
			
		case "link":
			locator = By.linkText(locatorValue);
			break;
			
			default :
				break ;
			
		}
		return locator;
	}
}
