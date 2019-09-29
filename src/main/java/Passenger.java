public class Passenger {

    String name;
    int bags;
    Flight flight;

    public Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public void addFlight(Flight flight){
        this.flight = flight;
    }
}
