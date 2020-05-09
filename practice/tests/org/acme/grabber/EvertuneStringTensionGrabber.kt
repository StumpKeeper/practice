package org.acme.grabber

import org.acme.grabber.entities.TunedStringSet
import org.acme.grabber.entities.Tuning
import org.acme.grabber.entities.VendorStringSet.DA_12_60
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test
import selenium.WebDriverHolder.webDriver

class EvertuneStringTensionGrabber {

    private val stringSet = TunedStringSet(Tuning.DROP_C, DA_12_60)

    @Test
    fun grabStringTensionValues() {
        stringSet.apply {
            calculateTension()
            prettyPrint()
        }
    }

    @AfterMethod
    fun closeBrowser() {
        webDriver.close()
    }
}
