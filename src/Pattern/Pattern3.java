package Pattern;

/*

 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern3 {

    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
