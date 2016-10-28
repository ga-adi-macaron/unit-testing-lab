package ly.generalassemb.drewmahrt.oofundamentals;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by student on 10/26/16.
 */
public class TestSnake {

    @Test
    public void testMakeNoise(){
        Snake cobra = new Snake(true);

        assertEquals("Hiss!!!", cobra.makeNoise());
    }

    @Test
    public void testTopSpeed(){
        Snake cobra = new Snake(true);

        assertEquals(5, cobra.getTopSpeed());
    }
}
