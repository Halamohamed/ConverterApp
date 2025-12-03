package se.lexicon;

import java.util.Scanner;

import static se.lexicon.LengthConverter.getTime;

public class DataStorageConverter {

    Scanner scanner = new Scanner(System.in);

    public void menu(){
        IO.println("Enter size in KB: " );
        double kb = scanner.nextDouble();
        double mb = kb / 1024;
        double gb = mb / 1024;

        IO.println( kb + " KB -> " + mb + " MB -> " + gb + " GB");
        IO.println("Converted at: " + getTime());
    }
}
