package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class BusinessUsersPageObject extends AbstractPage{
	private WebDriver driver;

	public BusinessUsersPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
