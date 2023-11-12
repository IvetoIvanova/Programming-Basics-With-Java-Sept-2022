package F03ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String assessment = scanner.nextLine();
        double nightPrice = 0.0;
        double nights = days - 1;
        double total = 0;

        switch (typeRoom) {
            case "room for one person":
                nightPrice = 18.0;
                total = nights * nightPrice;
                break;
            case "apartment":
                nightPrice = 25.0;
                total = nights * nightPrice;

                if (nights <= 10) {
                    total = total * 0.70;
                } else if (nights <= 15) {
                    total = total * 0.65;
                } else {
                    total = total * 0.50;
                }
                break;
            case "president apartment":
                nightPrice = 35.0;
                total = nightPrice * nights;

                if (nights <= 10) {
                    total = total * 0.90;
                } else if (nights <= 15) {
                    total = total * 0.85;
                } else {
                    total = total * 0.80;
                }
                break;
        }

        if (assessment.equals("positive")) {
            total = total * 1.25;
            System.out.printf("%.2f", total);
        } else if (assessment.equals("negative")) {
            total = total * 0.90;
            System.out.printf("%.2f", total);
        }
    }
}