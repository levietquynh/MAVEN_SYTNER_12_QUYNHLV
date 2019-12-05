package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class FinancePageObject extends AbstractPage{
	private WebDriver driver;

	public FinancePageObject(WebDriver driver) {
		this.driver = driver;
	}
}
