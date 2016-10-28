package ly.generalassemb.drewmahrt.oofundamentals;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by NikitaShuvalov on 10/26/16.
 */

public class LionTest {
    private Lion alphaLion = new Lion(true);
    private Lion betaLion = new Lion(false);

    @Test
    public void testIfLionTopSpeedCorrect(){
        Assert.assertEquals(50, alphaLion.getTopSpeed());
        Assert.assertEquals(50, betaLion.getTopSpeed());
    }

    @Test
    public void testifLionSoundCorrect(){
        Assert.assertEquals("Roar!!!",alphaLion.makeNoise());
        Assert.assertEquals("Roar!!!", betaLion.makeNoise());
    }
}
