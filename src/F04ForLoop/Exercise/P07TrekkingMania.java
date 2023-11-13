package F04ForLoop.Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numOfGroups; i++) {
            int numberOfClimbersInGroup = Integer.parseInt(scanner.nextLine());

            if (numberOfClimbersInGroup <= 5) {
                musala += numberOfClimbersInGroup;
            } else if (numberOfClimbersInGroup <= 12) {
                monblan += numberOfClimbersInGroup;
            } else if (numberOfClimbersInGroup <= 25) {
                kilimandjaro += numberOfClimbersInGroup;
            } else if (numberOfClimbersInGroup <= 40) {
                k2 += numberOfClimbersInGroup;
            } else if (numberOfClimbersInGroup >= 41) {
                everest += numberOfClimbersInGroup;
            }
        }

        int totalClimbers = musala + monblan + kilimandjaro + k2 + everest;
        System.out.printf("%.2f%%%n", (musala * 1.00 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (monblan * 1.00 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (kilimandjaro * 1.00 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (k2 * 1.00 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (everest * 1.00 / totalClimbers) * 100);
    }
}