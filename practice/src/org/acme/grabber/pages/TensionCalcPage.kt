package org.acme.grabber.pages

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import selenium.WebDriverHolder

class TensionCalcPage {

    private val driver = WebDriverHolder.webDriver

    fun getCalculationOutputText(): String? = driver?.findElement(By.cssSelector("#output"))?.text

    private val noteSizeSelect: Select
        get() = Select(driver!!.findElement(By.cssSelector("#the_note")))

    private val calculateButton: WebElement
        get() = driver!!.findElement(By.cssSelector("input[value='Calculate']"))

    fun setStringSizeByText(stringSize: String): TensionCalcPage {
        getStringSizeSelect().selectByVisibleText(stringSize)
        return this
    }

    fun setNoteSizeByText(noteValue: String): TensionCalcPage {
        noteSizeSelect.selectByVisibleText(noteValue)
        return this
    }

    fun clickCalculateButton(): TensionCalcPage {
        calculateButton.click()
        return this
    }

    private fun getStringSizeSelect(): Select = Select(driver!!.findElement(By.cssSelector("#string_size")))

}