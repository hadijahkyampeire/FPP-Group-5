package question5.ooInterface;

// This is the OO solution for the non-OOO implementation using an interface
public class WashingMachine implements Appliance {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getReading() {
        return loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + getReading() + "kg. \n");
    }
}
