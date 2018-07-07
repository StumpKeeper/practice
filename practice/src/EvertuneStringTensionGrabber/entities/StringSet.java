package EvertuneStringTensionGrabber.entities;

import EvertuneStringTensionGrabber.enums.CaliberEnum;
import EvertuneStringTensionGrabber.enums.NoteEnum;

import java.util.List;

public class StringSet {

    private List<GuitarString> stringList;

    public StringSet(List<GuitarString> stringList) {
        this.stringList = stringList;
    }

    public void addString(NoteEnum noteEnum, CaliberEnum caliberEnum) {
        stringList.add(new GuitarString(noteEnum, caliberEnum));
    }

    public List<GuitarString> getStringList() {
        return stringList;
    }

    public void setStringList(List<GuitarString> newList) {
        this.stringList = newList;
    }

}
