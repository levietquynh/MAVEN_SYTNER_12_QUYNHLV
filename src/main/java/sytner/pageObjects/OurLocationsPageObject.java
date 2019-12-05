package sytner.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import sytner.pageUIs.OurLocationsPageUI;

public class OurLocationsPageObject extends AbstractPage{
	private WebDriver driver;

	public OurLocationsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSytnerGroupLogo() {
		waitToElementVisible(driver, OurLocationsPageUI.SYTNER_GROUP_LOGO);
		clickToElement(driver, OurLocationsPageUI.SYTNER_GROUP_LOGO);
	}
}
