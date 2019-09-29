import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FlightManagerTest {

    Plane plane;
    FlightManager manager;
    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.G500);
        this.manager = new FlightManager();
        this.flight = new Flight(plane, "KL 445", "KWI", "AMS", 1569746131);
        this.passenger = new Passenger("Joe", 2);
    }

    @Test
    public void canCalculateBaggage(){
        assertEquals(20, manager.allowedBaggage(plane));
    }

    @Test
    public void canCalculateBookedBaggage(){
        flight.addPassenger(passenger);
        assertEquals(20, manager.totalBaggage(flight));
    }

    @Test
    public void canShowWeightRemaining(){
        flight.addPassenger(passenger);
        assertEquals(180, manager.weightRemaining(flight));
    }
}
