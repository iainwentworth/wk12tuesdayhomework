import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        iceCreamStall = new IceCreamStall("Best Ice Cream Goodness", "Beth", "E3");
    }

    @Test
    public void hasName() {
        assertEquals("Best Ice Cream Goodness", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Beth", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("E3", iceCreamStall.getParkingSpot());
    }
}
