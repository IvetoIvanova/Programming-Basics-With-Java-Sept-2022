package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        String fuelType = scanner.nextLine();
        double amountOfFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double totalPrice = 0;
        double price = 0;
        double Gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;

        if (amountOfFuel >= 20 && amountOfFuel <= 25) {

            if ("Yes".equals(clubCard) && "Gas".equals(fuelType)) {
                price = (gas - 0.08) * amountOfFuel;
                totalPrice = price - (price * 0.08);
            } else if ("Yes".equals(clubCard) && "Diesel".equals(fuelType)) {
                price = (diesel - 0.12) * amountOfFuel;
                totalPrice = price - (price * 0.08);
            } else if ("Yes".equals(clubCard) && "Gasoline".equals(fuelType)) {
                price = (Gasoline - 0.18) * amountOfFuel;
                totalPrice = price - (price * 0.08);
            } else if ("No".equals(clubCard) && "Gas".equals(fuelType)) {
                price = gas * amountOfFuel;
                totalPrice = price - (price * 0.08);
            } else if ("No".equals(clubCard) && "Diesel".equals(fuelType)) {
                price = diesel * amountOfFuel;
                totalPrice = price - (price * 0.08);
            } else if ("No".equals(clubCard) && "Gasoline".equals(fuelType)) {
                price = Gasoline * amountOfFuel;
                totalPrice = price - (price * 0.08);
            }

        } else if (amountOfFuel > 25) {

            if ("Yes".equals(clubCard) && "Gas".equals(fuelType)) {
                price = (gas - 0.08) * amountOfFuel;
                totalPrice = price - (price * 0.10);
            } else if ("Yes".equals(clubCard) && "Diesel".equals(fuelType)) {
                price = (diesel - 0.12) * amountOfFuel;
                totalPrice = price - (price * 0.10);
            } else if ("Yes".equals(clubCard) && "Gasoline".equals(fuelType)) {
                price = (Gasoline - 0.18) * amountOfFuel;
                totalPrice = price - (price * 0.10);
            } else if ("No".equals(clubCard) && "Gas".equals(fuelType)) {
                price = gas * amountOfFuel;
                totalPrice = price - (price * 0.10);
            } else if ("No".equals(clubCard) && "Diesel".equals(fuelType)) {
                price = diesel * amountOfFuel;
                totalPrice = price - (price * 0.10);
            } else if ("No".equals(clubCard) && "Gasoline".equals(fuelType)) {
                price = Gasoline * amountOfFuel;
                totalPrice = price - (price * 0.10);
            }

        } else if (amountOfFuel <= 19) {

            if ("Yes".equals(clubCard) && "Gas".equals(fuelType)) {
                price = (gas - 0.08) * amountOfFuel;
                totalPrice = price;
            } else if ("Yes".equals(clubCard) && "Diesel".equals(fuelType)) {
                price = (diesel - 0.12) * amountOfFuel;
                totalPrice = price;
            } else if ("Yes".equals(clubCard) && "Gasoline".equals(fuelType)) {
                price = (Gasoline - 0.18) * amountOfFuel;
                totalPrice = price;
            } else if ("No".equals(clubCard) && "Gas".equals(fuelType)) {
                totalPrice = gas * amountOfFuel;
            } else if ("No".equals(clubCard) && "Diesel".equals(fuelType)) {
                totalPrice = diesel * amountOfFuel;
            } else if ("No".equals(clubCard) && "Gasoline".equals(fuelType)) {
                totalPrice = Gasoline * amountOfFuel;
            }

        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}