package selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SeleniumBaseTest {

    @BeforeSuite
    public void initWebDriver() {
        WebDriverHolder.init(ChromeDriverMode.NORMAL);
    }

    @AfterSuite
    public void closeWebDriver() {
        WebDriverHolder.closeDriver();
    }
}