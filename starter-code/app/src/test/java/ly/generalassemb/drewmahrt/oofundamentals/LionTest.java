package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Scott Lindley on 10/26/2016.
 */

public class LionTest {

    @Test
    public void isAlphaTest(){
        Lion lion = new Lion(false);

        assertTrue(!lion.isAlpha());

        lion.setIsAlpha(true);
        assertTrue(lion.isAlpha());
    }

    @Test
    public void isEndangeredTest(){
        Lion lion = new Lion(false);

        assertTrue(!lion.isEndangered());
    }

    @Test
    public void toStringTest(){
        Lion lion = new Lion(false);

        assertEquals("Lion", lion.toString());
    }

    @Test
    public void makeNoiseTest(){
        Lion lion = new Lion(false);

        assertEquals("Roar!!!", lion.makeNoise());
    }

    @Test
    public void getNumLegsTest(){
        Lion lion = new Lion(false);

        assertEquals(4, lion.getNumLegs());
    }

    @Test
    public void getTopSpeedTest(){
        Lion lion = new Lion(false);

        assertEquals(50, lion.getTopSpeed());
    }

    @Test
    public void getNameTest(){
        Lion lion = new Lion(false);

        assertEquals("Lion", lion.getName());
    }
}
