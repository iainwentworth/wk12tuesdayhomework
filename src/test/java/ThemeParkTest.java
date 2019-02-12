import Attractions.Attraction;
import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor1;
    Attraction attraction1;

    @Before
    public void setUp() throws Exception {
        visitor1 = new Visitor(20, 180, 50);
        attraction1 = new Rollercoaster("Cool Rollercoaster");
        themePark = new ThemePark();

    }

//    @Test
//    public void attractionCountStartsOffZero() {
//        assertEquals(0, themePark.attractionCount());
//    }

    //    @Test
//    public void canAddAttraction() {
//        themePark.addAttraction(attraction1);
//        assertEquals(1, themePark.attractionCount());
//    }
}
