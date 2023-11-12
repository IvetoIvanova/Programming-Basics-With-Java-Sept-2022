package F02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfExtras = Integer.parseInt(scanner.nextLine());
        double priceClothingForOne = Double.parseDouble(scanner.nextLine());
        double decor = 0.10 * budget;
        double priceForAllExtras = priceClothingForOne * numberOfExtras;

        if (numberOfExtras > 150) {
            priceForAllExtras = priceForAllExtras - (0.10 * priceForAllExtras);

        }

        double totalSum = decor + priceForAllExtras;
        double lack = Math.abs(budget - totalSum);
        double remainder = Math.abs(totalSum - budget);

        if (totalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", lack);
        } else if (totalSum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainder);
        }
    }
}