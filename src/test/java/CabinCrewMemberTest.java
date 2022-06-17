import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Lisa", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Lisa", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

}
