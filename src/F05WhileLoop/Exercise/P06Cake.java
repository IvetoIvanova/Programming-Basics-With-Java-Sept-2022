package F05WhileLoop.Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int totalPieces = length * width;
        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int currentPieces = Integer.parseInt(input);
            totalPieces = totalPieces - currentPieces;

            if (totalPieces <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (totalPieces <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        } else {
            System.out.printf("%d pieces are left.", totalPieces);
        }
    }
}