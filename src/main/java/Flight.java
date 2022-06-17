import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> passengerList, Plane plane, String flightNum, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengerList = passengerList;
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getRemainingSeats(){
        PlaneType type = plane.getType();
        return type.getCapacity() - passengerList.size();
    }

    public void bookPassenger(Passenger passenger){
        if (getRemainingSeats() > 0) {
             passengerList.add(passenger);
        }
    }
}

