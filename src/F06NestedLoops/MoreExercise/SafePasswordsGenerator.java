package F06NestedLoops.MoreExercise;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        char A = 35; // ASCII -> '#'
        char B = 64; // ASCII -> '@'
        int combinationsCount = 0;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                char firstChar = A;
                char secondChar = B;

                String password = "" + firstChar + secondChar + x + y + secondChar + firstChar;
                System.out.print(password + "|");

                combinationsCount++;

                if (combinationsCount >= maxPasswords) {
                    return;
                }

                A++;
                if (A > 55) {
                    A = 35;
                }

                B++;
                if (B > 96) {
                    B = 64;
                }
            }
        }
    }
}