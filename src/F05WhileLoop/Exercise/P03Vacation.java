package F05WhileLoop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationCost = Double.parseDouble(scanner.nextLine());
        double availableCash = Double.parseDouble(scanner.nextLine());

        int allDays = 0;
        int spendDays = 0;
        while (availableCash < vacationCost && spendDays < 5) {
            String action = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());

            allDays++;

            if (action.equals("spend")) {
                availableCash = availableCash - cash;
                spendDays++;
                if (availableCash < 0) {
                    availableCash = 0;
                }
            } else if (action.equals("save")) {
                availableCash = availableCash + cash;
                spendDays = 0;
            }
        }

        if (availableCash >= vacationCost) {
            System.out.printf("You saved the money for %d days.", allDays);
        }

        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }
    }
}