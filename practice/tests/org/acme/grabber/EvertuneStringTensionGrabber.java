package org.acme.grabber;

import org.acme.grabber.entities.TunedStringSet;
import org.acme.grabber.entities.Tuning;
import org.acme.grabber.pages.TensionCalcPage;
import org.testng.annotations.Test;
import selenium.SeleniumBaseTest;
import selenium.WebDriverHolder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.acme.grabber.entities.VendorStringSet.DA_12_60;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private static final String EVERTUNE_TENSION_CALC_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";
    private static final TunedStringSet STRING_SET = new TunedStringSet(Tuning.DROP_C, DA_12_60);

    @Test
    public void grabStringTensionValues() {
        WebDriverHolder.INSTANCE.getDriver().get(EVERTUNE_TENSION_CALC_URL);
        calcStringSet();
        printStringSet();
    }

    private void calcStringSet() {
        STRING_SET.getStringList().forEach(guitarString -> {
            String fullOutput = new TensionCalcPage()
                    .setStringSizeByText(guitarString.getSize().getValue())
                    .setNoteSizeByText(guitarString.getNote().getValue())
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
