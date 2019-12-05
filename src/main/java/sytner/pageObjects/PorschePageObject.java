package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class PorschePageObject extends AbstractPage{
	private WebDriver driver;

	public PorschePageObject(WebDriver driver) {
		this.driver = driver;
	}
}
