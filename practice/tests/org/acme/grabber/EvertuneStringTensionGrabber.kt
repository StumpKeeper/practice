package org.acme.grabber

import org.acme.grabber.entities.TunedStringSet
import org.acme.grabber.entities.Tuning
import org.acme.grabber.entities.VendorStringSet.DA_12_60
import org.acme.grabber.pages.TensionCalcPage
import org.testng.annotations.Test
import selenium.SeleniumBaseTest
import selenium.WebDriverHolder
import java.util.regex.Pattern

class EvertuneStringTensionGrabber : SeleniumBaseTest() {

    @Test
    fun grabStringTensionValues() {
        WebDriverHolder.webDriver!!.get(EVERTUNE_TENSION_CALC_URL)
        calcStringSet()
        printStringSet()
    }

    private fun calcStringSet() {
        STRING_SET.stringList.forEach { guitarString ->
            val fullOutput = TensionCalcPage()
                    .setStringSizeByText(guitarString.size.value)
                    .setNoteSizeByText(guitarString.note.value)
                    .clickCalculateButton()
                    .getCalculationOutputText()
            guitarString.tension = extractTensionValue(fullOutput)
        }
    }

    private fun printStringSet() {
        STRING_SET.stringList.forEach { guitarString -> println(String.format("%s - %s - %s", guitarString.note, guitarString.size, guitarString.tension)) }
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
