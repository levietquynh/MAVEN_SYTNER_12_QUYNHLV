package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class FerrariPageObject extends AbstractPage{
	private WebDriver driver;

	public FerrariPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
