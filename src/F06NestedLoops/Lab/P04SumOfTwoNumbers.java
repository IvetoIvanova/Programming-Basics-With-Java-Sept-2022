package F06NestedLoops.Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        boolean isValidComb = false;
        int count = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                int sum = i + j;

                if (sum == magicNum) {
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, magicNum);
                    isValidComb = true;
                    break;
                }
            }

            if (isValidComb) {
                break;
            }
        }

        if (!isValidComb) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}