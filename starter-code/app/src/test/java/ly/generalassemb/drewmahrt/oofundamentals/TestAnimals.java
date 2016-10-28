package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by justinwells on 10/26/16.
 */

public class TestAnimals {

    @Test
    public void testLionSound () {
        Lion lion = new Lion(true);
        Assert.assertEquals("Roar!!!",lion.makeNoise());
    }

    @Test
    public void testLionSpeed () {
        Lion lion = new Lion(true);
        Assert.assertEquals(50,lion.getTopSpeed());
    }

    @Test
    public void testSnakeSound () {
        Snake snake = new Snake (true);
        Assert.assertEquals("Hiss!!!", snake.makeNoise());
    }

    @Test
    public void testSnakeSpeed () {
        Snake snake = new Snake(true);
        Assert.assertEquals(5,snake.getTopSpeed());
    }

    @Test
    public void testIfZooAddsAnimals () {
        Lion cecil = new Lion (false);
        Zoo.getInstance().addAnimal(cecil);
        Assert.assertTrue(Zoo.getInstance().getAnimals().contains(cecil));
    }
}
