package EvertuneStringTensionGrabber.entities;

import EvertuneStringTensionGrabber.enums.NoteEnum;
import EvertuneStringTensionGrabber.enums.StringSetsEnum;
import EvertuneStringTensionGrabber.enums.StringSizeEnum;
import EvertuneStringTensionGrabber.enums.TuningsEnum;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class StringSet {

    private List<GuitarString> stringList = new ArrayList<>();

    private static final String ERROR_MESSAGE = "Tuning/String Set size mismatch. Choose equally sized sets/tunings.";

    public StringSet(TuningsEnum tuningsEnum, StringSetsEnum stringSetsEnum) {
        assertEquals(tuningsEnum.getNoteList().size(), stringSetsEnum.getStringSizeList().size(), ERROR_MESSAGE);

        for (int i = 0; i < tuningsEnum.getNoteList().size(); i++) {
            stringList.add(new GuitarString(tuningsEnum.getNoteList().get(i), stringSetsEnum.getStringSizeList().get(i)));
        }
    }

    public StringSet addString(NoteEnum noteEnum, StringSizeEnum stringSizeEnum) {
        stringList.add(new GuitarString(noteEnum, stringSizeEnum));
        return this;
    }

    public List<GuitarString> getStringList() {
        return stringList;
    }

}
