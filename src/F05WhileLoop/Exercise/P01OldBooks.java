package F05WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int count = 0;

        String nextBook = scanner.nextLine();
        while (!(nextBook.equals("No More Books"))) {

            if (favouriteBook.equals(nextBook)) {
                break;
            }

            count++;
            nextBook = scanner.nextLine();
        }

        if (nextBook.equals(favouriteBook)) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }
    }
}