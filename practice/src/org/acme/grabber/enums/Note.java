package org.acme.grabber.enums;

public enum Note {

    A("A"),
    As("A#/Bb"),
    B("B"),
    C("C"),
    Cs("C#/Db"),
    D("D"),
    Ds("D#/Eb"),
    G("G"),
    Gs("G#/Ab"),
    E("E"),
    F("F"),
    Fs("F#/Gb");

    public final String note;

    Note(String name) {
        this.note = name;
    }

    public String getNote() {
        return note;
    }
}
