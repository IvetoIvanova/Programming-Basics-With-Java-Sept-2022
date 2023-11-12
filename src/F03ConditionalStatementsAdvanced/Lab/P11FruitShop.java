package F03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isValidData = false;

        boolean isWorkingDay = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday");
        boolean weekend = dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");
        double price = 0.0;

        if (isWorkingDay) {
            if (nameFruit.equals("banana")) {
                price = 2.50;
            } else if (nameFruit.equals("apple")) {
                price = 1.20;
            } else if (nameFruit.equals("orange")) {
                price = 0.85;
            } else if (nameFruit.equals("grapefruit")) {
                price = 1.45;
            } else if (nameFruit.equals("kiwi")) {
                price = 2.70;
            } else if (nameFruit.equals("pineapple")) {
                price = 5.50;
            } else if (nameFruit.equals("grapes")) {
                price = 3.85;
            } else {
                isValidData = true;
            }
        } else if (weekend) {
            if (nameFruit.equals("banana")) {
                price = 2.70;
            } else if (nameFruit.equals("apple")) {
                price = 1.25;
            } else if (nameFruit.equals("orange")) {
                price = 0.90;
            } else if (nameFruit.equals("grapefruit")) {
                price = 1.60;
            } else if (nameFruit.equals("kiwi")) {
                price = 3.00;
            } else if (nameFruit.equals("pineapple")) {
                price = 5.60;
            } else if (nameFruit.equals("grapes")) {
                price = 4.20;
            } else {
                isValidData = true;
            }
        } else {
            isValidData = true;
        }
        if (isValidData) {
            System.out.println("error");
        } else {
            double sum = price * quantity;
            System.out.printf("%.2f", sum);
        }
    }
}