package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class LandRoverPageObject extends AbstractPage{
	private WebDriver driver;

	public LandRoverPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
