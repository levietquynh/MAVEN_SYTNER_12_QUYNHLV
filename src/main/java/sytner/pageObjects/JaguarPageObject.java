package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class JaguarPageObject extends AbstractPage{
	private WebDriver driver;

	public JaguarPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
