package Mamontov.App.Birds;

public class BirdMarketDemo {

    public static void main(String[] args) {

        Bird[] birds = {
                new Sparrow(),
                new Chicken(),
                new Parrot("Программирование"),
                new Sparrow(),
                new Parrot("Java")
        };

        BirdMarket.makeBirdsSing(birds);
    }
}
