import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Stephen", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Stephen", passenger.getName());
    }

    @Test
    public void canGetBags(){
        assertEquals(2, passenger.getBags());
    }


}
