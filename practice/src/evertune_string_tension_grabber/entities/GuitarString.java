package evertune_string_tension_grabber.entities;

import evertune_string_tension_grabber.enums.NoteEnum;
import evertune_string_tension_grabber.enums.StringSizeEnum;

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
