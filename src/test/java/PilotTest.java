import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Bob", Rank.CADET, "FLY983497");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CADET, pilot.getRank());
    }

    @Test
    public void hasLicenseNum(){
        assertEquals("FLY983497", pilot.getLicenseNum());
    }

    @Test
    public void canFly(){
        assertEquals("Bob is flying the plane", pilot.fly());
    }

    

}
