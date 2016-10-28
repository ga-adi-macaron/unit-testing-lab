package ly.generalassemb.drewmahrt.oofundamentals;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by jonlieblich on 10/26/16.
 */

public class LionTest {

    @Test
    public void lionMakesCorrectNoise() {
        Animal lion = new Lion(true);
        assertEquals("Roar!!!", lion.makeNoise());
    }

    @Test
    public void getsCorrectSpeed() {
        Animal lion = new Lion(true);
        assertEquals(50, lion.getTopSpeed());
        lion.setTopSpeed(45);
        assertEquals(45, lion.getTopSpeed());
    }
}
