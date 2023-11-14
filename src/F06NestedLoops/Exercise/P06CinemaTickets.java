package F06NestedLoops.Exercise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int allCountTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeat = Integer.parseInt(scanner.nextLine());

            int countTickets = 0;

            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;

                allCountTickets++;
                countTickets++;

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }

                if (freeSeat == countTickets) {
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, countTickets * 100.0 / freeSeat);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allCountTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 100.0 / allCountTickets);
    }
}