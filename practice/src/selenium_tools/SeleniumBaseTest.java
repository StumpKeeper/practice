package selenium_tools;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import static selenium_tools.SeleniumHolder.chromeDriverMode.HEADLESS;

public class SeleniumBaseTest {

    private static final WebDriver headlessWebDriver = SeleniumHolder.getChromeDriver(HEADLESS);

    public static WebDriver getHeadlessWebDriver() {
        return headlessWebDriver;
    }

    @AfterClass
    public void closeWebDriver() {
        headlessWebDriver.close();
    }
}