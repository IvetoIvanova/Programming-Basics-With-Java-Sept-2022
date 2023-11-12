package F02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetPeter = Double.parseDouble(scanner.nextLine());
        int videoCardsNum = Integer.parseInt(scanner.nextLine());
        int processorsNum = Integer.parseInt(scanner.nextLine());
        int ramMemoryNum = Integer.parseInt(scanner.nextLine());

        int videoCardsSum = videoCardsNum * 250;
        double processorsSumForOne = 0.35 * videoCardsSum;
        double processorsSumAll = processorsNum * processorsSumForOne;
        double ramMemorySumForOne = 0.10 * videoCardsSum;
        double ramMemorySumForAll = ramMemorySumForOne * ramMemoryNum;
        double totalSum = videoCardsSum + processorsSumAll + ramMemorySumForAll;

        if (videoCardsNum > processorsNum) {
            totalSum = totalSum - (0.15 * totalSum);
        }

        double lack = Math.abs(budgetPeter - totalSum);
        if (budgetPeter >= totalSum) {
            System.out.printf("You have %.2f leva left!", budgetPeter - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", lack);

        }
    }
}