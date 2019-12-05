package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class NewCarsPageObject extends AbstractPage{
	private WebDriver driver;

	public NewCarsPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
