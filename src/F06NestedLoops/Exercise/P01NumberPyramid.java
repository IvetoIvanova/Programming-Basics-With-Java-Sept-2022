package F06NestedLoops.Exercise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.printf(current + " ");
                current++;

                if (current > n) {
                    break;
                }

            }

            if (current > n) {
                break;
            }
            System.out.println();
        }
    }
}