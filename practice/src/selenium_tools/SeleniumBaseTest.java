package selenium_tools;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SeleniumBaseTest {

    @BeforeSuite
    public void initWebDriver() {
        WebDriverHolder.init(ChromeDriverModeEnum.HEADLESS);
    }

    @AfterSuite
    public void closeWebDriver() {
        WebDriverHolder.closeDriver();
    }
}