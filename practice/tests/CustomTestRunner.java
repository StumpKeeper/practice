import org.testng.annotations.Test;
import selenium_tools.SeleniumBaseTest;
import selenium_tools.WebDriverHolder;

public class CustomTestRunner extends SeleniumBaseTest {

    @Test
    public void runTest() {
        WebDriverHolder.getDriver().get("http://www.google.com");
    }
}
