package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class VolvoPageObject extends AbstractPage{
	private WebDriver driver;

	public VolvoPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
