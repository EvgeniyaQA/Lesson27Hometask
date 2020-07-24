package testcases;


import Base.Page;
import PageActions.HealthAndBeautyPage;
import org.testng.annotations.Test;

public class HealthAndBeautyTest {
    @Test
    public void goToElectronicsTest(){

        Page.initConfiguration();// инициализирует драйвер
        HealthAndBeautyPage healthAndBeauty = new HealthAndBeautyPage();
        healthAndBeauty.goToHealthAndBeauty();
        healthAndBeauty.goToFragrances();
        Page.quitBrowser();// закрывает браузер

    }
}
