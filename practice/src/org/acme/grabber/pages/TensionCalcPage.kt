package org.acme.grabber.pages

import org.openqa.selenium.support.ui.Select
import selenium.WebDriverHolder.webDriver
import selenium.elementByCss

object TensionCalcPage {
    const val url: String = "https://evertune.com/faq/resources/string_tension_calculator.php"

    private fun noteSizeSelect() = Select(webDriver.elementByCss("#the_note"))
    private fun calculateButton() = webDriver.elementByCss("input[value='Calculate']")
    private fun stringSizeSelect() = Select(webDriver.elementByCss("#string_size"))

    fun getCalculationOutputText() = webDriver.elementByCss("#output").text ?: ""

    fun setStringSize(stringSize: String) = apply {
        stringSizeSelect().selectByVisibleText(stringSize)
    }

    fun setNoteSize(noteValue: String) = apply {
        noteSizeSelect().selectByVisibleText(noteValue)
    }

    fun clickCalculateButton() = apply {
        calculateButton().click()
    }
}