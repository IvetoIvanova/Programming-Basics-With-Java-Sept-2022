package F01FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());

        int neededTime = projects * 3;

        System.out.printf("The architect %s will need " + "%d hours to complete %d project/s.", name, neededTime, projects);
    }
}