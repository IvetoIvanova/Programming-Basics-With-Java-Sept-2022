package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityOfTheStadium = Integer.parseInt(scanner.nextLine());
        int numOfAllFans = Integer.parseInt(scanner.nextLine());
        int fansInSectorA = 0;
        int fansInSectorB = 0;
        int fansInSectorV = 0;
        int fansInSectorG = 0;

        for (int i = 0; i < numOfAllFans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    fansInSectorA++;
                    break;
                case "B":
                    fansInSectorB++;
                    break;
                case "V":
                    fansInSectorV++;
                    break;
                case "G":
                    fansInSectorG++;
                    break;
            }
        }

        System.out.printf("%.2f%%%n", (fansInSectorA * 100.00) / numOfAllFans);
        System.out.printf("%.2f%%%n", (fansInSectorB * 100.00) / numOfAllFans);
        System.out.printf("%.2f%%%n", (fansInSectorV * 100.00) / numOfAllFans);
        System.out.printf("%.2f%%%n", (fansInSectorG * 100.00) / numOfAllFans);
        System.out.printf("%.2f%%%n", (numOfAllFans * 100.00) / capacityOfTheStadium);
    }
}