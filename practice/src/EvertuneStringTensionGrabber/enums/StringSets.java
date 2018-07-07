package EvertuneStringTensionGrabber.enums;

import EvertuneStringTensionGrabber.entities.GuitarString;

import java.util.List;

import static EvertuneStringTensionGrabber.enums.CaliberEnum.*;
import static EvertuneStringTensionGrabber.enums.NoteEnum.*;

public class StringSets {

    public static final List<GuitarString> DROPD_9_46 = List.of(
            new GuitarString(E, S0090),
            new GuitarString(B, S0110),
            new GuitarString(G, S0160),
            new GuitarString(D, S0260),
            new GuitarString(A, S0360),
            new GuitarString(D, S0460));

    public static final List<GuitarString> DROPD_10_46 = List.of(
            new GuitarString(E, S0100),
            new GuitarString(B, S0130),
            new GuitarString(G, S0170),
            new GuitarString(D, S0260),
            new GuitarString(A, S0360),
            new GuitarString(D, S0460));
}
