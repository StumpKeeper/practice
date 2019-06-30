package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import static selenium.ChromeDriverMode.HEADLESS;

public class WebDriverHolder {

    private static WebDriver webDriver;

    /**
     * Initializes ChromeDriver with default parameters
     */
    public static void init() {
        if (webDriver == null) {
            setDriverBinaryPaths();
            webDriver = new ChromeDriver();
        }
    }

    /**
     * Initializes ChromeDriver with custom driver mode
     *
     * @param chromeDriverMode - desired driver mode enum
     */
    public static void init(ChromeDriverMode chromeDriverMode) {
        if (webDriver == null) {
            setDriverBinaryPaths();
            if (chromeDriverMode.equals(HEADLESS)) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless", "--disable-gpu", "--disable-extensions", "window-size=1920x1080");
                webDriver = new ChromeDriver(chromeOptions);
            } else
                webDriver = new ChromeDriver();
        }
    }

    public static void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
        }
    }

    public static WebDriver getDriver() {
        Assert.assertNotNull(webDriver, "WebDriver was not properly initialized, use one of the init() methods.");
        return webDriver;
    }

    private static void setDriverBinaryPaths() {
        try {
            String projectRoot = new File(".").getCanonicalPath();
            System.setProperty("webdriver.chrome.driver", projectRoot + "/practice/res/webdriver/chromedriver.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}