public class FlightManager {
    public int allowedBaggage(Plane plane) {
        return plane.getWeight() / plane.getCapacity();
    }

    public int totalBaggage(Flight flight) {
        return flight.totalBags() * 10;
    }

    public int weightRemaining(Flight flight) {
        return flight.getWeight() - this.totalBaggage(flight);
    }
}
