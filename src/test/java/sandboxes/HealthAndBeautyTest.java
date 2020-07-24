package sandboxes;

import Base.Page;
import PageActions.HealthAndBeautyPage;

public class HealthAndBeautyTest {
    public static void main(String[] args) {

        Page.initConfiguration();// инициализирует драйвер
        HealthAndBeautyPage health_beauty = new HealthAndBeautyPage();
        health_beauty.goToHealthAndBeauty();
        health_beauty.goToFragrances();
        Page.quitBrowser();// закрывает браузер

    }
}
