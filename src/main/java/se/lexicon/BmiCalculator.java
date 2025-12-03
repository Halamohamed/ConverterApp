package se.lexicon;

import java.util.Scanner;

import static se.lexicon.LengthConverter.getTime;

public class BmiCalculator {

    Scanner scanner = new Scanner(System.in);

    public void menu(){

        IO.println("Enter your height");
        double height = scanner.nextDouble();
        IO.println("Enter your weight");
        double weight = scanner.nextDouble();

        height = height/100;
        double bmi = (weight / (height * height) );

        calculateBmi(bmi);

        IO.println("Converted at: " + getTime());
    }

    private void calculateBmi(double bmi) {
        if (bmi <= 18.5 ){
            IO.println( "BMI = " + bmi +" kg/m² You are Underweight! ");
        } else if (bmi <= 25) {
            IO.println("BMI = " + bmi +" kg/m² You have Normal weight! ");
        }else if (bmi <= 30) {
            IO.println("BMI = " + bmi +" kg/m² You are Overweight! ");
        }else if( bmi > 30){
            IO.println("BMI = " + bmi +" kg/m² You are Obesity");
        }
    }
}
