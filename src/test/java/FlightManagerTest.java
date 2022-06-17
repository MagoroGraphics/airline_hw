import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager manager;
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    ArrayList<CabinCrewMember> cabinCrewStaff;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    ArrayList<Passenger> passengers;
    Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("Jose",Rank.CAPTAIN, "LOL5847");
        cabinCrewMember1 = new CabinCrewMember("Wilson",Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Jane", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("April", Rank.FIRST_OFFICER);
        cabinCrewStaff = new ArrayList<>();
        cabinCrewStaff.add(cabinCrewMember1);
        cabinCrewStaff.add(cabinCrewMember2);
        cabinCrewStaff.add(cabinCrewMember3);
        passenger1 = new Passenger("Juan", 1);
        passenger2 = new Passenger("Lola", 5);
        passenger3 = new Passenger("Mike", 3);
        passenger4 = new Passenger("Sebastian", 2);
        passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        plane = new Plane(PlaneType.AIRBUS_A320);
        flight = new Flight(pilot, cabinCrewStaff, passengers, plane, "ED5976", "AMS", "EDI", "15:00");
        manager = new FlightManager("Jesus");
    }

    @Test
    public void hasName(){
        assertEquals("Jesus", manager.getName());
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        assertEquals(138.0, manager.calculateBaggageWeightPerPassenger(flight), 0.0);
    }

    
}
