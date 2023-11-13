package F04ForLoop.Exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int winCount = 0;
        for (int i = 0; i < numberOfTournaments; i++) {
            String position = scanner.nextLine();

            if (position.equals("W")) {
                points += 2000;
                winCount++;
            } else if (position.equals("F")) {
                points += 1200;
            } else if (position.equals("SF")) {
                points += 720;
            }
        }
        System.out.printf("Final points: %d", startPoints + points);
        System.out.println();
        System.out.printf("Average points: %d", points / numberOfTournaments);
        System.out.println();
        System.out.printf("%.2f%%", 1.0 * winCount / numberOfTournaments * 100);
    }
}