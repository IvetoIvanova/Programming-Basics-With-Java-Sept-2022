package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays = Integer.parseInt(scanner.nextLine());
        int foodFromMarinaKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayDogKg = Double.parseDouble(scanner.nextLine());
        double foodPerDayCatKg = Double.parseDouble(scanner.nextLine());
        double foodPerDayTurtleGram = Double.parseDouble(scanner.nextLine());

        double dogFoodNeeded = numDays * foodPerDayDogKg;
        double catFoodNeeded = numDays * foodPerDayCatKg;
        double turtleFoodNeededKg = numDays * (foodPerDayTurtleGram / 1000);
        double totalFoodNeededKg = dogFoodNeeded + catFoodNeeded + turtleFoodNeededKg;

        if (foodFromMarinaKg >= totalFoodNeededKg) {
            double foodLeft = foodFromMarinaKg - totalFoodNeededKg;
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft));
        } else {
            double kilosNeeded = totalFoodNeededKg - foodFromMarinaKg;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(kilosNeeded));
        }
    }
}