package F06NestedLoops.Exercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJurors = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();

        double allGradeSum = 0;
        int countPresentation = 0;

        while (!"Finish".equals(namePresentation)) {
            String presentation = namePresentation;
            countPresentation++;
            double averageGrade = 0.00;
            double sumOfGrades = 0;

            for (int i = 1; i <= numOfJurors; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                sumOfGrades += grades;
            }

            averageGrade = sumOfGrades / numOfJurors;
            allGradeSum += averageGrade;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);

            namePresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradeSum / countPresentation);
    }
}