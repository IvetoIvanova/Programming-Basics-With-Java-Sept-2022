package F06NestedLoops.MoreExercise;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int males = Integer.parseInt(scanner.nextLine());
        int females = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        for (int male = 1; male <= males; male++) {
            for (int female = 1; female <= females; female++) {
                System.out.printf("(%d <-> %d) ", male, female);

                if ((male - 1) * females + female >= maxTables) {
                    break;
                }
            }

            if (male * females >= maxTables) {
                break;
            }
        }
    }
}