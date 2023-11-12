package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degree = Double.parseDouble(scanner.nextLine());

        double fahrenheit = (degree * 1.8) + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}