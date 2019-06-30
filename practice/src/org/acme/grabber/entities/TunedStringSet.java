package org.acme.grabber.entities;

import lombok.Getter;
import org.acme.grabber.enums.Note;
import org.acme.grabber.enums.StringSet;
import org.acme.grabber.enums.StringSize;
import org.acme.grabber.enums.Tuning;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Getter
public class TunedStringSet {

    private static final String ERROR_MESSAGE = "Tuning/String Set size mismatch. Choose equally sized sets/tunings.";
    private List<GuitarString> stringList = new ArrayList<>();

    public TunedStringSet(Tuning tuning, StringSet stringSet) {
        assertEquals(tuning.getNoteList().size(), stringSet.getStringSizeList().size(), ERROR_MESSAGE);

        for (int i = 0; i < tuning.getNoteList().size(); i++) {
            stringList.add(new GuitarString(tuning.getNoteList().get(i), stringSet.getStringSizeList().get(i)));
        }
    }

    public TunedStringSet addString(Note note, StringSize stringSize) {
        stringList.add(new GuitarString(note, stringSize));
        return this;
    }
}
