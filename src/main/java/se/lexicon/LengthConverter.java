package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LengthConverter {

    Scanner scanner = new Scanner(System.in);

    public void menu(){
        IO.println("Enter length in meters: ");
        double meters = scanner.nextDouble();

        double kiloMeters = meters / 1000;
        IO.println("Result: " + meters + " meter = " + kiloMeters + " kilometers");
        IO.println("Converted at: " + getTime());
    }

    public static String getTime(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.now().format(dateTimeFormatter);
    }
}
