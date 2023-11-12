package F03ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonth = Double.parseDouble(scanner.nextLine());

        double salaryMonth = 0.0;
        double salary4Months = 0.0;
        double totalSalary = 0.0;

        if (kmMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salaryMonth = 0.75 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
                case "Summer":
                    salaryMonth = 0.90 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
                case "Winter":
                    salaryMonth = 1.05 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
            }
        } else if (kmMonth > 5000 && kmMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salaryMonth = 0.95 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
                case "Summer":
                    salaryMonth = 1.10 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
                case "Winter":
                    salaryMonth = 1.25 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
            }
        } else if (kmMonth > 10000 && kmMonth <= 20000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                case "Summer":
                case "Winter":
                    salaryMonth = 1.45 * kmMonth;
                    salary4Months = 4 * salaryMonth;
                    totalSalary = salary4Months - (0.10 * salary4Months);
                    break;
            }
        }
        System.out.printf("%.2f", totalSalary);
    }
}