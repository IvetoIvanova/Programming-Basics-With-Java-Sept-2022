package F05WhileLoop.Exercise;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDissatisfied = Integer.parseInt(scanner.nextLine());
        int numOfUnsatisfactoryGrades = 0;
        double sum = 0;
        int solvedProblemsCount = 0;
        String lastName = "";
        boolean isFailed = true;

        while (numOfUnsatisfactoryGrades < numOfDissatisfied) {
            String name = scanner.nextLine();

            if ("Enough".equals(name)) {
                isFailed = false;
                break;
            }

            int evaluation = Integer.parseInt(scanner.nextLine());
            if (evaluation <= 4) {
                numOfUnsatisfactoryGrades++;
            }

            sum = sum + evaluation;
            solvedProblemsCount++;
            lastName = name;

        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", numOfDissatisfied);
        } else {
            System.out.printf("Average score: %.2f%n", sum / solvedProblemsCount);
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s", lastName);
        }
    }
}