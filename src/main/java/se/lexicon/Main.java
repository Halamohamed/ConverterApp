package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        LengthConverter lengthConverter = new LengthConverter();
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        BmiCalculator bmiCalculator = new BmiCalculator();
        DataStorageConverter dataStorageConverter = new DataStorageConverter();

        Scanner scanner = new Scanner(System.in);
        int choice;
       // IO.println(String.format("Hello and welcome to Converter App!"));

         do {
             IO.println("===  Converter App ===");
            IO.println("Choose an option menu");
            IO.println("1- Currency converter");
            IO.println("2- Length converter");
            IO.println("3- Temperature converter ");
            IO.println("4- BMI converter ");
            IO.println("5- DataStorage converter");
            IO.println("6- Exit");
            while (!scanner.hasNextInt()) {
                IO.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1 : currencyConverter.menu();
                break;
                case 2 : lengthConverter.menu();
                break;
                case 3 : temperatureConverter.menu();
                break;
                case 4 : bmiCalculator.menu();
                break;
                case 5 : dataStorageConverter.menu();
                break;
                case 6 : IO.println("Exiting ... Converter App");
                break;
                default: IO.println("Invalid choice. Try again.");
                break;
            }

        }while (choice != 6);
         scanner.close();
    }
}
