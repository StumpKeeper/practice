package evertune_string_tension_grabber.enums;

public enum NoteEnum {

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

    NoteEnum(String noteName) {
        this.note = noteName;
    }

    public String getNote() {
        return note;
    }
}
