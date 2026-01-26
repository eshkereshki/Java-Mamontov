package Mamontov.App.Birds;

public class BirdDemo {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird chicken = new Chicken();
        Bird parrot = new Parrot("Привет");

        sparrow.sing();
        chicken.sing();
        parrot.sing();
        parrot.sing();
        parrot.sing();
    }
}
