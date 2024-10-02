package Util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseTTest;

public class ElementFetch {
	public WebElement getWebElement(String idetifierType ,String identifierValue) {
		
		switch(idetifierType) {
			case "ID":
			return BaseTTest.driver.findElement(By.id(identifierValue));
			case "CSS":
				return BaseTTest.driver.findElement(By.cssSelector(identifierValue));
			case "NAME":
				return BaseTTest.driver.findElement(By.name(identifierValue));
			case "XPATH":
				return BaseTTest.driver.findElement(By.xpath(identifierValue));
				default:
					return null;
		
	}
	}
	
public List<WebElement> getWebElements(String idetifierType ,String identifierValue) {
		
		switch(idetifierType) {
			case "ID":
			return BaseTTest.driver.findElements(By.id(identifierValue));
			case "CSS":
				return BaseTTest.driver.findElements(By.cssSelector(identifierValue));
			case "NAME":
				return BaseTTest.driver.findElements(By.name(identifierValue));
			case "XPATH":
				return BaseTTest.driver.findElements(By.xpath(identifierValue));
				default:
					return null;
		
	}
	}
	

}
