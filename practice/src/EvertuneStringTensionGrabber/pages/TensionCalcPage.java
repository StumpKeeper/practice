package EvertuneStringTensionGrabber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static selenium_tools.SeleniumBaseTest.getHeadlessWebDriver;

public class TensionCalcPage {

    public TensionCalcPage setStringSizeByText(String stringSize) {
        getStringSizeSelect().selectByVisibleText(stringSize);
        return this;
    }

    public TensionCalcPage setNoteSizeByText(String noteValue) {
        getNoteSizeSelect().selectByVisibleText(noteValue);
        return this;
    }

    public TensionCalcPage clickCalculateButton() {
        getCalculateButton().click();
        return this;
    }

    public String getCalculationOutputText() {
        return getHeadlessWebDriver().findElement(By.cssSelector("#output")).getText();
    }

    private Select getStringSizeSelect() {
        return new Select(getHeadlessWebDriver().findElement(By.cssSelector("#string_size")));
    }

    private Select getNoteSizeSelect() {
        return new Select(getHeadlessWebDriver().findElement(By.cssSelector("#the_note")));
    }

    private WebElement getCalculateButton() {
        return getHeadlessWebDriver().findElement(By.cssSelector("input[value='Calculate']"));
    }

}