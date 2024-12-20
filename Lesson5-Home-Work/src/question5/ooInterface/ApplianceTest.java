package question5.ooInterface;

// This is the OO solution for the non-OOO implementation using an interface
public class ApplianceTest {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine(7);
        Appliance refrigerator = new Refrigerator(4);
        Appliance microwave = new Microwave(800);

        Appliance[] appliances = {microwave, refrigerator, washingMachine};

        System.out.println("THIS IS THE INTERFACE SOLUTION: \n");
        for (Appliance appliance : appliances) {
            System.out.println("Appliance Name: " + appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
