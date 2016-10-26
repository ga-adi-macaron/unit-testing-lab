package ly.generalassemb.drewmahrt.oofundamentals;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by student on 10/26/16.
 */
public class TestLion {

    @Test
    public void testMakeSound(){
        Lion simba = new Lion(true);

        assertEquals("Roar!!!", simba.makeNoise());
    }

    @Test
    public void testTopSpeed(){
        Lion simba = new Lion(true);

        assertEquals(50, simba.getTopSpeed());
    }
}
