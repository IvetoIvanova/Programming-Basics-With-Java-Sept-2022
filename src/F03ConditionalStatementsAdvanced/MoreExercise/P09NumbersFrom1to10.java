package F03ConditionalStatementsAdvanced.MoreExercise;

public class P09NumbersFrom1to10 {
    public static void main(String[] args) {
        int a = 1;

        while (true) {
            System.out.printf("%d%n", a);
            a++;

            if (a > 10) {
                break;
            }
        }
    }
}