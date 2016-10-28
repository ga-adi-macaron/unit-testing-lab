package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by colinbradley on 10/26/16.
 */

public class Snake_Test {

    @Test
    public void isSoundCorrect(){
        Animal newSnake = new Snake(true);

        Assert.assertEquals("Hiss!!!", newSnake.makeNoise());

    }

    @Test
    public void isSpeedCorrect(){
        Animal newSnake = new Snake(false);

        Assert.assertEquals(5, newSnake.getTopSpeed());
    }
}
