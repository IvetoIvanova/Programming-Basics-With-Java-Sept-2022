package F01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesInAnHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int pagesForDay = numberOfPages / numberOfDays;
        int hoursForDay = pagesForDay / pagesInAnHour;
        System.out.println(hoursForDay);
    }
}