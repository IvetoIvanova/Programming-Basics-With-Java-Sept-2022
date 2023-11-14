package F05WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double insteadLV = Double.parseDouble(scanner.nextLine());
        double insteadST = Math.round(insteadLV * 100);
        int countCoins = 0;

        while (insteadST > 0) {

            if (insteadST >= 200) {
                insteadST -= 200;
                countCoins++;
            } else if (insteadST >= 100) {
                insteadST -= 100;
                countCoins++;
            } else if (insteadST >= 50) {
                insteadST -= 50;
                countCoins++;
            } else if (insteadST >= 20) {
                insteadST -= 20;
                countCoins++;
            } else if (insteadST >= 10) {
                insteadST -= 10;
                countCoins++;
            } else if (insteadST >= 5) {
                insteadST -= 5;
                countCoins++;
            } else if (insteadST >= 2) {
                insteadST -= 2;
                countCoins++;
            } else if (insteadST >= 1) {
                insteadST -= 1;
                countCoins++;
            }

        }
        System.out.println(countCoins);
    }
}