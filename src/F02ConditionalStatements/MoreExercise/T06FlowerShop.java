package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMagnolias = Integer.parseInt(scanner.nextLine());
        int numOfHyacinths = Integer.parseInt(scanner.nextLine());
        int numOfRoses = Integer.parseInt(scanner.nextLine());
        int numOfCacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double sumOfMagnolias = numOfMagnolias * 3.25;
        double sumOfHyacinths = numOfHyacinths * 4;
        double sumOfRoses = numOfRoses * 3.50;
        double sumOfCacti = numOfCacti * 8;

        double totalSumFlowers = sumOfMagnolias + sumOfHyacinths + sumOfRoses + sumOfCacti;

        double sumWithoutTax = totalSumFlowers - (totalSumFlowers * 0.05);

        if (giftPrice <= sumWithoutTax) {
            System.out.printf("She is left with %.0f leva.", Math.floor(sumWithoutTax - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - sumWithoutTax));
        }
    }
}