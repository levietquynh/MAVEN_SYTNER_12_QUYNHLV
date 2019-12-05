package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class CustomerServicePageObject extends AbstractPage{
	private WebDriver driver;

	public CustomerServicePageObject(WebDriver driver) {
		this.driver = driver;
	}
}
