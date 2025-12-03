package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        LengthConverter lengthConverter = new LengthConverter();

        Scanner scanner = new Scanner(System.in);
        int choice;
        IO.println(String.format("Hello and welcome to Converter App!"));

         do {
            IO.println("Choose an option menu");
            IO.println("1- Currency converter");
            IO.println("2- Length converter");
            IO.println("3- Converter 3");
            IO.println("4- Exit");
            while (!scanner.hasNextInt()) {
                IO.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1 : currencyConverter.menu();
                break;
                case 2 : lengthConverter.menu();
                case 4 : IO.println("Exiting ...");
                break;
                default: IO.println("Invalid choice. Try again.");
                break;
            }

        }while (choice != 4);
         scanner.close();
    }
}
