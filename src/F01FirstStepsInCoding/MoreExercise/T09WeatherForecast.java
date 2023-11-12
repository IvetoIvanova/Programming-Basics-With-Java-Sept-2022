package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class T09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if ("sunny".equals(weather)) {
            System.out.print("It's warm outside!");
        } else {
            System.out.print("It's cold outside!");
        }
    }
}