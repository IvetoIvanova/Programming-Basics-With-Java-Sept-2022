package F01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double sneakers = annualFee - (0.40 * annualFee);
        double team = sneakers - (0.20 * sneakers);
        double Outfit = team / 4;
        double accessories = Outfit / 5;
        double totalPrice = annualFee + sneakers + team + Outfit + accessories;
        System.out.println(totalPrice);
    }
}