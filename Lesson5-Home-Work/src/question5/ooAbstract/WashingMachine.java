package question5.ooAbstract;

public class WashingMachine extends Appliance {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + getReading() + "kg. \n");
    }

    @Override
    public int getReading() {
        return loadCapacity;
    }
}
