package sytner.pageUIs;

public class AbstractPageUI {
	public static final String PAGE_TITLE = "//div[text()='You are here:']/parent::div//li[@class='active']";
	public static final String DYNAMIC_MENU_ITEMS = "//div[@class='site-links module header-links u-no-padding']//a[text()='%s']";
	public static final String DYNAMIC_NAV_MENU_ITEMS = "//ul[@class='nav']//span[text()='%s']";
	
	public static final String DYNAMIC_JUMP_POINT_TEXT = "//span[@class='title']//span[text()='%s']";
	public static final String DYNAMIC_JUMP_POINT_ICON = "//div[@class='jump module %s hidden-phone']//span[@class='content']";
	//div[@class='jump module audi hidden-phone']//span[@class='content']
	
}
