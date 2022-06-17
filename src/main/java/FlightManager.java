public class FlightManager {

    private String name;

    public FlightManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateBaggageWeightPerPassenger(Flight flight) {
        return flight.getPlane().getType().getTotalWeight() / flight.getPlane().getType().getCapacity();
    }
}
