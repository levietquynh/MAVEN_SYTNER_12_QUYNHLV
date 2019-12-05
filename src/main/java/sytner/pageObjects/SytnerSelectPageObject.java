package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class SytnerSelectPageObject extends AbstractPage{
	private WebDriver driver;

	public SytnerSelectPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
