package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJuniors = Integer.parseInt(scanner.nextLine());
        int numOfSeniors = Integer.parseInt(scanner.nextLine());
        String trackType = scanner.nextLine();

        double feeJuniors = 0;
        double feeSeniors = 0;
        double feeAll = 0.00;

        switch (trackType) {
            case "trail":
                feeJuniors = numOfJuniors * 5.50;
                feeSeniors = numOfSeniors * 7.00;
                feeAll = feeJuniors + feeSeniors;
                break;
            case "cross-country":
                feeJuniors = numOfJuniors * 8.00;
                feeSeniors = numOfSeniors * 9.50;
                feeAll = feeJuniors + feeSeniors;
                if ((numOfJuniors + numOfSeniors) >= 50) {
                    feeAll = feeAll - (feeAll * 0.25);
                }
                break;
            case "downhill":
                feeJuniors = numOfJuniors * 12.25;
                feeSeniors = numOfSeniors * 13.75;
                feeAll = feeJuniors + feeSeniors;
                break;
            case "road":
                feeJuniors = numOfJuniors * 20.00;
                feeSeniors = numOfSeniors * 21.50;
                feeAll = feeJuniors + feeSeniors;
                break;
        }

        System.out.printf("%.2f", feeAll - (0.05 * feeAll));
    }
}