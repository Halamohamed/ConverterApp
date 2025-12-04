package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //currency converter
        CurrencyConverter currencyConverter = new CurrencyConverter();

        //length converter
        LengthConverter lengthConverter = new LengthConverter();

        //temperature converter
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        //BMI calculator
        BmiCalculator bmiCalculator = new BmiCalculator();

        // data storage converter
        DataStorageConverter dataStorageConverter = new DataStorageConverter();

        //weight converter
        WeightConverter weightConverter = new WeightConverter();

        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            //menu
            IO.println("=== Welcome to Converter App ===");
            IO.println("Choose an option menu");
            IO.println("1- Currency converter");
            IO.println("2- Length converter");
            IO.println("3- Temperature converter ");
            IO.println("4- BMI converter ");
            IO.println("5- DataStorage converter");
            IO.println("6- Weight converter");
            IO.println("7- Time converter");
            IO.println("8- Speed converter");
            IO.println("9- Fuel Consumption converter");
            IO.println("10- Exit");
            while (!scanner.hasNextInt()) {
                IO.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            //enter option
            choice = scanner.nextInt();

            // execution of the option
            switch (choice) {
                case 1:
                    currencyConverter.menu();
                    break;
                case 2:
                    lengthConverter.menu();
                    break;
                case 3:
                    temperatureConverter.menu();
                    break;
                case 4:
                    bmiCalculator.menu();
                    break;
                case 5:
                    dataStorageConverter.menu();
                    break;
                case 6:
                    weightConverter.menu();
                    break;
                case 7:
                    weightConverter.TimeConverter();
                    break;
                case 8:
                    temperatureConverter.speedConverter();
                    break;
                case 9:
                    weightConverter.fuelConsumptionConverter();
                    break;
                case 10:
                    IO.println("Exiting ... Converter App");
                    break;
                default:
                    IO.println("Invalid choice. Try again.");
                    break;
            }

        } while (choice != 10);
        scanner.close();
    }
}
