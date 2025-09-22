package cakes;

public class ChocolateCakeFactory implements ICakeFactory {
    @Override
    public Cake bakeCake() {
        return new ChocolateCake();
    }
}