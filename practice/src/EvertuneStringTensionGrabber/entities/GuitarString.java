package EvertuneStringTensionGrabber.entities;

import EvertuneStringTensionGrabber.enums.NoteEnum;
import EvertuneStringTensionGrabber.enums.StringSizeEnum;

public class GuitarString {

    private final String note;
    private final String size;
    private String tension = "";

    public GuitarString(NoteEnum note, StringSizeEnum size) {
        this.note = note.getNote();
        this.size = size.getStringSize();
    }

    public String getNote() {
        return note;
    }

    public String getSize() {
        return size;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }
}
