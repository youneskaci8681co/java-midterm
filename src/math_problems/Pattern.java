package math_problems;

public class Pattern {

    public static void main(String[] args) {
        int startNumber = 100;
        int decrementValue = 1;

        for (int i = startNumber; i >= 0; i -= decrementValue) {
            System.out.print(i + ", ");
            decrementValue += (i % 10 == 0) ? 2 : 0;
        }
    }
}
