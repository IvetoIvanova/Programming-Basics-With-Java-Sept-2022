package F01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChicken = Integer.parseInt(scanner.nextLine());
        int numberOfFishMenu = Integer.parseInt(scanner.nextLine());
        int numberOfVegMenu = Integer.parseInt(scanner.nextLine());
        double amountChicken = numberOfChicken * 10.35;
        double amountFishMenu = numberOfFishMenu * 12.40;
        double amountVegMenu = numberOfVegMenu * 8.15;
        double TotalPriceWithoutDelivery = amountChicken + amountFishMenu + amountVegMenu;
        double dessert = TotalPriceWithoutDelivery * 0.20;
        System.out.println(TotalPriceWithoutDelivery + dessert + 2.50);
    }
}