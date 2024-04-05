package chapter9;

public class WeddingCake extends Cake{
    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
    @Override
    public void printPrice(){
        System.out.println("This cake has " + this.getFlavor() + " flavor, " + this.getTiers() + " tiers, and costs " + this.getPrice());
    }
}
