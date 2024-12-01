package question1;

public class Exponential {
    // Recursive method to calculate x raised to the power of n
    public double power(double x, int n) {
        // Base case: Any number x to the power 0 is always 1
        if (n == 0) return 1;
        if (n == 1) return x;

        // Recursive case: x^n = x * x^(n-1)
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        // Create an instance of question1.Exponential
        Exponential exp = new Exponential();

        // Call the power method with x = 2 and n = 10
        double result = exp.power(2, 10);

        // Print the result to the console
        System.out.println("2 raised to the power of 10 is: " + result);
    }
}
// x =2, n = 10 2*..
//n= 9 2*2*
