package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert.*;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by colinbradley on 10/26/16.
 */

public class Lion_Test {

    @Test
    public void isSoundCorrect(){
        Animal newLion = new Lion(false);

        assertEquals("Roar!!!", newLion.makeNoise());
    }

    @Test
    public void isSpeedCorrect(){
        Animal newLion = new Lion(false);

        assertEquals(50, newLion.getTopSpeed());
    }



}
