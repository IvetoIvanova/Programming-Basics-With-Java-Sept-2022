package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double totalPriceLv = (priceKgVegetables * totalKgVegetables) + (priceKgFruits * totalKgFruits);
        double totalPriceEuro = totalPriceLv / 1.94;

        System.out.printf("%.2f", totalPriceEuro);
    }
}