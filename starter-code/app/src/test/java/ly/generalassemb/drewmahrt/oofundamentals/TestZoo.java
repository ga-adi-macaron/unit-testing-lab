package ly.generalassemb.drewmahrt.oofundamentals;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by student on 10/26/16.
 */
public class TestZoo {

    @Test
    public void testAddAnimal(){
        Zoo zoo = Zoo.getInstance();
        Lion simba = new Lion(true);

        zoo.addAnimal(simba);

        assertTrue(zoo.getAnimals().contains(simba));
    }

    @Test
    public void testRemoveAnimal(){
        Zoo zoo = Zoo.getInstance();
        Lion mufasa = new Lion(false);

        zoo.addAnimal(mufasa);
        zoo.removeAnimal(mufasa);

        assertFalse(zoo.getAnimals().contains(mufasa));

    }
}
