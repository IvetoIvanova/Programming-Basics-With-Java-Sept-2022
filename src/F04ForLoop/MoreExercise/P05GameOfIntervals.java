package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfMoves = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double group1 = 0;
        double group2 = 0;
        double group3 = 0;
        double group4 = 0;
        double group5 = 0;
        double group6 = 0;

        for (int i = 0; i < numOfMoves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                points += 0.20 * number;
                group1++;
            } else if (number >= 10 && number <= 19) {
                points += 0.30 * number;
                group2++;
            } else if (number >= 20 && number <= 29) {
                points += 0.40 * number;
                group3++;
            } else if (number >= 30 && number <= 39) {
                points += 50.00;
                group4++;
            } else if (number >= 40 && number <= 50) {
                points += 100.00;
                group5++;
            } else {
                points -= points / 2.00;
                group6++;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", (group1 * 100) / numOfMoves);
        System.out.printf("From 10 to 19: %.2f%%%n", (group2 * 100) / numOfMoves);
        System.out.printf("From 20 to 29: %.2f%%%n", (group3 * 100) / numOfMoves);
        System.out.printf("From 30 to 39: %.2f%%%n", (group4 * 100) / numOfMoves);
        System.out.printf("From 40 to 50: %.2f%%%n", (group5 * 100) / numOfMoves);
        System.out.printf("Invalid numbers: %.2f%%%n", (group6 * 100) / numOfMoves);
    }
}