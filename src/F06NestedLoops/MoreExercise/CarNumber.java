package F06NestedLoops.MoreExercise;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = start; firstDigit <= end; firstDigit++) {
            for (int secondDigit = start; secondDigit <= end; secondDigit++) {
                for (int thirdDigit = start; thirdDigit <= end; thirdDigit++) {
                    for (int fourthDigit = start; fourthDigit <= end; fourthDigit++) {
                        boolean condition1 = (firstDigit % 2 == 0 && fourthDigit % 2 != 0)
                                || (firstDigit % 2 != 0 && fourthDigit % 2 == 0);
                        boolean condition2 = firstDigit > fourthDigit;
                        boolean condition3 = (secondDigit + thirdDigit) % 2 == 0;

                        if (condition1 && condition2 && condition3) {
                            System.out.printf("%d%d%d%d ", firstDigit, secondDigit, thirdDigit, fourthDigit);
                        }
                    }
                }
            }
        }
    }
}