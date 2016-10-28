package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Scott Lindley on 10/26/2016.
 */

public class ZooTest {

    @Test
    public void addAnimalTest(){
        Lion lion = new Lion(true);

        Zoo zoo = Zoo.getInstance();

        int zooSize = zoo.getAnimals().size();
        zoo.addAnimal(lion);

        assertEquals(zooSize+1, zoo.getAnimals().size());
        assertTrue(zoo.getAnimals().contains(lion));
    }

    @Test
    public void removeAnimalTest(){
        Lion lion2 = new Lion(true);

        Zoo zoo = Zoo.getInstance();

        zoo.addAnimal(lion2);

        int zooSize = zoo.getAnimals().size();
        zoo.removeAnimal(lion2);

        assertEquals(zooSize-1, zoo.getAnimals().size());
        assertTrue(!zoo.getAnimals().contains(lion2));
    }
}
