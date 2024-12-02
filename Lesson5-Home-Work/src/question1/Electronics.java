package question1;

public class Electronics extends Product{
    int warranty;
    double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }
}
