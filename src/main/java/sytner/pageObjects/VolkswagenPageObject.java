package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class VolkswagenPageObject extends AbstractPage{
	private WebDriver driver;

	public VolkswagenPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
