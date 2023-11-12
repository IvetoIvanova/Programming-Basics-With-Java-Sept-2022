package F01FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DogsNumberOfPackages = Integer.parseInt(scanner.nextLine());
        int CatsNumberOfPackages = Integer.parseInt(scanner.nextLine());
        double dogsFood = DogsNumberOfPackages * 2.50;
        double catsFood = CatsNumberOfPackages * 4.0;

        double totalPrice = dogsFood + catsFood;
        System.out.printf("%f lv.", totalPrice);
    }
}