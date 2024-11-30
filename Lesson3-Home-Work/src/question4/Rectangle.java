package question4;

final public class Rectangle {
    private final double width;
    private final double length;

    // constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // getter for width
    public double getWidth() {
        return width;
    }

    // getter for length
    public double getLength() {
        return length;
    }

    // calculate the area of rectangle
    public double computeArea() {
        return width * length;
    }

    public static void main(String[] args) {}
}
