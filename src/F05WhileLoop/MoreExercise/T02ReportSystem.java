package F05WhileLoop.MoreExercise;

import java.util.Scanner;

public class T02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfSales = Integer.parseInt(scanner.nextLine());

        double cashPayment = 0.0;
        double cardPayment = 0.0;
        int countCardPayment = 0;
        int countCashPayment = 0;
        int sum = 0;
        int countItem = 0;

        while (amountOfSales > sum) {
            String input = scanner.nextLine();

            if ("End".equals(input)) {
                System.out.print("Failed to collect required money for charity.");
                break;
            }

            int itemPrices = Integer.parseInt(input);
            countItem++;

            if (countItem % 2 != 0 && itemPrices > 100) {
                System.out.printf("Error in transaction!%n");
                continue;
            } else if (countItem % 2 != 0) {
                cashPayment += itemPrices;
                sum += itemPrices * 1.0;
                countCashPayment++;
                System.out.printf("Product sold!%n");
                continue;
            }

            if (itemPrices >= 10) {
                cardPayment += itemPrices;
                sum += itemPrices * 1.0;
                countCardPayment++;
                System.out.printf("Product sold!%n");
            } else {
                System.out.printf("Error in transaction!%n");
            }
        }

        double averageCS = cashPayment / (countCashPayment * 1.0);
        double averageCC = cardPayment / (countCardPayment * 1.0);
        if (amountOfSales <= sum) {
            System.out.printf("Average CS: %.2f%n", averageCS);
            System.out.printf("Average CC: %.2f", averageCC);
        }
    }
}