package EvertuneStringTensionGrabber.entities;

import EvertuneStringTensionGrabber.enums.CaliberEnum;
import EvertuneStringTensionGrabber.enums.NoteEnum;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class StringSet {

    private List<GuitarString> stringList = new ArrayList<>();

    public void addString(NoteEnum noteEnum, CaliberEnum caliberEnum) {
        stringList.add(new GuitarString(valueOf(noteEnum), valueOf(caliberEnum)));
    }

    public List<GuitarString> getStringList() {
        return stringList;
    }

}
