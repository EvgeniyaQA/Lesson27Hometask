package Base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void initConfiguration() {
        //браузеры и т.д.
        if (Constants.BROWSER.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (Constants.BROWSER.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(Constants.TESTSITEURL);

        //topNav = new TopNavigation(driver);
    }

    public static void quitBrowser() {

        driver.quit();

    }


}
