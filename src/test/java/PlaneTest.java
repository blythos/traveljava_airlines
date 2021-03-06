import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(416, plane.getCapacity());
    }

    @Test
    public void canGetWeight(){
        assertEquals(2000, plane.getWeight());
    }
}
