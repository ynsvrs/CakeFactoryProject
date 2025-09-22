package cakes;

public class VanillaCakeFactory implements ICakeFactory {
    @Override
    public Cake bakeCake() {
        return new VanillaCake();
    }
}
