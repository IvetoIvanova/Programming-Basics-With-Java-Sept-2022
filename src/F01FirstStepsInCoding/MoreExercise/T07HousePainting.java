package F01FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class T07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double windowArea = 1.5 * 1.5;
        double bothSidesWithoutWindows = (2 * sideWall) - (2 * windowArea);
        double backWall = x * x;
        double door = 1.2 * 2;
        double bothBackAndFrontSides = (2 * backWall) - door;
        double totalArea = bothSidesWithoutWindows + bothBackAndFrontSides;
        double greenL = totalArea / 3.4;

        double bothRectanglesRoof = 2 * (x * y);
        double bothTriangleRoof = 2 * (x * h / 2);
        double totalAreaRoof = bothRectanglesRoof + bothTriangleRoof;
        double redL = totalAreaRoof / 4.3;

        System.out.printf("%.2f%n", greenL);
        System.out.printf("%.2f", redL);
    }
}