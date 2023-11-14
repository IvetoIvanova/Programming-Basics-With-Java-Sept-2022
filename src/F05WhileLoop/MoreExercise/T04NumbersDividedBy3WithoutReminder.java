package F05WhileLoop.MoreExercise;

public class T04NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {

        for (int i = 3; i <= 99; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}