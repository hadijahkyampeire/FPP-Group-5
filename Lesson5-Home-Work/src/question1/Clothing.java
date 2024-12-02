package question1;

public class Clothing extends Product {
    String brand;
    double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double discount = super.getPrice() * this.discountPercentage / 100;
        return super.getPrice() - discount;
    }
}
