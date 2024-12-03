package question3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    String location;
    LocalTime lastUpdated;
    double temperature;

    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return "Temperature Sensor";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
        lastUpdated = LocalTime.now();
        return lastUpdated.format(formatter).toUpperCase();
    }

    @Override
    public String performAction() {
        if (temperature > 30) {
            return "AN ALERT TO TURN ON THE AC";
        } else if (temperature < 18) {
            return "AN ALERT TO TURN ON THE HEATER";
        } else {
            return "TEMPERATURE IS IN NORMAL RANGE";
        }
    }
}
