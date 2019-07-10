package selenium

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import selenium.ChromeDriverMode.HEADLESS
import selenium.ChromeDriverMode.NORMAL
import java.io.File
import java.io.IOException

object WebDriverHolder {
    var webDriver: WebDriver? = null

    fun init(chromeDriverMode: ChromeDriverMode = NORMAL) {
        if (webDriver == null) {
            setDriverBinaryPaths()
            webDriver = when (chromeDriverMode) {
                NORMAL -> {
                    ChromeDriver()
                }
                HEADLESS -> {
                    val chromeOptions = ChromeOptions()
                    chromeOptions.addArguments("--headless", "--disable-gpu", "--disable-extensions", "window-size=1920x1080")
                    ChromeDriver(chromeOptions)
                }
            }
        }
    }

    fun closeDriver() {
        webDriver?.close()
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