package F06NestedLoops.MoreExercise;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsOnOddRow = Integer.parseInt(scanner.nextLine());

        int totalSeats = 0;

        for (char sector = 'A'; sector <= lastSector; sector++) {
            for (int row = 1; row <= rowsInFirstSector; row++) {
                int seatsOnRow = (row % 2 == 1) ? seatsOnOddRow : seatsOnOddRow + 2;

                for (int seat = 1; seat <= seatsOnRow; seat++) {
                    char seatLetter = (char) ('a' + seat - 1);
                    System.out.printf("%c%d%s%n", sector, row, seatLetter);
                    totalSeats++;
                }
            }
            rowsInFirstSector++;
        }

        System.out.println(totalSeats);
    }
}