package EvertuneStringTensionGrabber;

import EvertuneStringTensionGrabber.entities.StringSet;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import selenium_tools.SeleniumBaseTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static EvertuneStringTensionGrabber.enums.StringSets.DROPD_9_46;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private static final String EVERTUNE_TENSION_CALC_BASE_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";
    private static final StringSet STRING_SET = new StringSet(DROPD_9_46);

    @Test
    public void grabStringTensionValues() {
        getHeadlessWebDriver().get(EVERTUNE_TENSION_CALC_BASE_URL);
        calcStringSet(STRING_SET);
        printStringSet(STRING_SET);
    }

    private void calcStringSet(StringSet stringSet) {
        stringSet.getStringList().forEach(guitarString -> {
                    getStringSizeSelect().selectByVisibleText(guitarString.getCaliber());
                    getNoteSizeSelect().selectByVisibleText(guitarString.getNote());
                    clickCalculateButton();
            guitarString.setTension(extractTensionValue(getCalculationOutputText()));
                }
        );
    }

    private void printStringSet(StringSet stringSet) {
        stringSet.getStringList().forEach(guitarString ->
                System.out.println(guitarString.getNote().concat(" - " + guitarString.getCaliber()).concat(" - " + guitarString.getTension())));
    }

    private String extractTensionValue(String fullOutput) {
        Pattern p = Pattern.compile("[\\d.]+");
        Matcher m = p.matcher(fullOutput);
        return m.find() ? m.group(0) : "Value not found...";
    }

    private Select getStringSizeSelect() {
        return new Select(getHeadlessWebDriver().findElement(By.cssSelector("#string_size")));
    }

    private Select getNoteSizeSelect() {
        return new Select(getHeadlessWebDriver().findElement(By.cssSelector("#the_note")));
    }

    private void clickCalculateButton() {
        getHeadlessWebDriver().findElement(By.cssSelector("input[value='Calculate']")).click();
    }

    private String getCalculationOutputText() {
        return getHeadlessWebDriver().findElement(By.cssSelector("#output")).getText();
    }
}
