package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jonlieblich on 10/26/16.
 */

public class SnakeTest {

    @Test
    public void makesCorrectNoise() {
        Snake snake = new Snake(false);
        assertEquals("Hiss!!!", snake.makeNoise());
    }

    @Test
    public void showsCorrectSpeed() {
        Snake snake = new Snake(true);
        assertEquals(5, snake.getTopSpeed());
        snake.setTopSpeed(3);
        assertEquals(3, snake.getTopSpeed());
    }
}
