import org.acme.grabber.entities.TunedStringSet
import org.acme.grabber.entities.Tuning
import org.acme.grabber.entities.VendorStringSet
import org.acme.selenium.WebDriverHolder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val stringSet = TunedStringSet(Tuning.DROP_D, VendorStringSet.GE_09_46)

        stringSet.apply {
            calculateTension()
            prettyPrint()
        }

        WebDriverHolder.webDriver.close()

        readLine()
    }
}
