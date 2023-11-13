package F04ForLoop.Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int countJury = Integer.parseInt(scanner.nextLine());

        for (int jury = 1; jury <= countJury; jury++) {
            String juryName = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());
            double givenPoints = (juryName.length() * pointsFromJury) / 2;
            pointsFromAcademy += givenPoints;

            if (pointsFromAcademy >= 1250.5) {
                break;
            }
        }

        if (pointsFromAcademy >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, pointsFromAcademy);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - pointsFromAcademy);
        }
    }
}