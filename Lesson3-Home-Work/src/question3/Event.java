package question3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Event {
    String eventName;
    LocalDateTime eventDateTime;

    // Constructor
    public Event(String eventName, LocalDateTime eventDateTime) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
    }

    // Main method to receive inputs and show the output
    public static void main(String[] args) {
        LocalDateTime eventDateTime = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the event: ");
        String name = sc.nextLine();

        while (eventDateTime == null) {
            // 2024-12-24 11:00
            System.out.println("Enter the date and time of the event in the format YYYY-MM-DD HH:MM ");
            String dateInput = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            try {
                LocalDateTime dateTime = LocalDateTime.parse(dateInput, formatter);
                if (dateTime.isBefore(LocalDateTime.now())) {
                    System.out.println("The date and time must be in the future! Please try again.");
                } else {
                    eventDateTime = dateTime;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date and time format! please try again");
            }
        }

        Event event  = new Event(name, eventDateTime);
        boolean isLeapYear = event.isLeapYear();

        String eventDetails = formatEventDetails(name, eventDateTime, isLeapYear);
        System.out.println(eventDetails);

        System.out.println("Enter the preferred Timezone: ");
        String timezone = sc.nextLine();

        try {
            String convertedTime = event.convertToTimezone(timezone);
            System.out.println("Event in " + timezone + " converted to " + convertedTime);
        } catch (Exception e) {
            System.out.println("Invalid Timezone");
        }
        sc.close();

    }

    // Instance method to check if its leapYear or not
    public boolean isLeapYear() {
        return eventDateTime.toLocalDate().isLeapYear();
    }


    // Function to return formated details of the event
    public static String formatEventDetails(String eventName, LocalDateTime dateTime, Boolean isLeapYear) {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm '['VV']'");
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault());
        String formattedDateTime = zonedDateTime.format(outputFormatter);
        long daysToTheEvent = ChronoUnit.DAYS.between(LocalDate.now(), zonedDateTime.toLocalDate());

        return " \n Here are your Event Details: \n Event Name: " + eventName
                + "\n Date and Time: " + formattedDateTime
                + "\n Days left to the event: " + daysToTheEvent + " days"
                + "\n Is Leap year? " + isLeapYear + "\n";
    }

    // Func to handle timezone conversion
    public String convertToTimezone(String timezone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm '['VV']'");
        ZoneId zone = ZoneId.of(timezone);
        ZonedDateTime zonedDateTime = eventDateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime convertedDateTime = zonedDateTime.withZoneSameInstant(zone);
        return convertedDateTime.format(formatter);
    }
}
