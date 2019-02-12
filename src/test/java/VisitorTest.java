import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(33, 210, 80);
    }

    @Test
    public void hasAge() {
        assertEquals(33, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(210, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(80, visitor.getMoney());
    }
}
