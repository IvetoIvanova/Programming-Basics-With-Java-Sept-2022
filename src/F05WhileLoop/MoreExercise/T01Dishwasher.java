package F05WhileLoop.MoreExercise;

import java.util.Scanner;

public class T01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesOfPreparation = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int totalMl = 0;
        int totalM2 = 0;

        int sumDishes = 0;
        int sumPots = 0;
        int amountOfPreparation = 750 * bottlesOfPreparation;
        boolean isValid = false;


        while (amountOfPreparation >= 0) {

            String input = scanner.nextLine();

            if (input.equals("End")) {
                isValid = true;
                break;
            }
            int numOfDishes = Integer.parseInt(input);


            count++;
            if (count % 3 == 0) {
                totalM2 = numOfDishes * 15;
                amountOfPreparation -= totalM2;
                sumPots += totalM2 / 15;
            } else {
                totalMl = numOfDishes * 5;
                amountOfPreparation -= totalMl;
                sumDishes = sumDishes + (totalMl / 5);
            }

        }

        if (isValid) {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", sumDishes, sumPots);
            System.out.printf("Leftover detergent %d ml.", amountOfPreparation);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(amountOfPreparation));
        }
    }
}