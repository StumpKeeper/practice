package org.acme.grabber.entities

import org.acme.grabber.entities.StringSize.*

enum class VendorStringSet(val displayName: String, val stringSizes: List<StringSize>) {

    GE_09_46("General 9-46", listOf(S0090, S0110, S0160, S0260, S0360, S0460)),
    EB_10_52("Ernie Ball 10-52", listOf(S0100, S0130, S0170, S0300, S0420, S0520)),
    EB_11_54("Ernie Ball 11-54", listOf(S0110, S0150, S0220, S0300, S0420, S0540)),
    DA_11_56("D'Addario 11-56", listOf(S0110, S0140, S0190, S0320, S0440, S0560)),
    DA_12_60("D'Addario 12-60", listOf(S0120, S0160, S0200, S0340, S0460, S0600))
}
