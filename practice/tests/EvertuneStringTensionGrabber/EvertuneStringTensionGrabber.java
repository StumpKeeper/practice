package EvertuneStringTensionGrabber;

import EvertuneStringTensionGrabber.entities.StringSet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium_tools.SeleniumHolder;

import static EvertuneStringTensionGrabber.enums.CaliberEnum.*;
import static EvertuneStringTensionGrabber.enums.NoteEnum.*;

public class EvertuneStringTensionGrabber {

    private static final String EVERTUNE_TENSION_CALC_BASE_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";

    private final StringSet stringSet = new StringSet();
    private WebDriver webDriver = SeleniumHolder.getChromeDriver();

    @BeforeMethod
    public void setUp() {
        stringSet.addString(E, S0090);
        stringSet.addString(B, S0110);
        stringSet.addString(G, S0160);
        stringSet.addString(D, S0260);
        stringSet.addString(A, S0360);
        stringSet.addString(D, S0460);
    }

    @Test
    public void grabStringTensionValues() {
        webDriver.get(EVERTUNE_TENSION_CALC_BASE_URL);

        printStringSet(stringSet);
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
