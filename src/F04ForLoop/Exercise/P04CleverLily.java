package F04ForLoop.Exercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double savedMoney = 0;
        double giftSum = 0;

        for (int birthday = 1; birthday <= age; birthday++) {
            if (birthday % 2 == 0) {
                giftSum += 10;
                savedMoney += giftSum - 1;
            } else {
                countToys++;
            }
        }

        double totalSum = (countToys * pricePerToy) + savedMoney;
        if (totalSum >= priceWashingMachine) {
            double leftMoney = totalSum - priceWashingMachine;
            System.out.printf("Yes! %.2f", leftMoney);
        } else {
            double needMoney = priceWashingMachine - totalSum;
            System.out.printf("No! %.2f", needMoney);
        }
    }
}