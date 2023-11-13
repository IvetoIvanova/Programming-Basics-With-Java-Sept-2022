package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLoads = Integer.parseInt(scanner.nextLine());
        double priceForAllTonnage = 0;

        double priceForAllTonnageVan = 0;
        double priceForAllTonnageTruck = 0;
        double priceForAllTonnageTrain = 0;

        double percentVan = 0;
        double percentTruck = 0;
        double percentTrain = 0;

        int totalCargoTonnageVan = 0;
        int totalCargoTonnageTruck = 0;
        int totalCargoTonnageTrain = 0;

        double averagePricePerTon = 0;
        double AllCargoTonnage = 0;

        for (int i = 0; i < numOfLoads; i++) {
            int cargoTonnage = Integer.parseInt(scanner.nextLine());

            AllCargoTonnage += cargoTonnage;

            if (cargoTonnage <= 3) {
                priceForAllTonnageVan = 200 * cargoTonnage;
                priceForAllTonnage += priceForAllTonnageVan;
                totalCargoTonnageVan += cargoTonnage;
            } else if (cargoTonnage <= 11) {
                priceForAllTonnageTruck = 175 * cargoTonnage;
                priceForAllTonnage += priceForAllTonnageTruck;
                totalCargoTonnageTruck += cargoTonnage;
            } else {
                priceForAllTonnageTrain = 120 * cargoTonnage;
                priceForAllTonnage += priceForAllTonnageTrain;
                totalCargoTonnageTrain += cargoTonnage;
            }

        }
        percentVan = (totalCargoTonnageVan / AllCargoTonnage) * 100.00;
        percentTruck = (totalCargoTonnageTruck / AllCargoTonnage) * 100.00;
        percentTrain = (totalCargoTonnageTrain / AllCargoTonnage) * 100.00;
        averagePricePerTon = priceForAllTonnage / AllCargoTonnage;

        System.out.printf("%.2f%n", averagePricePerTon);
        System.out.printf("%.2f%%%n", percentVan);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%%n", percentTrain);
    }
}