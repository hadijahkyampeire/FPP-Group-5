package question5.ooInterface;

// This is the OO solution for the non-OOO implementation using an interface
public class Refrigerator implements Appliance{
    private int temperature;
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public int getReading() {
        return temperature;
    }

    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + getReading() + "°C. \n");
    }
}
