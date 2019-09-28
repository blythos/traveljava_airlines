import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String airport;
    private String time;

    public Flight(Plane plane, String flightNo, String destination, String airport, String time){
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.airport = airport;
        this.time = time;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getAirport() {
        return airport;
    }

    public String getTime() {
        return time;
    }

    public void addPassenger(Passenger passenger) {
        if (this.availableSeats() > 0){
            this.passengers.add(passenger);
        }
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }
}
