import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp() throws Exception {
        candyFlossStall = new CandyFlossStall("Flossiness", "John", "H7");
    }

    @Test
    public void hasName() {
        assertEquals("Flossiness", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("John", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("H7", candyFlossStall.getParkingSpot());
    }
}
