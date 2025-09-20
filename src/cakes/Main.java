package cakes;

public class Main {
    public static void main(String[] args) {
        CakeFactory chocolateFactory = new ChocolateCakeFactory();
        Cake chocolate = chocolateFactory.bakeCake();
        chocolate.bake();
        chocolate.eat();

        System.out.println("-------------------");

        CakeFactory vanillaFactory = new VanillaCakeFactory();
        Cake vanilla = vanillaFactory.bakeCake();
        vanilla.bake();
        vanilla.eat();
    }
}
