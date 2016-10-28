package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Joe on 10/26/16.
 */

public class LionTest {
    Lion mLion = new Lion(true);
    @Test
    public void testIsDanger(){
        mLion.setIsAlpha(false);
        assertEquals(false,mLion.isAlpha());
    }
    @Test
    public void testLionTopSpeed(){
        mLion.setTopSpeed(45);
        assertEquals(45,mLion.getTopSpeed());
    }
    @Test
    public void testLionSound(){
        assertEquals("Roar!!!",mLion.makeNoise());
    }

    @Test
    public void testLionNameToString(){
        assertEquals("Lion (Alpha)", mLion.toString());
        mLion.setIsAlpha(false);
        assertEquals("Lion",mLion.toString());
    }
}
