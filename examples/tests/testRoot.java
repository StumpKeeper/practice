import org.testng.Assert;
import org.testng.annotations.Test;

import static dataTypes.dataTypes.DATA_TYPES;

public class testRoot {

    public void main(String[] args) {

    }

    @Test
    public void dich() {
        Assert.assertEquals(DATA_TYPES, "DATA_TYPES");
        Assert.assertEquals(0, 0);
        System.out.print("OK");
    }
}
