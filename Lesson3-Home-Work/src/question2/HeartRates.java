package question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRates {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }



    public HeartRates(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public static int age(LocalDate birthDate) {
        Period ageCalc = Period.between(birthDate, LocalDate.now());
        return ageCalc.getYears();
    }

    public static int maxHeartRateCalc(LocalDate birthDate) {
        int age = age(birthDate);
        return 220 - age;
    }

    public static String targetHeartRateRange(LocalDate birthDate) {
        int RHR = 70;
        int MHR = maxHeartRateCalc(birthDate);
        int AHR = MHR - RHR;
        double LB = 0.5;
        double UB = 0.85;
        double LBTHR = (AHR*LB) + RHR;
        double UBTHR = (AHR*UB) + RHR;
        return "The Target Heart Rate Range is between " + LBTHR + " and " +UBTHR;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", \nlastName: " + lastName + ", \nbirthDate: " + birthDate + ", \nage: " +
                age(birthDate) + ", \nMaximumHeartRate: " + maxHeartRateCalc(birthDate);
    }

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-dd");

        Scanner sc = new Scanner(System.in);
        LocalDate birthDate = null;
        System.out.print("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println(firstName);

        System.out.print("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println(lastName);


        while (birthDate == null) {
            System.out.print("Please enter birth date in the format-(yyyy-mm-dd)-Example 1989-4-14: ");
            String birthDateInput = sc.nextLine();

            try {
                birthDate = LocalDate.parse(birthDateInput, dtf);
                System.out.println(birthDateInput);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format! please try again");
            }
        }

        System.out.println(targetHeartRateRange(birthDate));

        HeartRates heartRates = new HeartRates(firstName, lastName, birthDate);
        System.out.println(heartRates);
    }
}
