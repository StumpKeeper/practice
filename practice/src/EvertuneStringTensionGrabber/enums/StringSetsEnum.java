package EvertuneStringTensionGrabber.enums;

import java.util.Arrays;
import java.util.List;

import static EvertuneStringTensionGrabber.enums.StringSizeEnum.*;

public enum StringSetsEnum {

    EB_10_52(Arrays.asList(S0100, S0130, S0170, S0300, S0420, S0520)),
    EB_11_54(Arrays.asList(S0110, S0150, S0220, S0300, S0420, S0540)),
    DA_11_56(Arrays.asList(S0110, S0140, S0190, S0320, S0440, S0560)),
    DA_12_60(Arrays.asList(S0120, S0160, S0200, S0340, S0460, S0600));

    private List<StringSizeEnum> stringSizeList;

    StringSetsEnum(List<StringSizeEnum> stringSizeList) {
        this.stringSizeList = stringSizeList;
    }

    public List<StringSizeEnum> getStringSizeList() {
        return stringSizeList;
    }
}
