package selenium

import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import selenium.ChromeDriverMode.HEADLESS
import selenium.ChromeDriverMode.NORMAL

object WebDriverHolder {
    val webDriver: WebDriver by lazy { init() }

    private fun init(chromeDriverMode: ChromeDriverMode = NORMAL) = let {
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