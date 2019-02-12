import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Best Dodgems Ever");
    }

    @Test
    public void hasName() {
        assertEquals("Best Dodgems Ever", dodgems.getName());
    }
}
