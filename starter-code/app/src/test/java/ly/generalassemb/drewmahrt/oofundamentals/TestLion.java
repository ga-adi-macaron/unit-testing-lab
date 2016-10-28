package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by jay on 10/27/16.
 */

public class TestLion {

    public class LionTest {

        @Test
        public void testLionNoise() {
            Lion lion = new Lion(true);

            assertEquals("Roar!!!", lion.makeNoise());

        }

        @Test
        public void testLionTopSpeed() {
            Animal lion = new Lion(true);

            assertEquals(50, lion.getTopSpeed());
        }
    }
}
