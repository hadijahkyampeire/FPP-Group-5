import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        double PI = Math.PI;

        Random random = new Random();
        int randomIntX = random.nextInt(1, 10);
        double comp1 = Math.pow(PI, randomIntX);
        System.out.printf("Comp1 value is %.2f \n", comp1);
        
        int randomIntY = random.nextInt(3, 15);
        double comp2 = Math.pow(randomIntY, PI);
        System.out.printf("Comp2 value is %.2f", comp2);
    }
}