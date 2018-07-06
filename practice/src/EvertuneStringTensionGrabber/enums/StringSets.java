package EvertuneStringTensionGrabber.enums;

import EvertuneStringTensionGrabber.entities.StringSet;

import static EvertuneStringTensionGrabber.enums.CaliberEnum.*;
import static EvertuneStringTensionGrabber.enums.NoteEnum.*;

public class StringSets {

    public static final StringSet DROPD_9_46 = new StringSet();
    public static final StringSet DROPD_10_46 = new StringSet();

    public static void fillStringSets() {

        DROPD_9_46.addString(E, S0090);
        DROPD_9_46.addString(B, S0110);
        DROPD_9_46.addString(G, S0160);
        DROPD_9_46.addString(D, S0260);
        DROPD_9_46.addString(A, S0360);
        DROPD_9_46.addString(D, S0460);

        DROPD_10_46.addString(E, S0100);
        DROPD_10_46.addString(B, S0130);
        DROPD_10_46.addString(G, S0170);
        DROPD_10_46.addString(D, S0260);
        DROPD_10_46.addString(A, S0360);
        DROPD_10_46.addString(D, S0460);

    }

}
