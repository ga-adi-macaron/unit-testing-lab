package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Scott Lindley on 10/26/2016.
 */

public class SnakeTest {


    @Test
    public void makeNoiseTest(){
        Snake snake = new Snake(true);
        assertEquals("Hiss!!!", snake.makeNoise());
    }

    @Test
    public void toStringTest(){
        Snake snake = new Snake(true);
        assertEquals("Snake (Poisonous)", snake.toString());
    }

    @Test
    public void hasShellTest(){
        Snake snake = new Snake(true);
        assertTrue(!snake.hasShell);
    }

    @Test
    public void getTopSpeedTest(){
        Snake snake = new Snake(true);
        assertEquals(5, snake.getTopSpeed());
    }
}
