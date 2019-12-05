package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class SmartPageObject extends AbstractPage{
	private WebDriver driver;

	public SmartPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
