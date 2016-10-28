package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Joe on 10/26/16.
 */

public class SnakeTest {
    Snake mSnake = new Snake(true);

    @Test
    public void testGetSnakeSpeed(){
        assertEquals(5,mSnake.getTopSpeed());

        mSnake.setTopSpeed(15);
        assertEquals(15,mSnake.getTopSpeed());
    }
    @Test
    public void testSnakeNoise(){
        assertEquals("Hiss!!!", mSnake.makeNoise());
    }
    @Test
    public void testSnakeToString(){
        assertEquals("Snake (Poisonous)", mSnake.toString());

        Snake notSnake = new Snake(false);
        assertEquals("Snake",notSnake.toString());
    }
}
