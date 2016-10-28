package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Joe on 10/26/16.
 */

public class ReptileTest {
    Reptile mReptile = new Reptile(false, 20, true, "Legless Lizard") {
        @Override
        public String makeNoise() {
            return "Burp";
        }
    };

    @Test
    public void testReptileMakeNoise(){
        assertEquals("Burp",mReptile.makeNoise());
    }

    @Test
    public void testGetName(){
        assertEquals("Legless Lizard",mReptile.getName());
    }
    @Test
    public void testReptileHasShell(){
        assertEquals(false,mReptile.getHasShell());
        mReptile.setHasShell(true);
        assertEquals(true,mReptile.getHasShell());
    }
}
