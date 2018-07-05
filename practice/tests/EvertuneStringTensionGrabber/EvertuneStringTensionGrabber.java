package EvertuneStringTensionGrabber;

import EvertuneStringTensionGrabber.entities.StringSet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static EvertuneStringTensionGrabber.enums.CaliberEnum.*;
import static EvertuneStringTensionGrabber.enums.NoteEnum.*;

public class EvertuneStringTensionGrabber {

    private StringSet stringSet = new StringSet();

    @BeforeMethod
    public void setUp() {
        stringSet.addString(E, S0090);
        stringSet.addString(B, S0110);
        stringSet.addString(G, S0160);
        stringSet.addString(D, S0260);
        stringSet.addString(A, S0360);
        stringSet.addString(D, S0460);
    }

    @Test
    public void grabStringTensionValues() {
        stringSet.getStringList().forEach(guitarString ->
                System.out.println(guitarString.getNote().concat(" - " + guitarString.getCaliber()))
        );
    }
}
