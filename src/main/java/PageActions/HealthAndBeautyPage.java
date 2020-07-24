package PageActions;

import Base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.HealthAndBeautyLocators;

public class HealthAndBeautyPage extends Page {
    public HealthAndBeautyLocators health_beauty;

    public HealthAndBeautyPage(){
        this.health_beauty = new HealthAndBeautyLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.health_beauty);
    }

    public void goToHealthAndBeauty() {
        health_beauty.healthAndBeauty.click();

    }

    public void  goToFragrances() { health_beauty.fragrance.click();

    }
}
