package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by colinbradley on 10/26/16.
 */

public class Zoo_Test {


    @Test
    public void testCanADDAnimal(){

        Zoo testInstance = Zoo.getInstance();

        int lengthBefore = testInstance.getAnimals().size();
        System.out.println(lengthBefore);


        Animal snake = new Snake(true);
        testInstance.addAnimal(snake);


        int lengthAfter = testInstance.getAnimals().size();
        System.out.println(lengthAfter);
        Assert.assertTrue(lengthAfter > lengthBefore);

        Zoo secondInst = Zoo.getInstance();
        int finalLength = secondInst.getAnimals().size();
        System.out.print(finalLength);

    }

    @Test
    public void testCanDELETEAnimal(){

        Zoo testInstance = Zoo.getInstance();
        Animal snake = new Snake(true);
        Animal lion = new Lion(false);
        Animal lion2 = new Lion(true);
        testInstance.addAnimal(snake);
        testInstance.addAnimal(lion);
        testInstance.addAnimal(lion2);
        
        int lengthBefore = testInstance.getAnimals().size();
        System.out.println(lengthBefore);

        testInstance.getAnimals().remove(0);

        int lengthAfter = testInstance.getAnimals().size();
        System.out.println(lengthAfter);

        Assert.assertTrue(lengthAfter < lengthBefore);



    }
}
