package sytner.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.AbstractPage;
import sytner.pageUIs.HomePageUI;

public class HomePageObject extends AbstractPage{
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAboutUsMenuItems() {
		waitToElementVisible(driver, HomePageUI.ABOUT_US_MENU_ITEMS);
		clickToElement(driver, HomePageUI.ABOUT_US_MENU_ITEMS);
	}

	public int getTheNumberOfImageScroll() {
		List <WebElement> e = driver.findElements(By.xpath(HomePageUI.IMAGE_SCROLL_NUMBER));
		return e.size();
	}
	
}
