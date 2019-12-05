package commons;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import sytner.pageUIs.AbstractPageUI;

public class AbstractPage {

	/* WebBrowser */
	
	
	public void openAnyUrl(WebDriver driver, String urlValue) {
		driver.get(urlValue);
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSourceCode(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
		;
	}

	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public String getTextAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	public void sendKeyToAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public boolean isAlertDisplayedAndAcceptAlert(WebDriver driver, String alertMessage) {
		waitForAlertPresence(driver);
		boolean alertStatus = getTextAlert(driver).equals(alertMessage);
		acceptAlert(driver);
		return alertStatus;
	}

	/* Web Element */

	public void clickToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void clickToElement(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void sendkeyToElement(WebDriver driver, String locator, String value) {
		element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}

	public void sendkeyToElement(WebDriver driver, String locator, String value, String... values) {
		locator = String.format(locator, (Object[]) values);
		element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}

	public void selectItemInDropdown(WebDriver driver, String locator, String valueItem) {
		select = new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(valueItem);
	}

	public void selectItemInDropdown(WebDriver driver, String locator, String valueItem, String... values) {
		locator = String.format(locator, (Object[]) values);
		select = new Select(driver.findElement(By.xpath(locator)));
		select.selectByVisibleText(valueItem);
	}

	public String getFirstItemInDropdown(WebDriver driver, String locator) {
		select = new Select(driver.findElement(By.xpath(locator)));
		return select.getFirstSelectedOption().getText();
	}

	public void selectItemInCustomDropdown(WebDriver driver, String parentLocator, String allItemsLocator,
			String expectedValueItem) throws InterruptedException {
		element = driver.findElement(By.xpath(parentLocator));
		javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].click();", element);
		Thread.sleep(1000);

		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(allItemsLocator)));

		elements = driver.findElements(By.xpath(allItemsLocator));

