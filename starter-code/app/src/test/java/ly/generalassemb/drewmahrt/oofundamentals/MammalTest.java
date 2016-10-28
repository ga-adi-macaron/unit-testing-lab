package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Joe on 10/26/16.
 */

public class MammalTest {
    Mammal mMammal = new Mammal(4,50,false,"Fox") {
        @Override
        public String makeNoise() {
            return "Yip";
        }
    };

    @Test
    public void testMammalNoise(){
        assertEquals("Yip",mMammal.makeNoise());
    }

    @Test
    public void testMammalLeg(){
        assertEquals(4,mMammal.getNumLegs());

        mMammal.setNumLegs(3);
        assertEquals(3,mMammal.getNumLegs());
    }
}
