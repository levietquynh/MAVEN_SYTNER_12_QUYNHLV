package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class MiniPageObject extends AbstractPage{
	private WebDriver driver;

	public MiniPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
