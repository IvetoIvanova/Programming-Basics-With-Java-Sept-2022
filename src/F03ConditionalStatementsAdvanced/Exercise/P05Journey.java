package F03ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String typeVacation = "";

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                typeVacation = "Camp";
                budget = budget * 0.3;
            } else if (season.equals("winter")) {
                typeVacation = "Hotel";
                budget = budget * 0.7;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                typeVacation = "Camp";
                budget = budget * 0.4;
            } else if (season.equals("winter")) {
                typeVacation = "Hotel";
                budget = budget * 0.8;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            typeVacation = "Hotel";
            budget = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeVacation, budget);
    }
}