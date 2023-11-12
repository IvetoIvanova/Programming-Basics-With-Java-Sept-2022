package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litersOfFuelInTheTank = Double.parseDouble(scanner.nextLine());

        if (litersOfFuelInTheTank >= 25) {
            switch (fuelType) {
                case "Diesel":
                    System.out.print("You have enough diesel.");
                    break;
                case "Gasoline":
                    System.out.print("You have enough gasoline.");
                    break;
                case "Gas":
                    System.out.print("You have enough gas.");
                    break;
                default:
                    System.out.println("Invalid fuel!");
            }
        } else if (litersOfFuelInTheTank < 25) {
            switch (fuelType) {
                case "Diesel":
                    System.out.print("Fill your tank with diesel!");
                    break;
                case "Gasoline":
                    System.out.print("Fill your tank with gasoline!");
                    break;
                case "Gas":
                    System.out.print("Fill your tank with gas!");
                    break;
                default:
                    System.out.println("Invalid fuel!");
            }
        }
    }
}