package org.acme.grabber;

import org.acme.grabber.entities.TunedStringSet;
import org.acme.grabber.pages.TensionCalcPage;
import org.testng.annotations.Test;
import selenium.SeleniumBaseTest;
import selenium.WebDriverHolder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.acme.grabber.enums.StringSet.DA_12_60;
import static org.acme.grabber.enums.Tuning.DROP_C_SHARP;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private static final String EVERTUNE_TENSION_CALC_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";
    private static final TensionCalcPage TENSION_CALC_PAGE = new TensionCalcPage();
    private static final TunedStringSet STRING_SET = new TunedStringSet(DROP_C_SHARP, DA_12_60);

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
