package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by jay on 10/27/16.
 */

public class TestSnake {

    public class SnakeTest {

        @Test
        public void testSnakeNoise() {
            Snake snake = new Snake(false);

            assertEquals("Hiss!!!", snake.makeNoise());
        }

        @Test
        public void testSnakeTopSpeed() {
            Animal snake = new Snake(false);

            assertEquals(5,snake.getTopSpeed());
}
