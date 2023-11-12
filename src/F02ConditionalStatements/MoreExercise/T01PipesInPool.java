package F02ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class T01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volumeInLiters = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        int litersPerHour = P1 + P2;
        double litersOfWaterForTheTime = litersPerHour * H;
        double P1litersForH = P1 * H;
        double P2litresForH = P2 * H;
        double P1percent = (P1litersForH / litersOfWaterForTheTime) * 100;
        double P2percent = (P2litresForH / litersOfWaterForTheTime) * 100;

        double percentageOfLitersFilled = (litersOfWaterForTheTime * 100) / volumeInLiters;
        double litersOverflowed = litersOfWaterForTheTime - volumeInLiters;

        if (volumeInLiters >= litersOfWaterForTheTime) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentageOfLitersFilled, P1percent, P2percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, litersOverflowed);
        }
    }
}