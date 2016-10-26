package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by KorbBookProReturns on 10/26/16.
 */

public class ZooTest {

    @Test
    public void testIfAddOrRemoveAnimalWorks(){
        Lion roger = new Lion(true);
        int sizeOfZoo = Zoo.getInstance().getAnimals().size();
        Zoo.getInstance().addAnimal(roger);
        int sizeOfZooAfterAdded = Zoo.getInstance().getAnimals().size();

        Assert.assertEquals(sizeOfZoo + 1, sizeOfZooAfterAdded);

        sizeOfZoo = Zoo.getInstance().getAnimals().size();
        Zoo.getInstance().removeAnimal(roger);
        int sizeOfZooAfterRemoved = Zoo.getInstance().getAnimals().size();

        Assert.assertEquals(sizeOfZoo - 1, sizeOfZooAfterRemoved);
    }
}
