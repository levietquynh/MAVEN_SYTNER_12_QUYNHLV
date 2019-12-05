package com.sytner.homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import commons.Constants;
import commons.PageGeneratorManager;
import sytner.pageObjects.HomePageObject;

public class Image_Scroll extends AbstractTest {
	WebDriver driver;
	HomePageObject homePage;

	@Parameters({ "browser" })
	@BeforeTest
	public void initData(String browser) {
		driver = openMultiBrowser(browser);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openSytnerSite() {
		log.info("ImageScroll - Step 01. Open Sytner site");
		driver.get(Constants.URL);
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	@Test
	public void ImageScroll_001_ImageScrollDisplay() {
		log.info("ImageScroll_001 - Step 02. Verify image scroll displays - There is 4 images");
		verifyEquals(homePage.getTheNumberOfImageScroll(),4);

	}
	
	@AfterClass(alwaysRun = true)
	public void afterTest() {
		closeBrowserAndDriver(driver);
	}
}
