package org.acme.grabber.enums;

import java.util.Arrays;
import java.util.List;

import static org.acme.grabber.enums.Note.*;

public enum Tuning {

    STANDARD(Arrays.asList(E, B, G, D, A, E)),
    STANDARD_D(Arrays.asList(D, A, F, C, G, D)),
    DROP_D(Arrays.asList(E, B, G, D, A, D)),
    DROP_C_SHARP(Arrays.asList(Ds, As, Fs, Cs, Gs, Cs)),
    DROP_C(Arrays.asList(D, A, F, C, G, C));

    private List<Note> noteList;

    Tuning(List<Note> noteList) {
        this.noteList = noteList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }
}

