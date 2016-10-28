package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Serkan on 26/10/16.
 */

public class BeaverTest {

    @Test
    public void testBeaverNoise() {
        Beaver beaver = new Beaver(true);

        assertEquals("Chipchip",beaver.makeNoise());

    }

    @Test
    public void testBeaverTopSpeed() {
        Animal beaver = new Beaver(true);

        assertEquals(15,beaver.getTopSpeed());
    }

}
