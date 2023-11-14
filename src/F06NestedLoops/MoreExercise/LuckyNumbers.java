package F06NestedLoops.MoreExercise;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int sumFirstTwo = a + b;
                        int sumLastTwo = c + d;

                        if (sumFirstTwo == sumLastTwo && n % sumFirstTwo == 0) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }
                    }
                }
            }
        }
    }
}