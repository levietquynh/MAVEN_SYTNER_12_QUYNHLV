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
import sytner.pageObjects.AlpinaPageObject;
import sytner.pageObjects.AstonMartinPageObject;
import sytner.pageObjects.AudiPageObject;
import sytner.pageObjects.BMWPageObject;
import sytner.pageObjects.BentleyPageObject;
import sytner.pageObjects.FerrariPageObject;
import sytner.pageObjects.HomePageObject;
import sytner.pageObjects.JaguarPageObject;
import sytner.pageObjects.LamborghiniPageObject;
import sytner.pageObjects.LandRoverPageObject;
import sytner.pageObjects.MaseratiPageObject;
import sytner.pageObjects.McLarenPageObject;
import sytner.pageObjects.MercedesBenzPageObject;
import sytner.pageObjects.MiniPageObject;
import sytner.pageObjects.PorschePageObject;
import sytner.pageObjects.RollsRoycePageObject;
import sytner.pageObjects.SeatPageObject;
import sytner.pageObjects.SmartPageObject;
import sytner.pageObjects.SytnerSelectPageObject;
import sytner.pageObjects.VolkswagenCommercialsPageObject;
import sytner.pageObjects.VolkswagenPageObject;
import sytner.pageObjects.VolvoPageObject;
import sytner.pageObjects.ŠKODAPageObject;

public class Jump_Points extends AbstractTest {
	WebDriver driver;
	HomePageObject homePage;
	AlpinaPageObject alpinaPage;
	AudiPageObject audiPage;
	BentleyPageObject bentleyPage;
	BMWPageObject BMWPage;
	FerrariPageObject ferrariPage;
	AstonMartinPageObject astonMartinPage;
	JaguarPageObject jaguarPage;
	LandRoverPageObject landRoverPage;
	LamborghiniPageObject lamborghiniPage;
	MaseratiPageObject maseratiPage;
	McLarenPageObject mcLarenPage;
	MercedesBenzPageObject mercedesBenzPage;
	MiniPageObject miniPage;
	PorschePageObject porschePage;
	RollsRoycePageObject rollsRoycePage;
	SeatPageObject seatPage;
	ŠKODAPageObject ŠKODAPage;
	SmartPageObject smartPage;
	VolkswagenPageObject volkswagenPage;
	VolkswagenCommercialsPageObject volkswagenCommercialsPage;
	VolvoPageObject volvoPage;
	SytnerSelectPageObject sytnerSelectPage;

