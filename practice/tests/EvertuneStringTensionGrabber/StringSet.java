package EvertuneStringTensionGrabber;

import java.util.ArrayList;
import java.util.List;

class StringSet {

    private List<GuitarString> stringList = new ArrayList<GuitarString>();

    void addString(NoteEnum noteEnum, CaliberEnum caliberEnum) {
        stringList.add(new GuitarString(noteEnum, caliberEnum));
    }

    List<GuitarString> getStringList() {
        return stringList;
    }

}
