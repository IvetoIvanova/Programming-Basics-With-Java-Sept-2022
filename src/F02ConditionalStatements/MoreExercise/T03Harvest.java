package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int numOfWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = X * Y;
        double wine = (0.40 * totalGrapes) / 2.5;

        if (wine >= Z) {
            double wineRemain = wine - Z;
            double winePerWorker = wineRemain / numOfWorkers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineRemain), Math.ceil(winePerWorker));
        } else if (wine < Z) {
            double missingWine = Z - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(missingWine));
        }
    }
}