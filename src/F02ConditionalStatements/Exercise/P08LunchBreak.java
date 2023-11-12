package F02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int durationOfRest = Integer.parseInt(scanner.nextLine());

        double timeLunch = durationOfRest / 8.0;
        double timeBreak = durationOfRest / 4.0;
        double timeForFilm = durationOfRest - timeLunch - timeBreak;
        double necessaryTime = episodeDuration - timeForFilm;

        if (timeForFilm >= episodeDuration) {
            System.out.printf("You have enough time to watch %s " + "and left with %.0f minutes free time.", name, Math.ceil(timeForFilm - episodeDuration));

        } else {
            System.out.printf("You don't have enough time to watch %s" + ", you need %.0f more minutes.", name, Math.ceil(necessaryTime));

        }
    }
}