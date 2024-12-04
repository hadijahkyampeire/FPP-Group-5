package question5.ooInterface;

// This is the OO solution for the non-OOO implementation using an interface
public class ApplianceTest {
    public static void main(String[] args) {
        Appliance microwave = new Microwave(180);
        Appliance refrigerator = new Refrigerator(20);
        Appliance washingMachine = new WashingMachine(25);

        Appliance[] appliances = {microwave, refrigerator, washingMachine};

        for (Appliance appliance : appliances) {
            System.out.println("Appliance Name: " + appliance.getClass().getSimpleName());
            appliance.performAction();
        }
    }
}
