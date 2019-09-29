import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String airport;
    private long longtime;
    private Date time;

    public Flight(Plane plane, String flightNo, String destination, String airport, long time){
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.airport = airport;
        this.longtime = time;
        this.time = new Date(time);
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

    public Date getTime() {
        return time;
    }

    public void addPassenger(Passenger passenger) {
        if (this.availableSeats() > 0){
            Flight flight = new Flight(this.plane, this.flightNo, this.destination, this.airport, this.longtime);
            passenger.addFlight(flight);
            this.passengers.add(passenger);
        }
    }

    public int totalBags(){
        int total = 0;
        for (Passenger passenger : this.passengers){
            total += passenger.getBags();
        }
        return total;
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }

    public int getWeight() {
        return this.plane.getWeight();
    }
}
