package org.acme.grabber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.WebDriverHolder;

public class TensionCalcPage {

    private WebDriver driver = WebDriverHolder.INSTANCE.getDriver();

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
        return driver.findElement(By.cssSelector("#output")).getText();
    }

    private Select getStringSizeSelect() {
        return new Select(driver.findElement(By.cssSelector("#string_size")));
    }

    private Select getNoteSizeSelect() {
        return new Select(driver.findElement(By.cssSelector("#the_note")));
    }

    private WebElement getCalculateButton() {
        return driver.findElement(By.cssSelector("input[value='Calculate']"));
    }

}