package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class AudiPageObject extends AbstractPage{
	private WebDriver driver;

	public AudiPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
