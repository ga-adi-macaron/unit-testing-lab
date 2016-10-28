package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Joe on 10/26/16.
 */

public class AnimalTest {
    Animal mAnimal = new Animal(54,false,"Robot") {
        @Override
        public String makeNoise() {
            return "Beep";
        }
    };
    @Test
    public void testGetTopSpeed(){
        mAnimal.setTopSpeed(50);
        assertEquals(50,mAnimal.getTopSpeed());
    }
    @Test
    public void testGetName(){
        mAnimal.setName("Whale");
        assertEquals("Whale",mAnimal.getName());
    }
    @Test
    public void testGetNoise(){
        assertEquals("Beep",mAnimal.makeNoise());
    }
    @Test
    public void testIsEndangered(){
        mAnimal.setIsEndangered(true);
        assertEquals(true,mAnimal.isEndangered());
    }
}
