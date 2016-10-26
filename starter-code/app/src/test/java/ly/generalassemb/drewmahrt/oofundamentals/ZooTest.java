package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by jonlieblich on 10/26/16.
 */

public class ZooTest {

    private Lion lion = new Lion(false);
    private Animal snake = new Snake(false);
    private Snake snake2 = new Snake(true);
    private Mammal lion2 = new Lion(true);

    @Test
    public void addsAnimalToList() {
        Zoo.getInstance().addAnimal(lion);

        //Test for array containing a single element
        assertEquals(1, Zoo.getInstance().getAnimals().size());

        //Test for correct content of array
        assertEquals("Roar!!!", Zoo.getInstance().getAnimals().get(0).makeNoise());

        //Add multiple animals to array
        Zoo.getInstance().getAnimals().add(snake);
        Zoo.getInstance().getAnimals().add(snake2);
        Zoo.getInstance().getAnimals().add(lion2);

        //Test for correct array length
        assertEquals(4, Zoo.getInstance().getAnimals().size());

        //Test for correct order of animals
        assertEquals("Roar!!!", Zoo.getInstance().getAnimals().get(0).makeNoise());
        assertEquals("Hiss!!!", Zoo.getInstance().getAnimals().get(1).makeNoise());
        assertEquals("Hiss!!!", Zoo.getInstance().getAnimals().get(2).makeNoise());
        assertEquals("Roar!!!", Zoo.getInstance().getAnimals().get(3).makeNoise());
    }

    @Test
    public void removesAnimalFromList() {
        Zoo.getInstance().getAnimals().add(lion);

        //Ensure list contains lion before removing
        assertEquals(1, Zoo.getInstance().getAnimals().size());

        Zoo.getInstance().getAnimals().remove(0);
        assertEquals(0, Zoo.getInstance().getAnimals().size());

        //Test for trying to remove from an empty list
        String correct = "";
        try {
            Zoo.getInstance().getAnimals().remove(0);
        } catch (IndexOutOfBoundsException e) {
            correct = "exception caught";
        }
        assertEquals("exception caught", correct);
    }
}
