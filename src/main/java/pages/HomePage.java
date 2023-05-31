package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.ElementUtil;

public class HomePage {
	private WebDriver driver ;
	private ElementUtil elementUtil ;
	
	public HomePage(WebDriver driver) {
		this.driver = driver ;
		elementUtil = new ElementUtil(driver) ;
	}

	private WebElement getHeaderElement(String headerValue) {
		String headerElementXpath = "//a[contain(text() , '" +headerValue + "')]" ;
		return elementUtil.getElement("xpath" , headerElementXpath); 
	}
	
	public boolean isHeaderExists(String headerValue) {
		String header = getHeaderElement(headerValue).getText();
		System.out.print(header);
		return getHeaderElement(headerValue).isDisplayed() ;
	}
	private WebElement getContactEle(String contactValue) {
		String contactXpathValue = "//a[contain(text() ,'"+contactValue+"')]" ;
		return  elementUtil.getElement("xpath" , contactXpathValue) ;
	}
	
	public boolean isContatExists(String contactValue) {
		String contact = getHeaderElement(contactValue).getText() ;
		System.out.println(contactValue);
		return getContactEle(contactValue).isDisplayed() ;
	}
}
