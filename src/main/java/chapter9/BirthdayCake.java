package chapter9;

public class BirthdayCake extends Cake{
    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    @Override
    public void printPrice(){
        System.out.println("This cake has " + this.getFlavor() + " flavor, " + this.candles + " candles, and costs " + this.getPrice());
    }
}
