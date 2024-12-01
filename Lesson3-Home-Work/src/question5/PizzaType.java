package question5;

public enum PizzaType {
    VEGGIE(1), PEPPERONI(2), CHEESE(1.5), BBQ_CHICKEN(2);


    // Field to store the pizza type
    private final double pizzaTypeAmount;

    // Constructor to assign value to each constant
    PizzaType(double i) {
        this.pizzaTypeAmount = i;
    }

    // Getter method to retrieve the pizza size number
    public double getPizzaType() {
        return this.pizzaTypeAmount;
    }
}
