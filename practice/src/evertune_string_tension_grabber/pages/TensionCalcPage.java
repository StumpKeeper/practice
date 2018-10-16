package evertune_string_tension_grabber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium_tools.WebDriverHolder;

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
        return WebDriverHolder.getDriver().findElement(By.cssSelector("#output")).getText();
    }

    private Select getStringSizeSelect() {
        return new Select(WebDriverHolder.getDriver().findElement(By.cssSelector("#string_size")));
    }

    private Select getNoteSizeSelect() {
        return new Select(WebDriverHolder.getDriver().findElement(By.cssSelector("#the_note")));
    }

    private WebElement getCalculateButton() {
        return WebDriverHolder.getDriver().findElement(By.cssSelector("input[value='Calculate']"));
    }

}