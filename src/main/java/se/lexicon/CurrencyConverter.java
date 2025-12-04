package se.lexicon;

import java.util.Scanner;

import static se.lexicon.LengthConverter.getTime;

public class CurrencyConverter {
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        IO.println("Enter amount in SEK: ");
        double amount = scanner.nextDouble();

        double usd = amount * 0.11;
        double euro = amount * 0.091;
        IO.println("Result: " + amount + " SEK = " + usd + " USD");
        IO.println("Result: " + amount + " SEK = " + euro + " EUR");

        IO.println("Converted at: " + getTime());
    }

    public void gradeConverter (){
        IO.println("Enter Percentage to convert to Grade: ");
        double percentage = scanner.nextDouble();
        getGrade(percentage);
    }

    private void getGrade(double percentage) {
        if(percentage >= 90){
            IO.println( percentage + " A ");
        } else if (percentage >=80) {
            IO.println(percentage + " B ");
        } else if (percentage >= 70) {
            IO.println(percentage + " C ");
        } else if (percentage >= 60) {
            IO.println(percentage + " D ");
        } else if (percentage >= 50) {
            IO.println(percentage + " E ");
        } else if (percentage < 50) {
            IO.println(percentage + " F ");
        }
        else {
            IO.println("try to enter a number between 1 - 100: ");
        }
    }


}
