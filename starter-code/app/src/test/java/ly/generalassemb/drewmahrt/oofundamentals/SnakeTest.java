package ly.generalassemb.drewmahrt.oofundamentals;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by NikitaShuvalov on 10/26/16.
 */

public class SnakeTest {
    Snake poisonSnake = new Snake(true);
    Snake nonpoisonSnake = new Snake(false);

    @Test
    public void testIfpSnakeSpeedCorrect(){
        Assert.assertEquals(5, poisonSnake.getTopSpeed());
        Assert.assertEquals(5, nonpoisonSnake.getTopSpeed());
    }

    @Test
    public void testIfSnakeSoundCorrect(){
        Assert.assertEquals("Hiss!!!", poisonSnake.makeNoise());
        Assert.assertEquals("Hiss!!!", nonpoisonSnake.makeNoise());
    }
}
