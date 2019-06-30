package org.acme.grabber.enums;

import java.util.Arrays;
import java.util.List;

import static org.acme.grabber.enums.StringSize.*;

public enum StringSet {

    EB_10_52(Arrays.asList(S0100, S0130, S0170, S0300, S0420, S0520)),
    EB_11_54(Arrays.asList(S0110, S0150, S0220, S0300, S0420, S0540)),
    DA_11_56(Arrays.asList(S0110, S0140, S0190, S0320, S0440, S0560)),
    DA_12_60(Arrays.asList(S0120, S0160, S0200, S0340, S0460, S0600));

    private List<StringSize> stringSizeList;

    StringSet(List<StringSize> stringSizeList) {
        this.stringSizeList = stringSizeList;
    }

    public List<StringSize> getStringSizeList() {
        return stringSizeList;
    }
}
