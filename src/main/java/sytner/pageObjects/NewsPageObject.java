package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class NewsPageObject extends AbstractPage{
	private WebDriver driver;

	public NewsPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
