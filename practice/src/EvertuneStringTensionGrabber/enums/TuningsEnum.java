package EvertuneStringTensionGrabber.enums;

import java.util.Arrays;
import java.util.List;

import static EvertuneStringTensionGrabber.enums.NoteEnum.*;

public enum TuningsEnum {

    STANDARD(Arrays.asList(E, B, G, D, A, E)),
    STANDARD_D(Arrays.asList(D, A, F, C, G, D)),
    DROP_D(Arrays.asList(E, B, G, D, A, D)),
    DROP_C_SHARP(Arrays.asList(Ds, As, Fs, Cs, Gs, Cs)),
    DROP_C(Arrays.asList(D, A, F, C, G, C));

    private List<NoteEnum> noteList;

    TuningsEnum(List<NoteEnum> noteList) {
        this.noteList = noteList;
    }

    public List<NoteEnum> getNoteList() {
        return noteList;
    }
}

