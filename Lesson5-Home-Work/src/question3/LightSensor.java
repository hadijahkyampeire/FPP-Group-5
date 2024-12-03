package question3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    String location;
    LocalTime lastUpdated;
    double lightLevel;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if (lightLevel < 100) {
            return "AN ALERT TO TURN ON THE LIGHT";
        } else {
            return "LIGHT IS SUFFICIENT";
        }
    }
}
