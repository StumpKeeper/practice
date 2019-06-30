package selenium

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.Assert
import selenium.ChromeDriverMode.HEADLESS
import selenium.ChromeDriverMode.NORMAL
import java.io.File
import java.io.IOException

object WebDriverHolder {
    private var webDriver: WebDriver? = null
    private const val DRIVER_INIT_ERROR_MESSAGE: String =
            "WebDriver was not initialized, use WebDriverHolder.init() method before calling getDriver()"

    fun getDriver(): WebDriver? {
        Assert.assertNotNull(webDriver, DRIVER_INIT_ERROR_MESSAGE)
        return webDriver
    }

    /**
     * Initializes ChromeDriver with custom driver mode
     *
     * @param chromeDriverMode - desired driver mode enum
     */
    fun init(chromeDriverMode: ChromeDriverMode = NORMAL) {
        if (webDriver == null) {
            setDriverBinaryPaths()
            webDriver = if (chromeDriverMode == HEADLESS) {
                val chromeOptions = ChromeOptions()
                chromeOptions.addArguments("--headless", "--disable-gpu", "--disable-extensions", "window-size=1920x1080")
                ChromeDriver(chromeOptions)
            } else
                ChromeDriver()
        }
    }

    fun closeDriver() {
        if (webDriver != null) {
            webDriver!!.close()
        }
    }

    private fun setDriverBinaryPaths() {
        try {
            val projectRoot = File(".").canonicalPath
            System.setProperty("webdriver.chrome.driver", "$projectRoot/practice/res/webdriver/chromedriver.exe")
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}