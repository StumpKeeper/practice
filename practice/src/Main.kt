import org.acme.grabber.entities.TunedStringSet
import org.acme.grabber.entities.Tuning
import org.acme.grabber.entities.VendorStringSet
import org.acme.selenium.WebDriverHolder

fun main() {
    val tunedStringSet = TunedStringSet(Tuning.DROP_D, VendorStringSet.EB_10_52)

    tunedStringSet.apply {
        calculateTension()
        prettyPrint()
    }

    WebDriverHolder.webDriver.close()

    System.exit(0)
}
