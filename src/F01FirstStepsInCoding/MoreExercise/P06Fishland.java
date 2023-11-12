package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mackerelPriceKG = Double.parseDouble(scanner.nextLine());
        double sprinklePriceKG = Double.parseDouble(scanner.nextLine());
        double bonitoKGs = Double.parseDouble(scanner.nextLine());
        double trachurusKGs = Double.parseDouble(scanner.nextLine());
        double musselsKGs = Double.parseDouble(scanner.nextLine());

        double totalSum = 0.0;

        double bonitoPriceKG = mackerelPriceKG + (0.60 * mackerelPriceKG);
        double safridPriceKG = sprinklePriceKG + (0.80 * sprinklePriceKG);

        totalSum = (bonitoPriceKG * bonitoKGs) + (trachurusKGs * safridPriceKG) + (musselsKGs * 7.50);

        System.out.printf("%.2f", totalSum);
    }
}