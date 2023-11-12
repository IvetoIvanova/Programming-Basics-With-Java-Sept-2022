package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numPeopleInTheGroup = Integer.parseInt(scanner.nextLine());

        double transport = 0;
        double ticketPrice = 0;
        double expense = 0;

        if ("VIP".equals(category)) {
            ticketPrice = numPeopleInTheGroup * 499.99;

            if (numPeopleInTheGroup >= 1 && numPeopleInTheGroup <= 4) {
                transport = 0.75 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 5 && numPeopleInTheGroup <= 9) {
                transport = 0.60 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 10 && numPeopleInTheGroup <= 24) {
                transport = 0.50 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 25 && numPeopleInTheGroup <= 49) {
                transport = 0.40 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 50) {
                transport = 0.25 * budget;
                expense = transport + ticketPrice;
            }

        } else if ("Normal".equals(category)) {
            ticketPrice = numPeopleInTheGroup * 249.99;

            if (numPeopleInTheGroup >= 1 && numPeopleInTheGroup <= 4) {
                transport = 0.75 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 5 && numPeopleInTheGroup <= 9) {
                transport = 0.60 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 10 && numPeopleInTheGroup <= 24) {
                transport = 0.50 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 25 && numPeopleInTheGroup <= 49) {
                transport = 0.40 * budget;
                expense = transport + ticketPrice;
            } else if (numPeopleInTheGroup >= 50) {
                transport = 0.25 * budget;
                expense = transport + ticketPrice;
            }
        }

        if (budget >= expense) {
            System.out.printf("Yes! You have %.2f leva left.", budget - expense);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", expense - budget);
        }
    }
}