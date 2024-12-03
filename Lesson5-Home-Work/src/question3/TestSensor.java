package question3;

import java.time.LocalTime;

public class TestSensor {
    public static void main(String[] args) {
        Sensor light1 = new LightSensor("Argiro Hall", 70);
        Sensor temperature1 = new TemperatureSensor("Verrill Hall", 10);
        Sensor sound1 = new SoundSensor("Hildenbrand Hall", 70);
        Sensor light2 = new LightSensor("H5 Hall",  110);
        Sensor temperature2 = new TemperatureSensor("McLaughlin Hall", 80);

        Sensor[] sensors = {light1, temperature1, sound1, light2, temperature2};

        for (Sensor sensor : sensors) {
            switch (sensor) {
                case LightSensor lightSensor -> {
                    System.out.println("Sensor Type: " + lightSensor.getClass().getSimpleName());
                    System.out.println("Location: " + lightSensor.getLocation());
                    System.out.println("Last Updated: " + lightSensor.getLastUpdated());
                    System.out.println("Light Level: " + lightSensor.getReading());
                    System.out.println("Action: " + lightSensor.performAction() + "\n");
                }
                case TemperatureSensor temperature -> {
                    System.out.println("Sensor Type: " + temperature.getClass().getSimpleName());
                    System.out.println("Location: " + temperature.getLocation());
                    System.out.println("Last Updated: " + temperature.getLastUpdated());
                    System.out.println("Temperature: " + temperature.getReading());
                    System.out.println("Action: " + temperature.performAction() + "\n");
                }
                case SoundSensor sound -> {
                    System.out.println("Sensor Type: " + sound.getClass().getSimpleName());
                    System.out.println("Location: " + sound.getLocation());
                    System.out.println("Last Updated: " + sound.getLastUpdated());
                    System.out.println("Sound Level: " + sound.getReading());
                    System.out.println("Action: " + sound.performAction() + "\n");
                }

                default -> {
                    System.out.println("Invalid sensor: " + sensor);
                }
            }
        }
    }
}
