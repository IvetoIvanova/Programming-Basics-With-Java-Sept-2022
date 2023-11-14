package F06NestedLoops.MoreExercise;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimit1 = Integer.parseInt(scanner.nextLine());
        int upperLimit2 = Integer.parseInt(scanner.nextLine());
        int upperLimit3 = Integer.parseInt(scanner.nextLine());

        for (int digit1 = 2; digit1 <= upperLimit1; digit1 += 2) {
            for (int digit2 = 2; digit2 <= upperLimit2; digit2++) {
                if (digit2 == 2 || digit2 == 3 || digit2 == 5 || digit2 == 7) {
                    for (int digit3 = 2; digit3 <= upperLimit3; digit3 += 2) {
                        System.out.printf("%d %d %d%n", digit1, digit2, digit3);
                    }
                }
            }
        }
    }
}