	@Parameters({ "browser" })
	@BeforeTest
	public void initData(String browser) {
		driver = openMultiBrowser(browser);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openSytnerSite() {
		log.info("JumpPoints - Step 01. Open Sytner site");
		driver.get(Constants.URL);
		homePage = PageGeneratorManager.getHomePage(driver);
	}

	@Test
	public void JumpPoints_001_Alpina() {
		log.info("JumpPoints_001 - Step 02. Verify Alpina jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "ALPINA");

		log.info("JumpPoints_001 - Step 03. Move to Alpina jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "ALPINA");

		log.info("JumpPoints_001 - Step 04. Verify Alpina icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "alpina");

		log.info("JumpPoints_001 - Step 05. Click on Alpina icon");
		homePage.clickToDynamicIconJumpPoint(driver, "alpina");
		alpinaPage = PageGeneratorManager.getAlpinaPage(driver);

		log.info("JumpPoints_001 - Step 06. Alpina page displays");
		verifyEquals(alpinaPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/bmw/alpina-range/");
	}

	@Test
	public void JumpPoints_002_Audi() {
		log.info("JumpPoints_002 - Step 02. Verify Audi jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Audi");

		log.info("JumpPoints_002 - Step 03. Move to Audi jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Audi");

		log.info("JumpPoints_002 - Step 04. Verify Audi icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "audi");

		log.info("JumpPoints_002 - Step 05. Click on Audi icon");
		homePage.clickToDynamicIconJumpPoint(driver, "audi");
		audiPage = PageGeneratorManager.getAudiPage(driver);

		log.info("JumpPoints_002 - Step 06. Audi page displays");
		verifyEquals(audiPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/audi/");
	}

	@Test
	public void JumpPoints_003_Bentley() {
		log.info("JumpPoints_003 - Step 02. Verify Bentley jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Bentley");

		log.info("JumpPoints_003 - Step 03. Move to Bentley jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Bentley");

		log.info("JumpPoints_003 - Step 04. Verify Bentley icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "bentley");

		log.info("JumpPoints_003 - Step 05. Click on Bentley icon");
		homePage.clickToDynamicIconJumpPoint(driver, "bentley");
		bentleyPage = PageGeneratorManager.getBentleyPage(driver);

		log.info("JumpPoints_003 - Step 06. Bentley page displays");
		verifyEquals(bentleyPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/bentley/");
	}

	@Test
	public void JumpPoints_004_BWM() {
		log.info("JumpPoints_004 - Step 02. Verify BWM jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "BMW");

		log.info("JumpPoints_004 - Step 03. Move to BWM jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "BMW");

		log.info("JumpPoints_004 - Step 04. Verify BWM icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "bmw");

		log.info("JumpPoints_004 - Step 05. Click on BWM icon");
		homePage.clickToDynamicIconJumpPoint(driver, "bmw");
		BMWPage = PageGeneratorManager.getBMWPage(driver);

		log.info("JumpPoints_004 - Step 06. BWM page displays");
		verifyEquals(BMWPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/bmw/");
	}

	@Test
	public void JumpPoints_005_Ferrari() {
		log.info("JumpPoints_005 - Step 02. Verify Ferrari jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Ferrari");

		log.info("JumpPoints_005 - Step 03. Move to Ferrari jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Ferrari");

		log.info("JumpPoints_005 - Step 04. Verify Ferrari icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "ferrari");

		log.info("JumpPoints_005 - Step 05. Click on Ferrari icon");
		homePage.clickToDynamicIconJumpPoint(driver, "ferrari");
		ferrariPage = PageGeneratorManager.getFerrariPage(driver);

		log.info("JumpPoints_005 - Step 06. Ferrari page displays");
		verifyEquals(ferrariPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/ferrari/");
	}

	@Test
	public void JumpPoints_006_AstonMartin() {
		log.info("JumpPoints_006 - Step 02. Verify Aston Martin jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Aston Martin");

		log.info("JumpPoints_006 - Step 03. Move to Aston Martin jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Aston Martin");

		log.info("JumpPoints_006 - Step 04. Verify Aston Martin icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "aston-martin");

		log.info("JumpPoints_006 - Step 05. Click on Aston Martin icon");
		homePage.clickToDynamicIconJumpPoint(driver, "aston-martin");
		astonMartinPage = PageGeneratorManager.getAstonMartinPage(driver);

		log.info("JumpPoints_006 - Step 06. Aston Martin page displays");
		verifyEquals(astonMartinPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/aston-martin/");
	}

	@Test
	public void JumpPoints_007_Jaguar() {
		log.info("JumpPoints_007 - Step 02. Verify Jaguar jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Jaguar");

		log.info("JumpPoints_007 - Step 03. Move to Jaguar jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Jaguar");

		log.info("JumpPoints_007 - Step 04. Verify Jaguar icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "jaguar");

		log.info("JumpPoints_007 - Step 05. Click on Jaguar icon");
		homePage.clickToDynamicIconJumpPoint(driver, "jaguar");
		jaguarPage = PageGeneratorManager.getJaguarPage(driver);

		log.info("JumpPoints_007 - Step 06. Jaguar page displays");
		verifyEquals(jaguarPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/jaguar/");
	}

	@Test
	public void JumpPoints_008_LandRover() {
		log.info("JumpPoints_008 - Step 02. Verify Land Rover jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Land Rover");

		log.info("JumpPoints_008 - Step 03. Move to Land Rover jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Land Rover");

		log.info("JumpPoints_008 - Step 04. Verify Land Rover icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "land-rover");

		log.info("JumpPoints_008 - Step 05. Click on Land Rover icon");
		homePage.clickToDynamicIconJumpPoint(driver, "land-rover");
		landRoverPage = PageGeneratorManager.getLandRoverPage(driver);

		log.info("JumpPoints_008 - Step 06. Land Rover page displays");
		verifyEquals(landRoverPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/landrover/");
	}

	@Test
	public void JumpPoints_009_Lamborghini() {
		log.info("JumpPoints_009 - Step 02. Verify Lamborghini jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Lamborghini");

		log.info("JumpPoints_009 - Step 03. Move to Lamborghini jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Lamborghini");

		log.info("JumpPoints_009 - Step 04. Verify Lamborghini icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "lamborghini");

		log.info("JumpPoints_009 - Step 05. Click on Lamborghini icon");
		homePage.clickToDynamicIconJumpPoint(driver, "lamborghini");
		lamborghiniPage = PageGeneratorManager.getLamborghiniPage(driver);

		log.info("JumpPoints_009 - Step 06. Lamborghini page displays");
		verifyEquals(lamborghiniPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/lamborghini/");
	}

	@Test
	public void JumpPoints_010_Maserati() {
		log.info("JumpPoints_010 - Step 02. Verify Maserati jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Maserati");

		log.info("JumpPoints_010 - Step 03. Move to Maserati jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Maserati");

		log.info("JumpPoints_010 - Step 04. Verify Maserati icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "maserati");

		log.info("JumpPoints_010 - Step 05. Click on Maserati icon");
		homePage.clickToDynamicIconJumpPoint(driver, "maserati");
		maseratiPage = PageGeneratorManager.getMaseratiPage(driver);

		log.info("JumpPoints_010 - Step 06. Maserati page displays");
		verifyEquals(maseratiPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/maserati/");
	}

	@Test
	public void JumpPoints_011_McLaren() {
		log.info("JumpPoints_011 - Step 02. Verify McLaren jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "McLaren");

		log.info("JumpPoints_011 - Step 03. Move to McLaren jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "McLaren");

		log.info("JumpPoints_011 - Step 04. Verify McLaren icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "mclaren");

		log.info("JumpPoints_011 - Step 05. Click on McLaren icon");
		homePage.clickToDynamicIconJumpPoint(driver, "mclaren");
		mcLarenPage = PageGeneratorManager.getMcLarenPage(driver);

		log.info("JumpPoints_011 - Step 06. McLaren page displays");
		verifyEquals(mcLarenPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/mclaren/");
	}

	@Test
	public void JumpPoints_012_MercedesBenz() {
		log.info("JumpPoints_012 - Step 02. Verify Mercedes-Benz jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Mercedes-Benz");

		log.info("JumpPoints_012 - Step 03. Move to Mercedes-Benz jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Mercedes-Benz");

		log.info("JumpPoints_012 - Step 04. Verify Mercedes-Benz icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "mercedes-benz");

		log.info("JumpPoints_012 - Step 05. Click on Mercedes-Benz icon");
		homePage.clickToDynamicIconJumpPoint(driver, "mercedes-benz");
		mercedesBenzPage = PageGeneratorManager.getMercedesBenzPage(driver);

		log.info("JumpPoints_012 - Step 06. Mercedes-Benz page displays");
		verifyEquals(mercedesBenzPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/mercedes-benz/");
	}

	@Test
	public void JumpPoints_013_Mini() {
		log.info("JumpPoints_013 - Step 02. Verify Mini jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "MINI");

		log.info("JumpPoints_013 - Step 03. Move to Mini jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "MINI");

		log.info("JumpPoints_013 - Step 04. Verify Mini icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "mini");

		log.info("JumpPoints_013 - Step 05. Click on Mini icon");
		homePage.clickToDynamicIconJumpPoint(driver, "mini");
		miniPage = PageGeneratorManager.getMiniPage(driver);

		log.info("JumpPoints_013 - Step 06. Mini page displays");
		verifyEquals(miniPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/mini/");
	}

	@Test
	public void JumpPoints_014_Porsche() {
		log.info("JumpPoints_014 - Step 02. Verify Porsche jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Porsche");

		log.info("JumpPoints_014 - Step 03. Move to Porsche jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Porsche");

		log.info("JumpPoints_014 - Step 04. Verify Porsche icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "porsche");

		log.info("JumpPoints_014 - Step 05. Click on Porsche icon");
		homePage.clickToDynamicIconJumpPoint(driver, "porsche");
		porschePage = PageGeneratorManager.getPorschePage(driver);

		log.info("JumpPoints_014 - Step 06. Porsche page displays");
		verifyEquals(porschePage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/porsche/");
	}

	@Test
	public void JumpPoints_015_RollsRoyce() {
		log.info("JumpPoints_015 - Step 02. Verify Rolls Royce jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Rolls-Royce");

		log.info("JumpPoints_015 - Step 03. Move to Rolls Royce jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Rolls-Royce");

		log.info("JumpPoints_015 - Step 04. Verify Rolls Royce icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "rolls-royce");

		log.info("JumpPoints_015 - Step 05. Click on Rolls Royce icon");
		homePage.clickToDynamicIconJumpPoint(driver, "rolls-royce");
		rollsRoycePage = PageGeneratorManager.getRollsRoycePage(driver);

		log.info("JumpPoints_015 - Step 06. Rolls Royce page displays");
		verifyEquals(rollsRoycePage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/rolls-royce/");
	}

	@Test
	public void JumpPoints_016_Seat() {
		log.info("JumpPoints_016 - Step 02. Verify Seat jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "SEAT");

		log.info("JumpPoints_016 - Step 03. Move to Seat jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "SEAT");

		log.info("JumpPoints_016 - Step 04. Verify Seat icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "seat");

		log.info("JumpPoints_016 - Step 05. Click on Seat icon");
		homePage.clickToDynamicIconJumpPoint(driver, "seat");
		seatPage = PageGeneratorManager.getSeatPage(driver);

		log.info("JumpPoints_016 - Step 06. Seat page displays");
		verifyEquals(seatPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/seat/");
	}

	@Test
	public void JumpPoints_017_ŠKODA() {
		log.info("JumpPoints_017 - Step 02. Verify ŠKODA jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "ŠKODA");

		log.info("JumpPoints_017 - Step 03. Move to ŠKODA jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "ŠKODA");

		log.info("JumpPoints_017 - Step 04. Verify ŠKODA icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "skoda");

		log.info("JumpPoints_017 - Step 05. Click on ŠKODA jump point");
		homePage.clickToDynamicIconJumpPoint(driver, "skoda");
		ŠKODAPage = PageGeneratorManager.getŠKODAPage(driver);

		log.info("JumpPoints_017 - Step 06. ŠKODA page displays");
		verifyEquals(ŠKODAPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/skoda/");
	}

	@Test
	public void JumpPoints_018_Smart() {
		log.info("JumpPoints_018 - Step 02. Verify Smart jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "smart");

		log.info("JumpPoints_018 - Step 03. Move to Smart jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "smart");

		log.info("JumpPoints_018 - Step 04. Verify Smart icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "smart");

		log.info("JumpPoints_018 - Step 05. Click on Smart icon");
		homePage.clickToDynamicIconJumpPoint(driver, "smart");
		smartPage = PageGeneratorManager.getSmartPage(driver);

		log.info("JumpPoints_018 - Step 06. Smart page displays");
		verifyEquals(smartPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/smart/");
	}

	@Test
	public void JumpPoints_019_Volkswagen() {
		log.info("JumpPoints_019 - Step 02. Verify Volkswagen jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Volkswagen");

		log.info("JumpPoints_019 - Step 03. Move to Volkswagen jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Volkswagen");

		log.info("JumpPoints_019 - Step 04. Verify Volkswagen icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "volkswagen-cars");

		log.info("JumpPoints_019 - Step 05. Click on Volkswagen icon");
		homePage.clickToDynamicIconJumpPoint(driver, "volkswagen-cars");
		volkswagenPage = PageGeneratorManager.getVolkswagenPage(driver);

		log.info("JumpPoints_019 - Step 06. Volkswagen page displays");
		verifyEquals(volkswagenPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/volkswagen/");
	}

	@Test
	public void JumpPoints_020_VolkswagenCommercials() {
		log.info("JumpPoints_020 - Step 02. Verify Volkswagen Commercials jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Volkswagen Commercials");

		log.info("JumpPoints_020 - Step 03. Move to Volkswagen Commercials jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Volkswagen Commercials");

		log.info("JumpPoints_020 - Step 04. Verify Volkswagen Commercials icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "volkswagen-commercials");

		log.info("JumpPoints_020 - Step 05. Click on Volkswagen Commercials icon");
		homePage.clickToDynamicIconJumpPoint(driver, "volkswagen-commercials");
		volkswagenCommercialsPage = PageGeneratorManager.getVolkswagenCommercialsPage(driver);

		log.info("JumpPoints_020 - Step 06. Volkswagen Commercials page displays");
		verifyEquals(volkswagenCommercialsPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/volkswagen-commercial/");
	}

	@Test
	public void JumpPoints_021_Volvo() {
		log.info("JumpPoints_021 - Step 02. Verify Volvo jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Volvo");

		log.info("JumpPoints_021 - Step 03. Move to Volvo jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Volvo");

		log.info("JumpPoints_021 - Step 04. Verify Volvo icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "volvo");

		log.info("JumpPoints_021 - Step 05. Click on Volvo icon");
		homePage.clickToDynamicIconJumpPoint(driver, "volvo");
		volvoPage = PageGeneratorManager.getVolvoPage(driver);

		log.info("JumpPoints_021 - Step 06. Volvo page displays");
		verifyEquals(volvoPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/volvo/");
	}

	@Test
	public void JumpPoints_022_SytnerSelect() {
		log.info("JumpPoints_022 - Step 02. Verify Sytner Select jump point displays");
		homePage.isDynamicJumpPointDisplay(driver, "Sytner Select");

		log.info("JumpPoints_022 - Step 03. Move to Sytner Select jump point");
		homePage.hoverMouseToDynamicJumpPoint(driver, "Sytner Select");

		log.info("JumpPoints_022 - Step 04. Verify Sytner Select icon displays");
		homePage.isDynamicIconJumpPointDisplay(driver, "sytner-select");

		log.info("JumpPoints_022 - Step 05. Click on Sytner Select icon");
		homePage.clickToDynamicIconJumpPoint(driver, "sytner-select");
		sytnerSelectPage = PageGeneratorManager.getSytnerSelectPage(driver);

		log.info("JumpPoints_022 - Step 06. Audi page displays");
		verifyEquals(sytnerSelectPage.getCurrentPageUrl(driver), "https://www.sytner.co.uk/sytner-select/");
	}

	@AfterClass(alwaysRun = true)
	public void afterTest() {
		closeBrowserAndDriver(driver);
	}
}
