package selenium_tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

import static selenium_tools.SeleniumHolder.chromeDriverMode.HEADLESS;

public class SeleniumHolder {

    public static WebDriver getChromeDriver(chromeDriverMode headless) {
        try {
            String projectRoot = new File(".").getCanonicalPath();
            System.setProperty("webdriver.chrome.driver", projectRoot + "/practice/res/webdriver/chromedriver.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (headless.equals(HEADLESS)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless", "--disable-gpu", "--disable-extensions", "window-size=1366x768");
            return new ChromeDriver(chromeOptions);
        } else
            return new ChromeDriver();
    }

    public enum chromeDriverMode {
        NORMAL, HEADLESS
    }
}