package org.acme.grabber.entities

import org.acme.grabber.pages.TensionCalcPage
import selenium.WebDriverHolder
import java.util.regex.Pattern

class TunedStringSet(private val tuning: Tuning, private val vendorStringSet: VendorStringSet) {
    private val strings = mutableListOf<GuitarString>()
    private val errorMessage = "Tuning/String Set size mismatch. Choose equally sized sets/tunings."

    init {
        if (tuning.notes.size == vendorStringSet.stringSizes.size) {
            for (i in tuning.notes.indices) {
                strings.add(GuitarString(tuning.notes[i], vendorStringSet.stringSizes[i]))
            }
        } else {
            throw IllegalArgumentException(errorMessage)
        }
    }

    fun calculateTension() {
        WebDriverHolder.webDriver.get(TensionCalcPage.url)
        strings.forEach {
            val fullOutput = TensionCalcPage
                    .setStringSize(it.size.value)
                    .setNoteSize(it.note.value)
                    .clickCalculateButton()
                    .getCalculationOutputText()
            it.tension = extractTensionValue(fullOutput)
        }
    }

    fun prettyPrint() {
        println("Tension chart for ${vendorStringSet.displayName} in ${tuning.displayName} tuning:")
        strings.forEach { println(it.toString()) }
    }

    private fun extractTensionValue(fullOutput: String?): String {
        val p = Pattern.compile("[\\d.]+")
        val m = p.matcher(fullOutput!!)
        return if (m.find()) m.group(0) else "Value not found..."
    }
}
