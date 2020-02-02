package org.acme.grabber

import org.acme.grabber.entities.TunedStringSet
import org.acme.grabber.entities.Tuning
import org.acme.grabber.entities.VendorStringSet.DA_12_60
import org.acme.grabber.pages.TensionCalcPage
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test
import selenium.WebDriverHolder.webDriver
import java.util.regex.Pattern

class EvertuneStringTensionGrabber {

    @Test
    fun grabStringTensionValues() {
        webDriver.get(EVERTUNE_TENSION_CALC_URL)
        calcStringSet()
        printStringSet()
    }

    @AfterMethod
    fun closeBrowser() {
        webDriver.close()
    }

    private fun calcStringSet() {
        STRING_SET.strings.forEach {
            val fullOutput = TensionCalcPage()
                    .setStringSize(it.size.value)
                    .setNoteSize(it.note.value)
                    .clickCalculateButton()
                    .getCalculationOutputText()
            it.tension = extractTensionValue(fullOutput)
        }
    }

    private fun printStringSet() {
        STRING_SET.strings.forEach { println(it.toString()) }
    }

    private fun extractTensionValue(fullOutput: String?): String {
        val p = Pattern.compile("[\\d.]+")
        val m = p.matcher(fullOutput!!)
        return if (m.find()) m.group(0) else "Value not found..."
    }

    companion object {
        private const val EVERTUNE_TENSION_CALC_URL = "https://evertune.com/faq/resources/string_tension_calculator.php"
        private val STRING_SET = TunedStringSet(Tuning.DROP_C, DA_12_60)
    }
}
