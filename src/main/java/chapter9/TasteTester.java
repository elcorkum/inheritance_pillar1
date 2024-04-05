package chapter9;

public class TasteTester {
    public static void main(String[] args) {

        BirthdayCake cupcake = new BirthdayCake();
        cupcake.setFlavor("Vanilla");
        cupcake.setPrice(5.19);
        cupcake.setCandles(2);
        cupcake.printPrice();

        WeddingCake cake2 = new WeddingCake();
        cake2.setTiers(4);
        cake2.setPrice(39.99);
        cake2.setFlavor("Marble");
        cake2.printPrice();



    }
}
