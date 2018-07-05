package EvertuneStringTensionGrabber;

import com.wiley.SeleniumBaseTest;
import com.wiley.holders.DriverHolder;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static EvertuneStringTensionGrabber.CaliberEnum.S0090;
import static EvertuneStringTensionGrabber.CaliberEnum.S0100;
import static EvertuneStringTensionGrabber.NoteEnum.*;

public class EvertuneStringTensionGrabber extends SeleniumBaseTest {

    private StringSet stringSet = new StringSet();

    @BeforeMethod
    public void setUp() {
        stringSet.addString(E, S0090);
        stringSet.addString(B, S0100);
        stringSet.addString(G, S0100);
        stringSet.addString(D, S0100);
        stringSet.addString(A, S0100);
        stringSet.addString(D, S0100);
    }

    @Test
    public void grabStringTensionValues() {
        DriverHolder.getDriver();
    }
}
