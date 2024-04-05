package shape;

public class Rectangle {
    protected int sides = 4;
    protected double length;
    protected double width;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculatePerimeter() {
        return (this.length*2) + (this.width*2);
    }
}
