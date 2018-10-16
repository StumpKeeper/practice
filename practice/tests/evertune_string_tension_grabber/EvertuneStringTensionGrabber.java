package evertune_string_tension_grabber;

import evertune_string_tension_grabber.entities.StringSet;
import evertune_string_tension_grabber.pages.TensionCalcPage;
import org.testng.annotations.Test;
import selenium_tools.SeleniumBaseTest;
import selenium_tools.WebDriverHolder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static evertune_string_tension_grabber.enums.StringSetsEnum.DA_12_60;
import static evertune_string_tension_grabber.enums.TuningsEnum.DROP_C_SHARP;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private static final String EVERTUNE_TENSION_CALC_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";

    private static final TensionCalcPage TENSION_CALC_PAGE = new TensionCalcPage();
    private static final StringSet STRING_SET = new StringSet(DROP_C_SHARP, DA_12_60);

    @Test
    public void grabStringTensionValues() {
        WebDriverHolder.getDriver().get(EVERTUNE_TENSION_CALC_URL);
        calcStringSet();
        printStringSet();
    }

    private void calcStringSet() {
        STRING_SET.getStringList().forEach(guitarString -> {
            String fullOutput = TENSION_CALC_PAGE
                    .setStringSizeByText(guitarString.getSize())
                    .setNoteSizeByText(guitarString.getNote())
                    .clickCalculateButton()
                    .getCalculationOutputText();
            guitarString.setTension(extractTensionValue(fullOutput));
                }
        );
    }

    private void printStringSet() {
        STRING_SET.getStringList().forEach(guitarString ->
                System.out.println(String.format("%s - %s - %s", guitarString.getNote(), guitarString.getSize(), guitarString.getTension())));
    }

    private String extractTensionValue(String fullOutput) {
        Pattern p = Pattern.compile("[\\d.]+");
        Matcher m = p.matcher(fullOutput);
        return m.find() ? m.group(0) : "Value not found...";
    }


}
