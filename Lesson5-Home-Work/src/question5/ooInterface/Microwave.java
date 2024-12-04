package question5.ooInterface;

// This is the OO solution for the non-OOO implementation using an interface
public class Microwave implements Appliance {
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }

    @Override
    public int getReading() {
        return powerLevel;
    }

    @Override
    public void performFunction() {
        System.out.println("Heating food at power level: " + getReading() + ". \n");
    }
}
