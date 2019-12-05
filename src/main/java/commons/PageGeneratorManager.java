package commons;

import org.openqa.selenium.WebDriver;

import sytner.pageObjects.AboutUsPageObject;
import sytner.pageObjects.AlpinaPageObject;
import sytner.pageObjects.AstonMartinPageObject;
import sytner.pageObjects.AudiPageObject;
import sytner.pageObjects.BMWPageObject;
import sytner.pageObjects.BentleyPageObject;
import sytner.pageObjects.BusinessUsersPageObject;
import sytner.pageObjects.CustomerServicePageObject;
import sytner.pageObjects.FerrariPageObject;
import sytner.pageObjects.FinancePageObject;
import sytner.pageObjects.HomePageObject;
import sytner.pageObjects.JaguarPageObject;
import sytner.pageObjects.LamborghiniPageObject;
import sytner.pageObjects.LandRoverPageObject;
import sytner.pageObjects.MaseratiPageObject;
import sytner.pageObjects.McLarenPageObject;
import sytner.pageObjects.MercedesBenzPageObject;
import sytner.pageObjects.MiniPageObject;
import sytner.pageObjects.NewCarsPageObject;
import sytner.pageObjects.NewsPageObject;
import sytner.pageObjects.OurLocationsPageObject;
import sytner.pageObjects.PorschePageObject;
import sytner.pageObjects.RollsRoycePageObject;
import sytner.pageObjects.SeatPageObject;
import sytner.pageObjects.SellYourCarPageObject;
import sytner.pageObjects.SmartPageObject;
import sytner.pageObjects.SytnerSelectPageObject;
import sytner.pageObjects.UsedCarSearchPageObject;
import sytner.pageObjects.VolkswagenPageObject;
import sytner.pageObjects.VolkswagenCommercialsPageObject;
import sytner.pageObjects.VolvoPageObject;
import sytner.pageObjects.ŠKODAPageObject;

public class PageGeneratorManager {
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	
	public static OurLocationsPageObject getOurLocationsPage(WebDriver driver) {
		return new OurLocationsPageObject(driver);
	}
	
	public static AboutUsPageObject getAboutUsPage(WebDriver driver) {
		return new AboutUsPageObject(driver);
	}
	
	public static NewsPageObject getNewsPage(WebDriver driver) {
		return new NewsPageObject(driver);
	}
	
	public static BusinessUsersPageObject getBusinessUsersPage(WebDriver driver) {
		return new BusinessUsersPageObject(driver);
	}
	public static CustomerServicePageObject getCustomerServicePage(WebDriver driver) {
		return new CustomerServicePageObject(driver);
	}
	public static FinancePageObject getFinancePage(WebDriver driver) {
		return new FinancePageObject(driver);
	}
	public static NewCarsPageObject getNewCarsPage(WebDriver driver) {
		return new NewCarsPageObject(driver);
	}
	public static SellYourCarPageObject getSellYourCarPage(WebDriver driver) {
		return new SellYourCarPageObject(driver);
	}
	public static UsedCarSearchPageObject getUsedCarSearchPage(WebDriver driver) {
		return new UsedCarSearchPageObject(driver);
	}

	public static AlpinaPageObject getAlpinaPage(WebDriver driver) {
		return new AlpinaPageObject(driver);
	}
	public static AudiPageObject getAudiPage(WebDriver driver) {
		return new AudiPageObject(driver);
	}
	public static BentleyPageObject getBentleyPage(WebDriver driver) {
		return new BentleyPageObject(driver);
	}
	public static BMWPageObject getBMWPage(WebDriver driver) {
		return new BMWPageObject(driver);
	}
	
	public static FerrariPageObject getFerrariPage(WebDriver driver) {
		return new FerrariPageObject(driver);
	}
	
	public static AstonMartinPageObject getAstonMartinPage(WebDriver driver) {
		return new AstonMartinPageObject(driver);
	}
	
	public static JaguarPageObject getJaguarPage(WebDriver driver) {
		return new JaguarPageObject(driver);
	}
	
	public static LandRoverPageObject getLandRoverPage(WebDriver driver) {
		return new LandRoverPageObject(driver);
	}
	
	public static LamborghiniPageObject getLamborghiniPage(WebDriver driver) {
		return new LamborghiniPageObject(driver);
	}
	
	public static MaseratiPageObject getMaseratiPage(WebDriver driver) {
		return new MaseratiPageObject(driver);
	}
	
	public static McLarenPageObject getMcLarenPage(WebDriver driver) {
		return new McLarenPageObject(driver);
	}
	
	public static MercedesBenzPageObject getMercedesBenzPage(WebDriver driver) {
		return new MercedesBenzPageObject(driver);
	}
	
	public static MiniPageObject getMiniPage(WebDriver driver) {
		return new MiniPageObject(driver);
	}
	
	public static PorschePageObject getPorschePage(WebDriver driver) {
		return new PorschePageObject(driver);
	}
	
	public static RollsRoycePageObject getRollsRoycePage(WebDriver driver) {
		return new RollsRoycePageObject(driver);
	}
	
	public static SeatPageObject getSeatPage(WebDriver driver) {
		return new SeatPageObject(driver);
	}
	
	public static ŠKODAPageObject getŠKODAPage(WebDriver driver) {
		return new  ŠKODAPageObject(driver);
	}
	
	public static SmartPageObject getSmartPage(WebDriver driver) {
		return new SmartPageObject(driver);
	}
	
	public static VolkswagenPageObject getVolkswagenPage(WebDriver driver) {
		return new VolkswagenPageObject(driver);
	}
	
	public static VolkswagenCommercialsPageObject getVolkswagenCommercialsPage(WebDriver driver) {
		return new VolkswagenCommercialsPageObject(driver);
	}
	
	public static VolvoPageObject getVolvoPage(WebDriver driver) {
		return new VolvoPageObject(driver);
	}
	
	public static SytnerSelectPageObject getSytnerSelectPage(WebDriver driver) {
		return new SytnerSelectPageObject(driver);
	}
}
