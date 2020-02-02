package org.acme.grabber.entities

import java.util.*

class TunedStringSet(tuning: Tuning, vendorStringSet: VendorStringSet) {
    val strings = ArrayList<GuitarString>()
    private val errorMessage = "Tuning/String Set size mismatch. Choose equally sized sets/tunings."

    init {
        if (tuning.noteList.size == vendorStringSet.stringSizeList.size) {
            for (i in tuning.noteList.indices) {
                strings.add(GuitarString(tuning.noteList[i], vendorStringSet.stringSizeList[i]))
            }
        } else {
            throw IllegalArgumentException(errorMessage)
        }
    }
}
