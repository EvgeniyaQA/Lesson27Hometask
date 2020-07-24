package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthAndBeautyLocators {
    @FindBy(xpath = "//*[@id='mainContent']/div[1]/ul/li[5]/a")
    public WebElement healthAndBeauty;
    @FindBy (xpath= "//*[@id='mainContent']/section[1]/div[2]/a[3]/div[2]")
    public  WebElement fragrance;
}
