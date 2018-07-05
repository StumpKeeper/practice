package EvertuneStringTensionGrabber;

import java.util.List;

class StringSet {

    private List<GuitarString> stringList;

    public void addString(NoteEnum noteEnum, CaliberEnum caliberEnum) {
        stringList.add(new GuitarString(noteEnum, caliberEnum));
    }
}
