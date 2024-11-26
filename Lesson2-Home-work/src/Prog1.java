import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        double PI = Math.PI;

        Random random = new Random();
        int randomIntX = random.nextInt(1, 9);
        double comp1 = Math.pow(PI, randomIntX);
        System.out.println("Comp1 value is " + comp1);

        int randomIntY = random.nextInt(3, 14);
        double comp2 = Math.pow(randomIntY, PI);
        System.out.println("Comp2 value is " + comp2);
    }
}