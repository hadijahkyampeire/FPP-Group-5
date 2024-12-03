package question1;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Electronics("Phone", 2000, 6, 100);
        Product p2 = new Clothing("Sweater", 1000, "Nylon", 2);
        Product p3 = new Furniture("Sofa", 250, "Leather", 12);
        Product p4 = new Electronics("Computer", 3000, 12, 100);
        Product p5 = new Product("Car", 30000);

        Product[] products = { p1, p2, p3, p4, p5 };

        for (Product product : products) {
            switch (product) {
                case Electronics electronics -> {
                    System.out.println(" The object is " + electronics.getClass().getSimpleName());
                    System.out.println("Product Name: " + electronics.getProductName());
                    System.out.println("Price: " + electronics.getPrice());
                    System.out.println("Warranty(months): " + electronics.warranty);
                    System.out.println("WarrantyCost: " + electronics.warrantyCost + "\n");
                }
                case Clothing clothing -> {
                    System.out.println(" The object is " + clothing.getClass().getSimpleName());
                    System.out.println("Product Name: " + clothing.getProductName());
                    System.out.println("Price: " + clothing.getPrice());
                    System.out.println("Brand: " + clothing.brand);
                    System.out.println("Discount percentage: " + clothing.discountPercentage + "\n");
                }
                case Furniture furniture -> {
                    System.out.println(" The object is " + furniture.getClass().getSimpleName());
                    System.out.println("Product Name: " + furniture.getProductName());
                    System.out.println("Price: " + furniture.getPrice());
                    System.out.println("Material: " + furniture.material);
                    System.out.println("Shipping cost: " + furniture.shippingCost + "\n");
                }
                case null, default -> {
                    assert product != null;
                    System.out.println(" The object is " + product.getClass().getSimpleName());
                    System.out.println("Product Name: " + product.getProductName());
                    System.out.println("Price: " + product.getPrice() + "\n");
                }
            }
        }

        System.out.println("The sum of all product prices is: " + sumProducts(products));
    }

    public static double sumProducts(Product[] products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }
}
