package EvertuneStringTensionGrabber.entities;

import EvertuneStringTensionGrabber.enums.NoteEnum;
import EvertuneStringTensionGrabber.enums.StringSizeEnum;

import java.util.List;

public class StringSet {

    private List<GuitarString> stringList;

    public StringSet(List<GuitarString> stringList) {
        this.stringList = stringList;
    }

    public StringSet addString(NoteEnum noteEnum, StringSizeEnum stringSizeEnum) {
        stringList.add(new GuitarString(noteEnum, stringSizeEnum));
        return this;
    }

    public List<GuitarString> getStringList() {
        return stringList;
    }

    public void setStringList(List<GuitarString> newList) {
        this.stringList = newList;
    }

}
