package EvertuneStringTensionGrabber;

enum NoteEnum {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    G("G"),
    E("E"),
    F("F");

    private String note;

    NoteEnum(String noteName) {
        this.note = noteName;
    }

    public String getNote() {
        return note;
    }
}
