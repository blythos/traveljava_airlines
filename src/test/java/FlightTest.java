import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Plane plane;
    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.G500);
        this.flight = new Flight(plane, "KL 445", "KWI", "AMS", "15:52");
        this.passenger = new Passenger("Joe", 2);
    }

    @Test
    public void canGetFlightNo(){
        assertEquals("KL 445", flight.getFlightNo());
    }

    @Test
    public void canGetDestination(){
        assertEquals("KWI", flight.getDestination());
    }

    @Test
    public void cangetAirport(){
        assertEquals("AMS", flight.getAirport());
    }

    @Test
    public void canGetTime(){
        assertEquals("15:52", flight.getTime());
    }

    @Test
    public void canGetAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(9, flight.availableSeats());
    }

    @Test
    public void canOnlyAddPassengersToCapacity(){
        // Adds passengers to capacity
        for (int i = 0; i < plane.getCapacity(); i++) {
            flight.addPassenger(passenger);
        }
        // Attempts to add one more beyond capacity
        flight.addPassenger(passenger);
        assertEquals(0, flight.availableSeats());
    }

}
