package org.acme.grabber.pages

import org.openqa.selenium.support.ui.Select
import selenium.WebDriverHolder.webDriver
import selenium.elementByCss

class TensionCalcPage {
    private val noteSizeSelect = Select(webDriver.elementByCss("#the_note"))

    private val calculateButton = webDriver.elementByCss("input[value='Calculate']")

    private val stringSizeSelect = Select(webDriver.elementByCss("#string_size"))

    fun getCalculationOutputText() = webDriver.elementByCss("#output").text ?: ""

    fun setStringSize(stringSize: String) = apply {
        stringSizeSelect.selectByVisibleText(stringSize)
    }

    fun setNoteSize(noteValue: String) = apply {
        noteSizeSelect.selectByVisibleText(noteValue)
    }

    fun clickCalculateButton() = apply {
        calculateButton.click()
    }
}