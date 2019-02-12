import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Best Park Ever");
    }

    @Test
    public void hasName() {
        assertEquals("Best Park Ever", park.getName());
    }
}
