package F05WhileLoop.MoreExercise;

import java.util.Scanner;

public class T05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int countNum = 0;
        double sumSecondNum = 0;

        while (number > countNum) {
            int secondNum = Integer.parseInt(scanner.nextLine());
            countNum++;
            sumSecondNum += secondNum;
        }
        System.out.printf("%.2f", sumSecondNum / number);
    }
}