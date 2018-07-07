package EvertuneStringTensionGrabber;

import EvertuneStringTensionGrabber.entities.StringSet;
import EvertuneStringTensionGrabber.pages.TensionCalcPage;
import org.testng.annotations.Test;
import selenium_tools.SeleniumBaseTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static EvertuneStringTensionGrabber.enums.StringSets.DROPC_12_56;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private static final String EVERTUNE_TENSION_CALC_BASE_URL = "https://evertune.com/faq/resources/string_tension_calculator.php";

    private static final TensionCalcPage TENSION_CALC_PAGE = new TensionCalcPage();
    private static final StringSet STRING_SET = new StringSet(DROPC_12_56);

    @Test
    public void grabStringTensionValues() {
        getHeadlessWebDriver().get(EVERTUNE_TENSION_CALC_BASE_URL);
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
