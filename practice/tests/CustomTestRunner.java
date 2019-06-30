import org.testng.annotations.Test;
import selenium.SeleniumBaseTest;
import selenium.WebDriverHolder;

public class CustomTestRunner extends SeleniumBaseTest {

    @Test
    public void runTest() {
        WebDriverHolder.getDriver().get("http://www.google.com");
    }
}
