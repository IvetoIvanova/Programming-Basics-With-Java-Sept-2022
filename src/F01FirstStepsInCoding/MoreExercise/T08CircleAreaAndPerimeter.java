package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class T08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area = 3.141592 * (r * r);
        double calculatedParameter = 2 * 3.141592 * r;

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", calculatedParameter);
    }
}