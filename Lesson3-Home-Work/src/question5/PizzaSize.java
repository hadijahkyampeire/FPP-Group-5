package question5;

public enum PizzaSize {
    SMALL(8), MEDIUM(10), LARGE(12);

    // Field to store the pizza size number
    private final double sizeNumber;

    // Constructor to assign value to each constant
    PizzaSize(double i) {
        this.sizeNumber = i;
    }

    // Getter method to retrieve the pizza size number
    public double getSizeNumber() {
        return this.sizeNumber;
    }
}
