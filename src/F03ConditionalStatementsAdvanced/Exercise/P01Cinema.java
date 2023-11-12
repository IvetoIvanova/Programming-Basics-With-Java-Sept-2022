package F03ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        double income = 0.0;
        switch (type) {
            case "Premiere":
                income = row * col * 12.00;
                break;
            case "Normal":
                income = row * col * 7.50;
                break;
            case "Discount":
                income = row * col * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}