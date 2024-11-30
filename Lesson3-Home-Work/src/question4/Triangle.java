package question4;

public record Triangle(double base, double height) {
    public double computeArea() {
        return (double) 1 /2 * base * height;
    }

    public static void main(String[] args) {}
}
