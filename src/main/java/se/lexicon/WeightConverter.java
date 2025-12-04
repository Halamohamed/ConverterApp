package se.lexicon;

import java.util.Scanner;

import static se.lexicon.LengthConverter.getTime;

public class WeightConverter {
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        IO.println("Enter weight by Kilogram:");

        double kilograms = scanner.nextDouble();
        double grams = kilograms * 1000;

        IO.println( kilograms + " Kg -> " + grams + " Grams.");
        IO.println("Converted at: " + getTime());

    }
    public void TimeConverter(){
        int time;
        IO.println("Enter hours to convert it to minutes: ");
        int hours = scanner.nextInt();
        int minutes = hours* 60;

        IO.println(hours + " hours = " + minutes + " minutes");
        IO.println("Converted at: " + getTime());
    }

    public void fuelConsumptionConverter(){
        IO.println("Enter L/100km to convert to km/L");
        double lPerKm = scanner.nextDouble();
        double kmPerL = 100 / lPerKm;

        IO.println( lPerKm + " L/100km = " + kmPerL + " km/L");
        IO.println("Converted at: " + getTime());
    }
}
