package EvertuneStringTensionGrabber;

class GuitarString {

    private NoteEnum note;
    private CaliberEnum caliber;

    GuitarString(NoteEnum note, CaliberEnum caliber) {
        this.note = note;
        this.caliber = caliber;
    }

    public String getNote() {
        return note.getNote();
    }

    public String getCaliber() {
        return caliber.getCaliber();
    }
}
