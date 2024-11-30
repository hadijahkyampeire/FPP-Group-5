package question4;

public record Circle(double radius) {

    public double computeArea(){
        double PI = Math.PI;
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {}
}
