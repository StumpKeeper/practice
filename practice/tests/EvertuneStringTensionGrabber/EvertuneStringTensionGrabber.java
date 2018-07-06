package EvertuneStringTensionGrabber;

import EvertuneStringTensionGrabber.entities.StringSet;
import EvertuneStringTensionGrabber.enums.StringSets;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium_tools.SeleniumBaseTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static EvertuneStringTensionGrabber.enums.StringSets.DROPD_10_46;
import static EvertuneStringTensionGrabber.enums.StringSets.DROPD_9_46;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private static final String EVERTUNE_TENSION_CALC_BASE_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";

    @BeforeMethod
    public void setUp() {
        StringSets.fillStringSets();
    }

    @Test
    public void grabStringTensionValues() {
        headlessWebDriver.get(EVERTUNE_TENSION_CALC_BASE_URL);

        printStringSet(DROPD_9_46);
        printStringSet(DROPD_10_46);
    }

    private void printStringSet(StringSet stringSet) {
        stringSet.getStringList().forEach(guitarString -> {
                    getStringSizeSelect().selectByVisibleText(guitarString.getCaliber());
                    getNoteSizeSelect().selectByVisibleText(guitarString.getNote());
                    clickCalculateButton();
                    System.out.println(guitarString.getNote().concat(" - " + guitarString.getCaliber()).concat(" - " + extractTensionValue(getCalculationOutputText())));
                }
        );
    }

    private String extractTensionValue(String fullOutput) {
        Pattern p = Pattern.compile("[\\d.]+");
        Matcher m = p.matcher(fullOutput);
        return m.find() ? m.group(0) : "Value not found...";
    }

    private Select getStringSizeSelect() {
        return new Select(headlessWebDriver.findElement(By.cssSelector("#string_size")));
    }

    private Select getNoteSizeSelect() {
        return new Select(headlessWebDriver.findElement(By.cssSelector("#the_note")));
    }

    private void clickCalculateButton() {
        headlessWebDriver.findElement(By.cssSelector("input[value='Calculate']")).click();
    }

    private String getCalculationOutputText() {
        return headlessWebDriver.findElement(By.cssSelector("#output")).getText();
    }
}
