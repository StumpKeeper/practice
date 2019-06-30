package org.acme.grabber.entities;

import lombok.Getter;
import lombok.Setter;
import org.acme.grabber.enums.Note;
import org.acme.grabber.enums.StringSize;

@Getter
public class GuitarString {

    private final String note;
    private final String size;
    @Setter
    private String tension;

    public GuitarString(Note note, StringSize size) {
        this.note = note.getNote();
        this.size = size.getStringSize();
    }
}
