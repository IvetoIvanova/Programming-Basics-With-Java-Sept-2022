package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double totalFee = 0;
        double tariff = 0;
        if (n < 20) {
            switch (dayOrNight) {
                case "day":
                    tariff = 0.79;
                    totalFee = 0.70 + (n * tariff);
                    break;
                case "night":
                    tariff = 0.90;
                    totalFee = 0.70 + (n * tariff);
                    break;
            }
        } else if (n <= 99) {
            totalFee = 0.09 * n;
        } else {
            totalFee = 0.06 * n;
        }
        System.out.printf("%.2f", totalFee);
    }
}