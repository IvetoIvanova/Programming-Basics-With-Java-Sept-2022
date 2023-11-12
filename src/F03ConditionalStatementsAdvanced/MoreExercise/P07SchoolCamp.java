package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int numStudents = Integer.parseInt(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());

        double priceForAllNights = 0;
        String typeSport = "";

        switch (season) {
            case "Winter":
                if (typeGroup.equals("girls")) {
                    priceForAllNights = numNights * 9.60 * numStudents;
                    typeSport = "Gymnastics";
                } else if (typeGroup.equals("boys")) {
                    priceForAllNights = numNights * 9.60 * numStudents;
                    typeSport = "Judo";
                } else if (typeGroup.equals("mixed")) {
                    priceForAllNights = numNights * 10.00 * numStudents;
                    typeSport = "Ski";
                }
                break;
            case "Spring":
                if (typeGroup.equals("girls")) {
                    priceForAllNights = numNights * 7.20 * numStudents;
                    typeSport = "Athletics";
                } else if (typeGroup.equals("boys")) {
                    priceForAllNights = numNights * 7.20 * numStudents;
                    typeSport = "Tennis";
                } else if (typeGroup.equals("mixed")) {
                    priceForAllNights = numNights * 9.50 * numStudents;
                    typeSport = "Cycling";
                }
                break;
            case "Summer":
                if (typeGroup.equals("girls")) {
                    priceForAllNights = numNights * 15.00 * numStudents;
                    typeSport = "Volleyball";
                } else if (typeGroup.equals("boys")) {
                    priceForAllNights = numNights * 15.00 * numStudents;
                    typeSport = "Football";
                } else if (typeGroup.equals("mixed")) {
                    priceForAllNights = numNights * 20.00 * numStudents;
                    typeSport = "Swimming";
                }
                break;
        }
        if (numStudents >= 50) {
            priceForAllNights = priceForAllNights - (priceForAllNights * 0.50);
        } else if (numStudents >= 20) {
            priceForAllNights = priceForAllNights - (priceForAllNights * 0.15);
        } else if (numStudents >= 10) {
            priceForAllNights = priceForAllNights - (priceForAllNights * 0.05);
        }

        System.out.printf("%s %.2f lv.", typeSport, priceForAllNights);
    }
}