package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int numOfDoctors = 7;
        int count = 0;

        for (int i = 0; period > i; i++) {
            int numOfPatients = Integer.parseInt(scanner.nextLine());
            count++;

            if (count == 3) {
                count = 0;
            }

            if (numOfPatients == numOfDoctors) {
                treatedPatients += numOfPatients;
            } else if (numOfPatients < numOfDoctors) {
                treatedPatients += numOfPatients;
            } else {
                untreatedPatients += numOfPatients - numOfDoctors;
                treatedPatients += numOfPatients - (numOfPatients - numOfDoctors);
            }

            if (count == 2) {

                if (untreatedPatients > treatedPatients) {
                    numOfDoctors++;
                }
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.%n", untreatedPatients);
    }
}