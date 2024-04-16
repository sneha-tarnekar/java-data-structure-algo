package Pattern;

/*

 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

 */
public class Pattern1 {

    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
