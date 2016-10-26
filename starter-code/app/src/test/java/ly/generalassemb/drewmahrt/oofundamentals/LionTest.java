package ly.generalassemb.drewmahrt.oofundamentals;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by KorbBookProReturns on 10/26/16.
 */

public class LionTest {

    @Test
    public void testIfMakeNoiseWorks(){
        Lion lion = new Lion(true);
        assertEquals("Roar!!!",lion.makeNoise());
    }

    @Test
    public void testIfTopSpeedWorks(){
        Lion lion = new Lion(true);
        lion.setTopSpeed(70);

        assertEquals(70,lion.getTopSpeed());
    }
}
