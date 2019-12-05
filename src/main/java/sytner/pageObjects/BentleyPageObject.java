package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class BentleyPageObject extends AbstractPage{
	private WebDriver driver;

	public BentleyPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
