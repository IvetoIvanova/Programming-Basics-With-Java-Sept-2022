package F05WhileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int total = 0;

        while (total < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int wayHome = Integer.parseInt(scanner.nextLine());
                total = total + wayHome;
                break;
            }

            int current = Integer.parseInt(input);
            total = total + current;
        }

        if (total >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", total - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal);
        }
    }
}