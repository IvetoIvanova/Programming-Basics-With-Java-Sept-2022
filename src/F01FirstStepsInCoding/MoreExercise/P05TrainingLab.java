package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wLengthMeters = Double.parseDouble(scanner.nextLine());
        double hWidthMeters = Double.parseDouble(scanner.nextLine());

        double wWithoutCorridor = hWidthMeters - 1;
        double deskOnRow = Math.floor(wWithoutCorridor / 0.7);
        double totalRows = Math.floor(wLengthMeters / 1.20);
        double result = Math.floor((deskOnRow * totalRows) - 3);
        System.out.printf("%.0f", result);
    }
}