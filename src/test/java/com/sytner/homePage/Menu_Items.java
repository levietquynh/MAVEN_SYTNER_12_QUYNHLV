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
import sytner.pageObjects.AboutUsPageObject;
import sytner.pageObjects.BusinessUsersPageObject;
import sytner.pageObjects.CustomerServicePageObject;
import sytner.pageObjects.FinancePageObject;
import sytner.pageObjects.HomePageObject;
import sytner.pageObjects.NewCarsPageObject;
import sytner.pageObjects.NewsPageObject;
import sytner.pageObjects.OurLocationsPageObject;
import sytner.pageObjects.SellYourCarPageObject;
import sytner.pageObjects.UsedCarSearchPageObject;

public class Menu_Items extends AbstractTest{
	WebDriver driver;
	HomePageObject homePage;
	OurLocationsPageObject ourLocationsPage;
	AboutUsPageObject aboutUsPage;
	NewsPageObject newsPage;
	CustomerServicePageObject customerServicePage;
	FinancePageObject financePage;
	UsedCarSearchPageObject usedCarSearchPage;
	NewCarsPageObject newCarsPage;
	BusinessUsersPageObject businessUsersPage;
	SellYourCarPageObject sellYourCarPage;
	
	@Parameters({ "browser" })
	@BeforeTest
	public void initData(String browser) {
		driver = openMultiBrowser(browser);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeMethod
	public void openSytnerSite() {
		log.info("MenuItems - Step 01. Open Sytner site");
		driver.get(Constants.URL);
		homePage = PageGeneratorManager.getHomePage(driver);
	}
	
	@Test
	public void MenuItems_001_AboutUs() {
		log.info("MenuItems_001 - Step 02. Click on About us menu items");
		homePage.clickOnAboutUsMenuItems();
		aboutUsPage = PageGeneratorManager.getAboutUsPage(driver);
		
		log.info("MenuItems_001 - Step 03. Verify About Us page is displayed");
		verifyEquals(aboutUsPage.getTextFromPageTitle(driver), "About Us");
		
		log.info("MenuItems_001 - Step 04. The link https://www.sytner.co.uk/about-us/ displays");
		verifyEquals(aboutUsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/about-us/");
	}
	
	@Test
	public void MenuItems_002_News() {
		log.info("MenuItems_002 - Step 02. Click on News menu items");
		homePage.clickToDynamicMenuItems(driver, "News");
		newsPage = PageGeneratorManager.getNewsPage(driver);
		
		log.info("MenuItems_002 - Step 03. Verify News page is displayed");
		verifyEquals(newsPage.getTextFromPageTitle(driver), "News");
		
		log.info("MenuItems_002 - Step 04. The link https://www.sytner.co.uk/news/ displays");
		verifyEquals(newsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/news/");
	}
	
	@Test
	public void MenuItems_003_CustomerService() {
		log.info("MenuItems_003 - Step 02. Click on Customer Service menu items");
		homePage.clickToDynamicMenuItems(driver, "Customer Service");
		customerServicePage = PageGeneratorManager.getCustomerServicePage(driver);
		
		log.info("MenuItems_003 - Step 03. Verify Customer Service page is displayed");
		verifyEquals(customerServicePage.getTextFromPageTitle(driver), "Customer Service");
		
		log.info("MenuItems_003 - Step 04. The link https://www.sytner.co.uk/customer-service/ displays");
		verifyEquals(customerServicePage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/customer-service/");
	}
	
	
	public void MenuItems_004_Careers() {
		log.info("MenuItems_004 - Step 02. Click on Careers menu items");
		homePage.clickToDynamicMenuItems(driver, "Careers");
		
		//change business  - open new tab
		log.info("MenuItems_004 - Step 03. Verify Careers page is opened in new tab");
	}
	
	@Test
	public void MenuItems_005_Finance() {
		log.info("MenuItems_005 - Step 02. Click on Finance menu items");
		homePage.clickToDynamicMenuItems(driver, "Finance");
		financePage = PageGeneratorManager.getFinancePage(driver);
		
		log.info("MenuItems_005 - Step 03. Verify Finance page is displayed");
		verifyEquals(financePage.getTextFromPageTitle(driver), "Finance");
		
		log.info("MenuItems_005 - Step 04. The link https://www.sytner.co.uk/finance/ displays");
		verifyEquals(financePage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/finance/");
	}
	
	@Test
	public void MenuItems_006_SavedVehicles() {
		log.info("MenuItems_006 - Step 02. Click on Saved vehicles menu items");
		
	}
	
	@Test
	public void MenuItems_007_UsedCarSearch() {
		log.info("MenuItems_007 - Step 02. Click on Used Car Search menu items");
		homePage.clickToDynamicNavMenuItems(driver, "Used Car Search");
		usedCarSearchPage = PageGeneratorManager.getUsedCarSearchPage(driver);
		
		//open other domain - different with other test cases
		log.info("MenuItems_007 - Step 03. Verify Sytner Vehicle Search page is displayed");
		verifyEquals(usedCarSearchPage.getPageTitle(driver), "Sytner Vehicle Search");
		
		log.info("MenuItems_007 - Step 04. The link https://supersearch.sytner.co.uk/#/ displays");
		verifyEquals(usedCarSearchPage.getCurrentPageUrl(driver), "https://supersearch.sytner.co.uk/#/");
	}
	
	@Test
	public void MenuItems_008_NewCars() {
		log.info("MenuItems_008 - Step 02. Click on New Cars menu items");
		homePage.clickToDynamicNavMenuItems(driver, "New Cars");
		newCarsPage = PageGeneratorManager.getNewCarsPage(driver);
		
		log.info("MenuItems_008 - Step 03. Verify New Cars page is displayed");
		verifyEquals(newCarsPage.getTextFromPageTitle(driver), "New Cars");
		
		log.info("MenuItems_008 - Step 04. The link https://www.sytner.co.uk/new-cars/ displays");
		verifyEquals(newCarsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/new-cars/");
	}
	
	public void MenuItems_009_CarMaintenance() {
		//change business - don't see on UI
	}
	
	@Test
	public void MenuItems_010_Promotions() {
		//change business - don't see on UI
	}
	
	@Test
	public void MenuItems_011_BusinessUsers() {
		log.info("MenuItems_011 - Step 02. Click on Business Users menu items");
		homePage.clickToDynamicNavMenuItems(driver, "Business Users");
		businessUsersPage = PageGeneratorManager.getBusinessUsersPage(driver);
		
		log.info("MenuItems_011 - Step 03. Verify Business Users page is displayed");
		verifyEquals(businessUsersPage.getTextFromPageTitle(driver), "Business Users");
		
		log.info("MenuItems_011 - Step 04. The link https://www.sytner.co.uk/business-users/ displays");
		verifyEquals(businessUsersPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/business-users/");
	}
	
	@Test
	public void MenuItems_012_SellYourCar() {
		log.info("MenuItems_012 - Step 02. Click on Sell your car menu items");
		homePage.clickToDynamicNavMenuItems(driver, "Sell your car");
		sellYourCarPage = PageGeneratorManager.getSellYourCarPage(driver);
		
		log.info("MenuItems_012 - Step 03. Verify Sell your car page is displayed");
		verifyEquals(sellYourCarPage.getTextFromPageTitle(driver), "Sell Your Car");
		
		log.info("MenuItems_012 - Step 04. The link https://www.sytner.co.uk/sell-your-car/ displays");
		verifyEquals(sellYourCarPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/sell-your-car/");
	}
	
	@Test
	public void MenuItems_013_DealerLocator() {
		log.info("MenuItems_013 - Step 02. Click on Our Locations menu items");
		homePage.clickToDynamicNavMenuItems(driver, "Our Locations");
		ourLocationsPage = PageGeneratorManager.getOurLocationsPage(driver);
		
		log.info("MenuItems_013 - Step 03. Verify Our Locations page is displayed");
		verifyEquals(ourLocationsPage.getTextFromPageTitle(driver), "Our Locations");
		
		log.info("MenuItems_013 - Step 04. The link https://www.sytner.co.uk/dealer-locator/ displays");
		verifyEquals(ourLocationsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/dealer-locator/");
	}
	
	@Test
	public void MenuItems_014_HomeIcon() {
		log.info("MenuItems_014 - Step 02. Click on Our Locations menu items");
		homePage.clickToDynamicNavMenuItems(driver, "Our Locations");
		ourLocationsPage = PageGeneratorManager.getOurLocationsPage(driver);
		
		log.info("MenuItems_014 - Step 03. Verify Our Locations page is displayed");
		verifyEquals(ourLocationsPage.getTextFromPageTitle(driver), "Our Locations");
		
		log.info("MenuItems_014 - Step 04. The link https://www.sytner.co.uk/dealer-locator/ displays");
		verifyEquals(ourLocationsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/dealer-locator/");
		
		//should update from Our Locations page
		log.info("MenuItems_014 - Step 05. Click on Home icon");
		ourLocationsPage.clickToDynamicNavMenuItems(driver, "Home");
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("MenuItems_014 - Step 07. The link https://www.sytner.co.uk/ displays");
		verifyEquals(homePage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/");
	}
	
	@Test
	public void MenuItems_015_HomeIcon() {
		log.info("MenuItems_015 - Step 02. Click on Our Locations menu items");
		homePage.clickToDynamicNavMenuItems(driver, "Our Locations");
		ourLocationsPage = PageGeneratorManager.getOurLocationsPage(driver);
		
		log.info("MenuItems_015 - Step 03. Verify Our Locations page is displayed");
		verifyEquals(ourLocationsPage.getTextFromPageTitle(driver), "Our Locations");
		
		log.info("MenuItems_015 - Step 04. The link https://www.sytner.co.uk/dealer-locator/ displays");
		verifyEquals(ourLocationsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/dealer-locator/");
		
		log.info("MenuItems_015 - Step 05. Click on Sytner Group logo");
		ourLocationsPage.clickOnSytnerGroupLogo();
		homePage = PageGeneratorManager.getHomePage(driver);
		
		log.info("MenuItems_015 - Step 07. The link https://www.sytner.co.uk/ displays");
		verifyEquals(homePage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterTest() {
		closeBrowserAndDriver(driver);
	}
}
