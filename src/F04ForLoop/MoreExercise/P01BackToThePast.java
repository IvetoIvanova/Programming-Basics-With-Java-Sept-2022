package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearLive = Integer.parseInt(scanner.nextLine());

        double oddYearSum = 0;
        double evenYearSum = 0;
        int yearsNow = 18;

        for (int i = 1800; i <= yearLive; i++) {

            if (i % 2 == 0) {
                evenYearSum += 12000;

            } else {
                oddYearSum += 12000 + (50 * yearsNow);

            }

            yearsNow = yearsNow + 1;
        }

        double totalSum = oddYearSum + evenYearSum;
        if (inheritedMoney >= totalSum) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney - totalSum);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", totalSum - inheritedMoney);
        }
    }
}