package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created y Joe on 10/26/16.
 */

public class ZooTest {
    Zoo mZoo = Zoo.getInstance();

    @Test
    public void testAddAnimal(){
        Animal lion = new Lion(true);

        mZoo.addAnimal(lion);

        assertTrue(mZoo.getAnimals().contains(lion));
        mZoo.getAnimals().clear();
    }

    @Test
    public void testRemoveAnimal(){
        Snake snake = new Snake(true);
        mZoo.addAnimal(snake);
        mZoo.getAnimals().remove(0);
        assertTrue(!mZoo.getAnimals().contains(snake));
    }
}
