package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class T10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees >= 26.00 && degrees <= 35) {
            System.out.print("Hot");
        } else if (degrees >= 20.10 && degrees <= 25.9) {
            System.out.print("Warm");
        } else if (degrees >= 15 && degrees <= 20) {
            System.out.print("Mild");
        } else if (degrees >= 12 && degrees <= 14.9) {
            System.out.print("Cool");
        } else if (degrees >= 5 && degrees <= 11.9) {
            System.out.print("Cold");
        } else {
            System.out.print("unknown");
        }
    }
}