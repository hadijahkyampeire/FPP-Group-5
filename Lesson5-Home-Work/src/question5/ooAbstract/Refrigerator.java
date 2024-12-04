package question5.ooAbstract;

public class Refrigerator extends Appliance {
    private int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + getReading() + "°C. \n");
    }

    @Override
    public int getReading() {
        return temperature;
    }
}
