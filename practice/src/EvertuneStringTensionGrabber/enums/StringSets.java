package EvertuneStringTensionGrabber.enums;

import EvertuneStringTensionGrabber.entities.GuitarString;

import java.util.List;

import static EvertuneStringTensionGrabber.enums.NoteEnum.*;
import static EvertuneStringTensionGrabber.enums.StringSizeEnum.*;

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

    public static final List<GuitarString> DROPD_11_50 = List.of(
            new GuitarString(E, S0110),
            new GuitarString(B, S0140),
            new GuitarString(G, S0180),
            new GuitarString(D, S0280),
            new GuitarString(A, S0380),
            new GuitarString(D, S0490));

    public static final List<GuitarString> DROPD_10_52 = List.of(
            new GuitarString(E, S0100),
            new GuitarString(B, S0130),
            new GuitarString(G, S0170),
            new GuitarString(D, S0300),
            new GuitarString(A, S0420),
            new GuitarString(D, S0520));

    public static final List<GuitarString> DROPC_10_52 = List.of(
            new GuitarString(D, S0100),
            new GuitarString(A, S0130),
            new GuitarString(F, S0170),
            new GuitarString(C, S0300),
            new GuitarString(G, S0420),
            new GuitarString(C, S0520));

    public static final List<GuitarString> DROPC_11_54 = List.of(
            new GuitarString(D, S0110),
            new GuitarString(A, S0150),
            new GuitarString(F, S0190),
            new GuitarString(C, S0320),
            new GuitarString(G, S0420),
            new GuitarString(C, S0540));

    public static final List<GuitarString> DROPC_11_56_DT = List.of(
            new GuitarString(D, S0110),
            new GuitarString(A, S0150),
            new GuitarString(F, S0200),
            new GuitarString(C, S0360),
            new GuitarString(G, S0480),
            new GuitarString(C, S0560));

    public static final List<GuitarString> DROPC_11_56_DAD = List.of(
            new GuitarString(D, S0110),
            new GuitarString(A, S0140),
            new GuitarString(F, S0190),
            new GuitarString(C, S0320),
            new GuitarString(G, S0440),
            new GuitarString(C, S0560));
    //12-16-24p-32-44-56
    public static final List<GuitarString> DROPC_12_56 = List.of(
            new GuitarString(D, S0120),
            new GuitarString(A, S0160),
            new GuitarString(F, S0240),
            new GuitarString(C, S0320),
            new GuitarString(G, S0440),
            new GuitarString(C, S0560));
}
