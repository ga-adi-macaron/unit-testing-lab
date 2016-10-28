package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by Serkan on 26/10/16.
 */

public class Beaver extends Mammal {
    private boolean mIsFurry;

    public Beaver(boolean isFurry) {
        super(4,15,false,"Beaver");
        mIsFurry = isFurry;
    }

    public boolean isFurry() {
        return mIsFurry;
    }

    public void setFurry(boolean furry) {
        mIsFurry = furry;
    }

    @Override
    public String makeNoise() {
        return "Chipchip";
    }
}
