import org.testng.Assert;
import org.testng.annotations.Test;

import static dataTypes.dataTypes.DATA_TYPES;

public class CustomTestRunner {

    @Test
    public void runTest() {
        Assert.assertEquals(DATA_TYPES, "DATA_TYPES");
        Assert.assertEquals(0, 0);
        System.out.print("OK");
    }
}
