package question5.ooAbstract;

public class ApplianceAbstractTest {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine(7);
        Appliance refrigerator = new Refrigerator(4);
        Appliance microwave = new Microwave(800);

        Appliance[] appliances = {microwave, refrigerator, washingMachine};

        System.out.println("THIS IS THE ABSTRACT SOLUTION: \n");
        for (Appliance appliance : appliances) {
            System.out.println("Appliance Name: " + appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
