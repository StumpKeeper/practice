package selenium_tools;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import static selenium_tools.SeleniumHolder.chromeDriverMode.HEADLESS;

public class SeleniumBaseTest {

    protected static final WebDriver headlessWebDriver = SeleniumHolder.getChromeDriver(HEADLESS);

    @AfterClass
    public void closeWebDriver() {
        headlessWebDriver.close();
    }
}