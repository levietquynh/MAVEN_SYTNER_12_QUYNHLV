package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class UsedCarSearchPageObject extends AbstractPage{
	private WebDriver driver;

	public UsedCarSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
