package F02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double destinationMeters = Double.parseDouble(scanner.nextLine());
        double secForOneMeter = Double.parseDouble(scanner.nextLine());

        double delayMeters = Math.floor(destinationMeters / 15);
        double delayTime = delayMeters * 12.5;
        double totalTime = (destinationMeters * secForOneMeter) + delayTime;

        double missingSec = Math.abs(totalTime - recordSec);

        if (totalTime < recordSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else if (totalTime >= recordSec) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", missingSec);
        }
    }
}