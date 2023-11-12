package F03ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int minuteOfTheExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());
        int totalMin = examHour * 60 + minuteOfTheExam;
        int totalMinA = hourOfArrival * 60 + minuteOfArrival;
        int difference = totalMin - totalMinA;

        if (difference == 0) {
            System.out.println("On time");
        } else if (difference > 0 && difference <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(difference));
        } else if (difference < 0) {
            difference = Math.abs(difference);
            System.out.println("Late");

            if (difference >= 60) {
                examHour = difference / 60;
                minuteOfTheExam = difference % 60;
                System.out.printf("%d:%02d hours after the start", examHour, minuteOfTheExam);

            } else {
                System.out.printf("%d minutes after the start", difference);
            }
        } else {
            System.out.println("Early");

            if (difference >= 60) {
                examHour = difference / 60;
                minuteOfTheExam = difference % 60;
                System.out.printf("%d:%02d hours before the start", examHour, minuteOfTheExam);
            } else {
                System.out.printf("%d minutes before the start", difference);
            }
        }
    }
}