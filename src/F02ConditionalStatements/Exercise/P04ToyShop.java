package F02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double exPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzles + dolls + bears + minions + trucks;

        double sum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;

        if (toysCount >= 50) {
            sum = sum * 0.75;
        }

        sum = sum * 0.9;

        if (exPrice <= sum) {
            System.out.printf("Yes! %.2f lv left.", sum - exPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", exPrice - sum);

        }
    }
}