package question3;

import java.time.LocalTime;

public interface Sensor {
    public String getSensorType();

    public double getReading();

    public String getLocation();

    public String getLastUpdated();

    public String performAction();
}
