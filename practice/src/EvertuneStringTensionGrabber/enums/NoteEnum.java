package EvertuneStringTensionGrabber.enums;

public enum NoteEnum {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    G("G"),
    E("E"),
    F("F");

    public final String note;

    NoteEnum(String noteName) {
        this.note = noteName;
    }

    public String getNote() {
        return note;
    }
}
