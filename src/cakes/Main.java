package cakes;

public class Main {
    public static void main(String[] args) {
        ICakeFactory chocolateFactory = new ChocolateCakeFactory();
        Cake chocolate = chocolateFactory.bakeCake();
        chocolate.bake();
        chocolate.eat();

        System.out.println("-------------------");

        ICakeFactory vanillaFactory = new VanillaCakeFactory();
        Cake vanilla = vanillaFactory.bakeCake();
        vanilla.bake();
        vanilla.eat();
    }
}
