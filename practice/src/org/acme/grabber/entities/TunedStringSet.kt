package org.acme.grabber.entities

import org.testng.Assert.assertEquals
import java.util.*

class TunedStringSet(tuning: Tuning, vendorStringSet: VendorStringSet) {
    val stringList = ArrayList<GuitarString>()

    init {
        assertEquals(tuning.noteList.size, vendorStringSet.stringSizeList.size, ERROR_MESSAGE)
        for (i in 0 until tuning.noteList.size) {
            stringList.add(GuitarString(tuning.noteList[i], vendorStringSet.stringSizeList[i]))
        }
    }

    companion object {
        private const val ERROR_MESSAGE = "Tuning/String Set size mismatch. Choose equally sized sets/tunings."
    }
}
