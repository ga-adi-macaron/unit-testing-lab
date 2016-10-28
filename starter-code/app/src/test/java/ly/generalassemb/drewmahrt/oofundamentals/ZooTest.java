package ly.generalassemb.drewmahrt.oofundamentals;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by NikitaShuvalov on 10/26/16.
 */

public class ZooTest {

    @Test
    public void checkIfAddCorrect(){
        Zoo zoo = Zoo.getInstance();
        ArrayList<Animal> animals = zoo.getAnimals();
        Lion simba = new Lion(true);

        int sizeBefore = animals.size(); //Get size before we add.


        zoo.addAnimal(simba);

        animals = zoo.getAnimals(); //Get animal list for after we added simba.
        int sizeAfter = animals.size(); //Get numbers of animals after we added simba.

        Assert.assertEquals(sizeBefore+1, sizeAfter); //Check if the Zoo has one extra animal after we added Simba.
        Assert.assertSame(simba, zoo.getAnimals().get(zoo.getAnimals().size()-1)); //Check if Simba exists in the zoo.
        zoo.removeAnimal(simba); //Remove simba from list after we're done
    }

    @Test
    public void checkIfRemoveCorrect(){
        Zoo zoo = Zoo.getInstance();
        Snake kaa = new Snake(false);

        int zooSizeBefore =  zoo.getAnimals().size();
        zoo.addAnimal(kaa);
        Assert.assertEquals(zooSizeBefore, zoo.getAnimals().size()-1); //Making sure size increased, so that we can remove him.

        Assert.assertTrue(zoo.getAnimals().contains(kaa));//Check if kaa is in the zoo.
        zoo.removeAnimal(kaa);

        Assert.assertEquals(zooSizeBefore, zoo.getAnimals().size()); //Check if size is back to what we had before we added kaa.

    }
}
