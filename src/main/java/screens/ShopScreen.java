package screens;

import io.appium.java_client.AppiumDriver;

public class ShopScreen extends CategoriesScreen{
    public ShopScreen(AppiumDriver driver) {
        super(driver);
        addElement("nikon", "xpath", "//*[@text='Nikon']");
        addElement("nikonD", "xpath", "//*[@text='Nikon D']");
        addElement("nikonD5600", "xpath", "//*[@text='Nikon D5600']");
        addElement("hotThisWeek", "xpath", "//*[@content-desc='Hot This Week']");
        addElement("authorizedSeller", "xpath", "//*[@content-desc='Authorized Seller']");
    }
}
