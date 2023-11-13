package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int maxDiff = 0;
        boolean isEqual = true;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            int currentSum = num1 + num2;

            if (i > 0) {
                int currentDiff = Math.abs(currentSum - (sum1 + sum2));
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff;
                }

                if (currentSum != (sum1 + sum2)) {
                    isEqual = false;
                }
            }

            sum1 = num1;
            sum2 = num2;
        }

        if (isEqual) {
            System.out.printf("Yes, value=%d", sum1 + sum2);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}