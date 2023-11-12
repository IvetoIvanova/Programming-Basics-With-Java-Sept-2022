package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String whichClass = "";
        String typeCar = "";
        double price = 0.0;

        if (budget <= 100) {
            whichClass = "Economy class";

            switch (season) {
                case "Summer":
                    typeCar = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    price = budget * 0.65;
                    break;
            }
        } else if (budget > 100 && budget <= 500) {
            whichClass = "Compact class";

            switch (season) {
                case "Summer":
                    typeCar = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    price = budget * 0.80;
                    break;
            }
        } else if (budget > 500) {
            whichClass = "Luxury class";

            switch (season) {
                case "Summer":
                case "Winter":
                    typeCar = "Jeep";
                    price = budget * 0.90;
                    break;
            }
        }
        System.out.println(whichClass);
        System.out.printf("%s - %.2f", typeCar, price);
    }
}