package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numOfRoses = Integer.parseInt(scanner.nextLine());
        int numOfTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double totalFlowersPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = numOfChrysanthemums * 2.00;
                rosesPrice = numOfRoses * 4.10;
                tulipsPrice = numOfTulips * 2.50;
                totalFlowersPrice = chrysanthemumsPrice + rosesPrice + tulipsPrice;

                if (holiday.equals("Y")) {
                    totalFlowersPrice = totalFlowersPrice + (totalFlowersPrice * 0.15);
                }

                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = numOfChrysanthemums * 3.75;
                rosesPrice = numOfRoses * 4.50;
                tulipsPrice = numOfTulips * 4.15;
                totalFlowersPrice = chrysanthemumsPrice + rosesPrice + tulipsPrice;

                if (holiday.equals("Y")) {
                    totalFlowersPrice = totalFlowersPrice + (totalFlowersPrice * 0.15);
                }

                break;

        }
        double numOfAllFlowers = numOfChrysanthemums + numOfRoses + numOfTulips;

        if (numOfTulips > 7 && season.equals("Spring")) {
            totalFlowersPrice = totalFlowersPrice - (totalFlowersPrice * 0.05);
        }

        if (numOfRoses >= 10 && season.equals("Winter")) {
            totalFlowersPrice = totalFlowersPrice - (totalFlowersPrice * 0.10);
        }

        if (numOfAllFlowers > 20) {
            totalFlowersPrice = totalFlowersPrice - (totalFlowersPrice * 0.20);
        }

        System.out.printf("%.2f", totalFlowersPrice + 2);
    }
}