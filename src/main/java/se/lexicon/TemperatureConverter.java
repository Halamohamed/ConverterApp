package se.lexicon;

import java.util.Scanner;

import static se.lexicon.LengthConverter.getTime;

public class TemperatureConverter {

    Scanner scanner = new Scanner(System.in);

    public void menu(){
        IO.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) +32;

        IO.println("Result: " + celsius + " ℃ = " + fahrenheit + " ℉");
        IO.println("Converted at:"  + getTime());

    }
    public void speedConverter(){
        IO.println("Enter km/h to convert to m/s");
        double kmh = scanner.nextDouble();
        double meterPerSecond = kmh / 3.6;
        IO.println( kmh + " km/h = " + meterPerSecond + " m/s");
        IO.println("Converted at: " + getTime());
    }
}
