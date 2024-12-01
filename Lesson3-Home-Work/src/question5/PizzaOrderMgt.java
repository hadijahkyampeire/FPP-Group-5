package question5;

public class PizzaOrderMgt {
    PizzaSize pizzaSize;
    PizzaType pizzaType;
    int quantity;
    double price;


    private static final double TAX_RATE = 0.03;

    public PizzaOrderMgt(PizzaSize pizzaSize, PizzaType pizzaType, Integer quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {
        double sizePrice;
        double typePrice;

        sizePrice = switch (pizzaSize) {
            case LARGE, SMALL, MEDIUM -> pizzaSize.getSizeNumber();
        };

        typePrice = switch (pizzaType) {
            case CHEESE, PEPPERONI, BBQ_CHICKEN, VEGGIE -> pizzaType.getPizzaType();
        };

        this.price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        double taxRate = TAX_RATE * price;
        double totalPrice = price + taxRate;

        return String.format("""
                Pizza Order: \
                Size: %s
                Type: %s
                Qty: %d
                Price: $%.2f
                Tax: $%.2f
                Total Price: $%.2f
                """, pizzaSize, pizzaType, quantity, price, taxRate, totalPrice);

    }

    public static void main(String[] args) {
        PizzaOrderMgt pizza1 = new PizzaOrderMgt(PizzaSize.SMALL, PizzaType.VEGGIE,2);
        PizzaOrderMgt pizza2 = new PizzaOrderMgt(PizzaSize.MEDIUM, PizzaType.PEPPERONI,1);
        PizzaOrderMgt pizza3 = new PizzaOrderMgt(PizzaSize.LARGE, PizzaType.BBQ_CHICKEN,2);
        System.out.println(pizza1.printOrderSummary());
        System.out.println(pizza2.printOrderSummary());
        System.out.println(pizza3.printOrderSummary());
    }

}
