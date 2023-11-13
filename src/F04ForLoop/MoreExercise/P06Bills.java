package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfMonths = Integer.parseInt(scanner.nextLine());

        double averageExpenseForMonth = 0;
        double waterBill = 20.00;
        double internetBill = 15.00;
        double others = 0;
        double expenseWithoutPercent = 0;
        double allElectricityBill = 0;
        double allOthers = 0;
        double totalExpenseForAllMonths = 0;

        for (int i = 0; i < numOfMonths; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            allElectricityBill += electricityBill;
            expenseWithoutPercent = electricityBill + waterBill + internetBill;
            others = expenseWithoutPercent + (0.20 * expenseWithoutPercent);
            allOthers += others;

        }

        totalExpenseForAllMonths = allElectricityBill + allOthers + (waterBill * numOfMonths) + (internetBill * numOfMonths);
        averageExpenseForMonth = totalExpenseForAllMonths / numOfMonths;
        System.out.printf("Electricity: %.2f lv%n", allElectricityBill);
        System.out.printf("Water: %.2f lv%n", waterBill * numOfMonths);
        System.out.printf("Internet: %.2f lv%n", internetBill * numOfMonths);
        System.out.printf("Other: %.2f lv%n", allOthers);
        System.out.printf("Average: %.2f lv%n", averageExpenseForMonth);
    }
}