		for (WebElement childElement : elements) {
			if (childElement.getText().equals(expectedValueItem)) {
				if (childElement.isDisplayed()) {
					childElement.click();
				} else {
					javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", childElement);
					Thread.sleep(1000);
					childElement.click();
				}
				Thread.sleep(1000);
				break;
			}
		}
	}

	public String getAttributeValue(WebDriver driver, String locator, String attributeName) {
		element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attributeName);
	}
	
	public String getAttributeValue(WebDriver driver, String locator, String attributeName, String... values) {
		locator = String.format(locator, (Object[]) values);
		element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attributeName);
	}

	public String getTextElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public String getTextElement(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public int countNumberOfElement(WebDriver driver, String locator) {
		elements = driver.findElements(By.xpath(locator));
		return elements.size();
	}

	public boolean isElementDisplayed(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isElementDisplayed(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isElementUnDisplayed(WebDriver driver, String locator) {
		overrideGlobalTimeout(driver, Constants.SHORT_TIMEOUT);
		elements = driver.findElements(By.xpath(locator));

		if (elements.size() == 0) {
			System.out.println("Element is not in DOM");
			overrideGlobalTimeout(driver, Constants.LONG_TIMEOUT);
			return true;
		} else if (elements.size() > 0 && !elements.get(0).isDisplayed()) {
			System.out.println("Element is in DOM but not visible");
			overrideGlobalTimeout(driver, Constants.LONG_TIMEOUT);
			return true;
		} else {
			overrideGlobalTimeout(driver, Constants.LONG_TIMEOUT);
			return false;
		}

	}

	public boolean isElementSelected(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isElementEnabled(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}

	public void checkToCheckbox(WebDriver driver, String locator) {
		if (!isElementSelected(driver, locator)) {
			clickToElement(driver, locator);
		}
	}

	public void uncheckToCheckbox(WebDriver driver, String locator) {
		if (isElementSelected(driver, locator)) {
			clickToElement(driver, locator);
		}
	}

	public void switchToChildWindowByTitle(WebDriver driver, String title) {
		allWindows = driver.getWindowHandles();
		for (String runwindow : allWindows) {
			driver.switchTo().window(runwindow);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}

	public void closeAllWindowWithoutParent(WebDriver driver, String parent) {
		allWindows = driver.getWindowHandles();
		for (String runwindow : allWindows) {
			if (!runwindow.equals(parent)) {
				driver.switchTo().window(runwindow);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}

	public void hoverMouseToElement(WebDriver driver, String locator) {
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).perform();
	}
	
	public void hoverMouseToElement(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).perform();
	}
	
	public void hoverMouseToElementAndClick(WebDriver driver, String locator) {
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).click().build().perform();
	}
	
	public void hoverMouseToElementAndClick(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).click().build().perform();
	}

	public void doubleClickToElement(WebDriver driver, String locator) {
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.doubleClick(element).perform();
	}

	public void rightClickToElement(WebDriver driver, String locator) {
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.contextClick(element).perform();
	}

	public void dragAndDrop(WebDriver driver, String sourceLocator, String targetLocator) {
		action = new Actions(driver);
		WebElement sourceElement = driver.findElement(By.xpath(sourceLocator));
		WebElement targetElement = driver.findElement(By.xpath(targetLocator));
		action.dragAndDrop(sourceElement, targetElement).perform();
	}

	public void sendKeyboardToElement(WebDriver driver, String locator, Keys key) {
		action = new Actions(driver);
		element = driver.findElement(By.xpath(locator));
		action.sendKeys(element, key).perform();
	}

	public void sendKeyboardToElement(WebDriver driver, String locator, Keys key, String... values) {
		action = new Actions(driver);
		locator = String.format(locator, (Object[]) values);
		element = driver.findElement(By.xpath(locator));
		action.sendKeys(element, key).perform();
	}

	public Object executeJavascriptToBrowser(String javaSript) {

		return javascriptExecutor.executeScript(javaSript);
	}

	public void scrollToBottomPage() {

		javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void highlightElement(WebDriver driver, String locator) {

		String originalStyle = element.getAttribute("style");
		javascriptExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				"border: 5px solid red; border-style: dashed;");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		javascriptExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", element, "style",
				originalStyle);

	}

	public void removeAttributeOfElement(WebDriver driver, String locator, String attributeRemove) {
		element = driver.findElement(By.xpath(locator));
		javascriptExecutor.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", element);
	}
	
	public void removeAttributeOfElement(WebDriver driver, JavascriptExecutor javascriptExecutor, String locator, String attributeRemove, String... nameID) {
		locator = String.format(locator, (Object[]) nameID);
		element = driver.findElement(By.xpath(locator));
		javascriptExecutor.executeScript("arguments[0].removeAttribute('" + attributeRemove + "');", element);
	}

	public void clickToElementByJS(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		javascriptExecutor.executeScript("arguments[0].click();", element);
	}

	public void sendkeyToElementByJS(WebDriver driver, String locator, String value) {
		element = driver.findElement(By.xpath(locator));
		javascriptExecutor.executeScript("arguments[0].setAttribute('value', '" + value + "')", element);
	}

	public void navigateToUrlByJS(String url) {

		javascriptExecutor.executeScript("window.location = '" + url + "'");
	}

	public boolean verifyTextInInnerText(String textExpected) {

		String textActual = (String) javascriptExecutor
				.executeScript("return document.documentElement.innerText.match('" + textExpected + "')[0]");
		return textActual.equals(textExpected);
	}

	public boolean checkAnyImageLoaded(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		boolean status = (boolean) javascriptExecutor.executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\") && arguments[0].naturalWidth >0",
				element);
		if (status) {
			return true;
		} else {
			return false;
		}
	}

	public void waitToElementVisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
	}

	public void waitToElementVisible(WebDriver driver, String locator, String... values) {
		locator = String.format(locator, (Object[]) values);
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
	}

	public void waitToElementPresence(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}

	public void waitToElementClickable(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}

	public void waitToElementInvisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		overrideGlobalTimeout(driver, Constants.SHORT_TIMEOUT);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
		overrideGlobalTimeout(driver, Constants.LONG_TIMEOUT);
	}

	public void waitForAlertPresence(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, longTimeout);
		waitExplicit.until(ExpectedConditions.alertIsPresent());
	}

	public void uploadOneFile(WebDriver driver, String uploadFilelocator, String filePath) {
		sendkeyToElement(driver, uploadFilelocator, filePath);
	}

	public void uploadMultipleFile(WebDriver driver, String uploadFilelocator, String filePaths) {
		sendkeyToElement(driver, uploadFilelocator, filePaths);
	}

	public void uploadFileByRobot(WebDriver driver, String filePath, String cssLocator) throws Exception {
		StringSelection select = new StringSelection(filePath);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		WebElement uploadFile = driver.findElement(By.cssSelector(cssLocator));
		uploadFile.click();
		Thread.sleep(1000);

		Robot robot = new Robot();
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		Thread.sleep(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
	}

	public void uploadFileByAutoIT(WebDriver driver, String locator, String filePath) throws Exception {

		if (driver.toString().contains("chrome")) {
			WebElement uploadFile = driver.findElement(By.cssSelector(locator));
			uploadFile.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(new String[] { chromePath, filePath });
			Thread.sleep(2000);
		} else if (driver.toString().contains("firefox")) {
			WebElement uploadFile = driver.findElement(By.cssSelector(locator));
			uploadFile.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(new String[] { firefoxPath, filePath });
			Thread.sleep(2000);
		} else {
			clickToElementByJS(driver, locator);
			Thread.sleep(1000);
			Runtime.getRuntime().exec(new String[] { iePath, filePath });
			Thread.sleep(2000);
		}

	}
	
	public String getTextFromPageTitle(WebDriver driver) {
		waitToElementVisible(driver, AbstractPageUI.PAGE_TITLE);
		return getTextElement(driver, AbstractPageUI.PAGE_TITLE);
	}
	
	public void clickToDynamicMenuItems(WebDriver driver, String value) {
		waitToElementVisible(driver, AbstractPageUI.DYNAMIC_MENU_ITEMS, value);
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_ITEMS, value);
	}
	
	public void clickToDynamicNavMenuItems(WebDriver driver, String value) {
		waitToElementVisible(driver, AbstractPageUI.DYNAMIC_NAV_MENU_ITEMS, value);
		clickToElement(driver, AbstractPageUI.DYNAMIC_NAV_MENU_ITEMS, value);
	}

	public void overrideGlobalTimeout(WebDriver driver, long timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	}

	public void sleepInSecond(WebDriver driver, long timeInSecond) {
		try {
			Thread.sleep(timeInSecond*1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isDynamicJumpPointDisplay(WebDriver driver, String jumpPointText) {
		return isElementDisplayed(driver, AbstractPageUI.DYNAMIC_JUMP_POINT_TEXT, jumpPointText);
	}
	
	public void hoverMouseToDynamicJumpPoint(WebDriver driver, String jumpPointText) {
		hoverMouseToElement(driver, AbstractPageUI.DYNAMIC_JUMP_POINT_TEXT, jumpPointText);
	}
	
	public boolean isDynamicIconJumpPointDisplay(WebDriver driver, String jumpPoint) {
		return isElementDisplayed(driver, AbstractPageUI.DYNAMIC_JUMP_POINT_ICON, jumpPoint);
	}
	
	public void clickToDynamicIconJumpPoint(WebDriver driver, String jumpPoint) {
		waitToElementVisible(driver, AbstractPageUI.DYNAMIC_JUMP_POINT_ICON, jumpPoint);
		hoverMouseToElementAndClick(driver, AbstractPageUI.DYNAMIC_JUMP_POINT_ICON, jumpPoint);
	}

	WebElement element;
	List<WebElement> elements;
	Select select;
	JavascriptExecutor javascriptExecutor;
	WebDriverWait waitExplicit;
	Set<String> allWindows;
	Actions action;
	long shortTimeout = Constants.SHORT_TIMEOUT;
	long longTimeout = Constants.LONG_TIMEOUT;
	String chromePath = ".\\uploadFiles\\chrome.exe";
	String firefoxPath = "\\uploadFiles\\firefox.exe";
	String iePath = "\\uploadFiles\\ie.exe";
}
