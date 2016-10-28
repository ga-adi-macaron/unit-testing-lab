package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Serkan on 26/10/16.
 */

public class ZooTest {

    @Test
    public void testZooAdd() {
        int numberOfAnimalsBefore = Zoo.getInstance().getAnimals().size();
        Snake kobra = new Snake(false);
        Zoo.getInstance().addAnimal(kobra);
        int numberOfAnimalsAfter = Zoo.getInstance().getAnimals().size();

        assertEquals(numberOfAnimalsBefore+1,numberOfAnimalsAfter);
    }

    @Test
    public void testZooRemove() {
        Lion lion = new Lion(false);
        Zoo.getInstance().addAnimal(lion);
        Zoo.getInstance().addAnimal(lion);
        int numberOfAnimalsBefore = Zoo.getInstance().getAnimals().size();
        Zoo.getInstance().removeAnimal(lion);
        int numberOfAnimalsAfter = Zoo.getInstance().getAnimals().size();

        assertEquals(numberOfAnimalsBefore-1,numberOfAnimalsAfter);
    }
}
