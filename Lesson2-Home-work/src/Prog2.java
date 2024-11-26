import java.util.Random;

public class Prog2 {
    public static void main(String[] args) {
        float val1 = 1.27f;
        float val2 = 3.881f;
        float val3 = 9.6f;

        int castedSum = (int) (val1 + val2 + val3);
        System.out.println("casted sum value is " + castedSum);

        float roundedSum = val1 + val2 + val3;
        int value = Math.round(roundedSum);
        System.out.println("rounded sum value is " + value);
    }
}
