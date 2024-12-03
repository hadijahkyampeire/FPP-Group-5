package question3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    String location;
    LocalTime lastUpdated;
    double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel > 70) {
            return "AN ALERT TO TURN ON NOISE CANCELLATION";
        } else {
           return "SOUND IS WITHIN NORMAL RANGE";
        }
    }
}
