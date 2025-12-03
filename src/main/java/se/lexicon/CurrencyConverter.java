package se.lexicon;

import java.util.Scanner;

public class CurrencyConverter {
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        IO.println("Enter amount in SEK: ");
        double amount = scanner.nextDouble();

        double usd = amount * 0.11;
        double euro = amount * 0.091;
        IO.println("Result: " + amount + " SEK = " + usd + " USD");
        IO.println("Result: " + amount + " SEK = " + euro + " EUR");
    }



}
