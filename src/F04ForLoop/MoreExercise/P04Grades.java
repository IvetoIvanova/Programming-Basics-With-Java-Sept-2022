package F04ForLoop.MoreExercise;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allStudentsOnExam = Integer.parseInt(scanner.nextLine());

        int countGroup1 = 0;
        int countGroup2 = 0;
        int countGroup3 = 0;
        int countGroup4 = 0;
        double sumOfAllGrades = 0.00;
        double averageGrade = 0.00;

        for (int i = 0; i < allStudentsOnExam; i++) {
            double examGrade = Double.parseDouble(scanner.nextLine());

            if (examGrade >= 2.00 && examGrade <= 2.99) {
                countGroup1++;
                sumOfAllGrades += examGrade;
            } else if (examGrade >= 3.00 && examGrade <= 3.99) {
                countGroup2++;
                sumOfAllGrades += examGrade;
            } else if (examGrade >= 4.00 && examGrade <= 4.99) {
                countGroup3++;
                sumOfAllGrades += examGrade;
            } else if (examGrade >= 5.00) {
                countGroup4++;
                sumOfAllGrades += examGrade;
            }

        }

        averageGrade = sumOfAllGrades / allStudentsOnExam;
        System.out.printf("Top students: %.2f%%%n", (countGroup4 * 100.00) / allStudentsOnExam);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (countGroup3 * 100.00) / allStudentsOnExam);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (countGroup2 * 100.00) / allStudentsOnExam);
        System.out.printf("Fail: %.2f%%%n", (countGroup1 * 100.00) / allStudentsOnExam);
        System.out.printf("Average: %.2f", averageGrade);
    }
}