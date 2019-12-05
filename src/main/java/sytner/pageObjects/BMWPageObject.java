package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class BMWPageObject extends AbstractPage{
	private WebDriver driver;

	public BMWPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
