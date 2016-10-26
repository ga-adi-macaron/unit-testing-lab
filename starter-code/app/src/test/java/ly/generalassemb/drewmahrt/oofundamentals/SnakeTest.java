package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by KorbBookProReturns on 10/26/16.
 */

public class SnakeTest {

    @Test
    public void testIfMakeNoiseWorks(){
        Snake snake = new Snake(true);
        assertEquals("Hiss!!!",snake.makeNoise());
    }

    @Test
    public void testIfTopSpeedWorks(){
        Snake snake = new Snake(true);
        snake.setTopSpeed(5);

        assertEquals(5,snake.getTopSpeed());
    }
}
