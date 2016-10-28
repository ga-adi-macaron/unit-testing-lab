package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Serkan on 26/10/16.
 */

public class LionTest {

    @Test
    public void testLionNoise() {
        Lion lion = new Lion(true);

        assertEquals("Roar!!!",lion.makeNoise());

    }

    @Test
    public void testLionTopSpeed() {
        Animal lion = new Lion(true);

        assertEquals(50,lion.getTopSpeed());
    }

}
