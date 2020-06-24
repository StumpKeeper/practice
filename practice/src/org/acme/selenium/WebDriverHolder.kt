package org.acme.selenium

import io.github.bonigarcia.wdm.managers.ChromeDriverManager
import org.acme.selenium.ChromeDriverMode.HEADLESS
import org.acme.selenium.ChromeDriverMode.NORMAL
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

object WebDriverHolder {
    val webDriver: WebDriver by lazy { init() }

    private fun init(chromeDriverMode: ChromeDriverMode = HEADLESS) = let {
        ChromeDriverManager.chromedriver().setup()
        when (chromeDriverMode) {
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