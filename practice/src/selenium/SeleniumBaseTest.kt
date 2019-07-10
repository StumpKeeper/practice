package selenium

import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite

open class SeleniumBaseTest {

    @BeforeSuite
    fun initWebDriver() {
        WebDriverHolder.init(ChromeDriverMode.NORMAL)
    }

    @AfterSuite
    fun closeWebDriver() {
        WebDriverHolder.closeDriver()
    }
}