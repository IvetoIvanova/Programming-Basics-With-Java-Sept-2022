package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDaysOff = Integer.parseInt(scanner.nextLine());
        int minForWorkDay = 63;
        int minForFreeDays = 127;

        int freeTotalGame = numberOfDaysOff * minForFreeDays;
        int workDaysGame = (365 - numberOfDaysOff) * minForWorkDay;
        int totalGame = freeTotalGame + workDaysGame;
        int remainingMin = 30000 - totalGame;

        int hours = remainingMin / 60;
        int minutes = remainingMin % 60;

        if (totalGame > 30000) {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", Math.abs(hours), Math.abs(minutes));
        } else {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}