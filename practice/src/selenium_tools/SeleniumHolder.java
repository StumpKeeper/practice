package selenium_tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumHolder {

    public static WebDriver getChromeDriver() {
        try {
            File projectRoot = new File(".").getCanonicalFile();
            System.setProperty("webdriver.chrome.driver", projectRoot.getPath() + "/practice/res/webdriver/chromedriver.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ChromeDriver();
    }
}
