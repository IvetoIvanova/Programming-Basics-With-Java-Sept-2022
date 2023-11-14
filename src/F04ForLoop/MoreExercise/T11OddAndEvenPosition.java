package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class T11OddAndEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += num;

                if (num > evenMax) {
                    evenMax = num;
                }

                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;

                if (num > oddMax) {
                    oddMax = num;
                }

                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);
        System.out.printf("OddMin=%s,%n", oddMin != 1000000000.0 ? String.format("%.2f", oddMin) : "No");
        System.out.printf("OddMax=%s,%n", oddMax != -1000000000.0 ? String.format("%.2f", oddMax) : "No");
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        System.out.printf("EvenMin=%s,%n", evenMin != 1000000000.0 ? String.format("%.2f", evenMin) : "No");
        System.out.printf("EvenMax=%s%n", evenMax != -1000000000.0 ? String.format("%.2f", evenMax) : "No");
    }
}