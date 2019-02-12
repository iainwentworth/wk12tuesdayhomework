import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Best Playground Ever");
    }

    @Test
    public void hasName() {
        assertEquals("Best Playground Ever", playground.getName());
    }
}
