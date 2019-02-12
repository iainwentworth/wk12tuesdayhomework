import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Best Rollercoaster Ever");
    }

    @Test
    public void hasName() {
        assertEquals("Best Rollercoaster Ever", rollercoaster.getName());
    }
}
