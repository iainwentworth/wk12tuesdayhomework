import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Smokey Joe's Tobacco Stall", "Joe", "T6" );
    }

    @Test
    public void hasName() {
        assertEquals("Smokey Joe's Tobacco Stall", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Joe", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("T6", tobaccoStall.getParkingSpot());
    }
}
