package EvertuneStringTensionGrabber;

import EvertuneStringTensionGrabber.entities.StringSet;
import EvertuneStringTensionGrabber.enums.StringSets;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium_tools.SeleniumHolder;

import static EvertuneStringTensionGrabber.enums.StringSets.DROPD_10_46;
import static EvertuneStringTensionGrabber.enums.StringSets.DROPD_9_46;

public class EvertuneStringTensionGrabber {

    private static final String EVERTUNE_TENSION_CALC_BASE_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";

    private final WebDriver webDriver = SeleniumHolder.getChromeDriver();

    @BeforeMethod
    public void setUp() {
        StringSets.fillStringSets();
    }

    @Test
    public void grabStringTensionValues() {
        webDriver.get(EVERTUNE_TENSION_CALC_BASE_URL);

        printStringSet(DROPD_9_46);
        printStringSet(DROPD_10_46);
    }

    private void printStringSet(StringSet stringSet) {
        stringSet.getStringList().forEach(guitarString ->
                System.out.println(guitarString.getNote().concat(" - " + guitarString.getCaliber()))
        );
    }

    @AfterClass
    public void closeWebDriver() {
        webDriver.close();
    }
}
