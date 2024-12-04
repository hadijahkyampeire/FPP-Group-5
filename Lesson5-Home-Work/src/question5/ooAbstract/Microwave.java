package question5.ooAbstract;

// This is the OO solution for the non-OOO implementation using abstract
public class Microwave extends Appliance {
    private int powerLevel;


    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }

    @Override
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ". \n");
    }

    @Override
    public int getReading(){
        return powerLevel;
    }
}
