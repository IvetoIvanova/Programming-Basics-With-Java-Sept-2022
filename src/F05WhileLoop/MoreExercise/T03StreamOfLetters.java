package F05WhileLoop.MoreExercise;

import java.util.Scanner;

public class T03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countC = 0;
        int countO = 0;
        int countN = 0;
        int countCON = 0;
        String sumLetter = "";

        while (true) {
            String symbol = scanner.nextLine();


            if (symbol.equals("End")) {
                break;
            }


            if (symbol.equals("c")) {
                countC++;
                if (countC == 1) {
                    countCON++;
                }

                if (countC != 1) {
                    sumLetter += symbol;

                }
            } else if ("o".equals(symbol)) {
                countO++;
                if (countO == 1) {
                    countCON++;
                }

                if (countO != 1) {
                    sumLetter += symbol;

                }
            } else if (symbol.equals("n")) {
                countN++;
                if (countN == 1) {
                    countCON++;
                }

                if (countN != 1) {
                    sumLetter += symbol;

                }
            } else if (symbol.equals("A") || symbol.equals("a") || symbol.equals("B") || symbol.equals("b") || symbol.equals("C") || symbol.equals("D") || symbol.equals("d") || symbol.equals("E") || symbol.equals("e") || symbol.equals("F") || symbol.equals("f") || symbol.equals("G") || symbol.equals("g") || symbol.equals("H") || symbol.equals("h") || symbol.equals("I") || symbol.equals("i") || symbol.equals("J") || symbol.equals("j") || symbol.equals("K") || symbol.equals("k") || symbol.equals("L") || symbol.equals("l") || symbol.equals("M") || symbol.equals("m") || symbol.equals("N") || symbol.equals("O") || symbol.equals("P") || symbol.equals("p") || symbol.equals("Q") || symbol.equals("q") || symbol.equals("R") || symbol.equals("r") || symbol.equals("S") || symbol.equals("s") || symbol.equals("T") || symbol.equals("t") || symbol.equals("U") || symbol.equals("u") || symbol.equals("V") || symbol.equals("v") || symbol.equals("W") || symbol.equals("w") || symbol.equals("X") || symbol.equals("x") || symbol.equals("Y") || symbol.equals("y") || symbol.equals("Z") || symbol.equals("z")) {
                sumLetter += symbol;
            } else {
                continue;
            }

            if (countCON == 3) {
                System.out.printf(sumLetter + " ");
                countCON = 0;
                countC = 0;
                countN = 0;
                countO = 0;
                sumLetter = "";
            }
        }
    }
}