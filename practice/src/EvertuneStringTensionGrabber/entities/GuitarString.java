package EvertuneStringTensionGrabber.entities;

import EvertuneStringTensionGrabber.enums.CaliberEnum;
import EvertuneStringTensionGrabber.enums.NoteEnum;

public class GuitarString {

    private final String note;
    private final String caliber;
    private String tension = "";

    public GuitarString(NoteEnum note, CaliberEnum caliber) {
        this.note = note.getNote();
        this.caliber = caliber.getCaliber();
    }

    public String getNote() {
        return note;
    }

    public String getCaliber() {
        return caliber;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }
}
