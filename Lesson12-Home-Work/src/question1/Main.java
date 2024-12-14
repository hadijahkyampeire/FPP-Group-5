package question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputAccepted = false;

        while (!inputAccepted) {
            System.out.println("Enter a number in the range of 0 to 100:");
            try {
                int x = scanner.nextInt(); // Move this inside the try block

                if (x < 0 || x > 100) {
                    throw new UnsupportedOperationException("Input should be between 0 and 100");
                } else {
                    System.out.println("You entered: " + x);
                    inputAccepted = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Only numbers are allowed");
                
                scanner.nextLine(); // Clear the invalid input
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}