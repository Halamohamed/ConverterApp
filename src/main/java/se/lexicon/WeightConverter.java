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
}
