package org.acme.grabber.entities

import org.acme.grabber.entities.StringSize.*

enum class VendorStringSet(val stringSizeList: List<StringSize>) {

    EB_10_52(listOf(S0100, S0130, S0170, S0300, S0420, S0520)),
    EB_11_54(listOf(S0110, S0150, S0220, S0300, S0420, S0540)),
    DA_11_56(listOf(S0110, S0140, S0190, S0320, S0440, S0560)),
    DA_12_60(listOf(S0120, S0160, S0200, S0340, S0460, S0600))
}
