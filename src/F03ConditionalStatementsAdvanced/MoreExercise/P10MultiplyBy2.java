package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        double number = Double.parseDouble(num);

        while (number >= 0) {
            double numb = Double.parseDouble(num);
            if (numb >= 0) {
                System.out.printf("Result: %.2f%n", numb * 2);
                num = scanner.nextLine();
                continue;
            }
            break;
        }
        System.out.println("Negative number!");
    }
}