package Pattern;

/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern5 {

    public static void main(String[] args) {
        patternOptimized(5);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternOptimized(int n) {
        for (int i = 0; i < n * 2; i++) {

            int totalColsInRows = i < n ? i : n * 2 - i;

            for (int j = 0; j < totalColsInRows; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
