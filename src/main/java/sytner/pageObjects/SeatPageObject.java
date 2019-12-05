package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class SeatPageObject extends AbstractPage{
	private WebDriver driver;

	public SeatPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
